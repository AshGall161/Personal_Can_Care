package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Research_Book_Recommend extends AppCompatActivity implements View.OnClickListener {

        private Button btnSubmit;
        private Button btnViewAll;
        private Button btnAdditionalSvcs;
        private Button btnHome;
        private EditText et_authorName;
        private EditText et_bookTitle;
        private EditText et_bookLocation;


        FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_book_recommend);

        et_authorName = findViewById(R.id.et_authorName);
        et_bookTitle = findViewById(R.id.et_bookTitle);
        et_bookLocation = findViewById(R.id.et_bookLocation);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnViewAll = findViewById(R.id.btnViewAll);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);

        btnSubmit.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }


    public void sendToDB() {

        String authorName = et_authorName.getText().toString();
        String bookTitleName = et_bookTitle.getText().toString();
        String bookLocationName = et_bookLocation.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("author", authorName);
        reading.put("bookTitle", bookTitleName);
        reading.put("bookLocation", bookLocationName);

        // Add a new document with a generated ID
        db.collection("Book")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(this, "Book successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.btnSubmit) {
            sendToDB();
        }else if (id == R.id.btnViewAll) {
            startActivity(new Intent(this, DietRecommendShow.class));
        }else if (id == R.id.btnAdditionalSvcs) {
            startActivity(new Intent(this, AdditionalSvcs.class));
        }else if (id == R.id.btnHome) {
            startActivity(new Intent(this, MainActivity.class));
        }

    }

}