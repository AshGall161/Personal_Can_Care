package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class ResearchBook extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;
    private EditText et_author;
    private EditText et_bookTitle;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_book);

        et_author = findViewById(R.id.et_authorName);
        et_bookTitle = findViewById(R.id.et_bookTitle);
        btnSubmit = findViewById(R.id.btn_submit);
        btnViewAll = findViewById(R.id.btn_viewAll);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);

        btnSubmit.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);

    }

    public void sendToDB() {

        String authorName = et_author.getText().toString();
        String bookTitleName = et_bookTitle.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("author", authorName);
        reading.put("bookTitle", bookTitleName);

        // Add a new document with a generated ID
        db.collection("Books")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(ResearchBook.this, "Book successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(ResearchBook.this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_submit:
                sendToDB();
                break;

            case R.id.btn_viewAll:
                startActivity(new Intent(this, ResearchBookShow.class));//
                break;

            case R.id.btnAdditionalSvcs:
                Intent goToAdditionalSvcs = new Intent(this, AdditionalSvcs.class);
                startActivity(goToAdditionalSvcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }

}