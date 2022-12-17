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

public class WellnessRecommend extends AppCompatActivity implements View.OnClickListener {

    private EditText et_wellnessRecommendName;
    private EditText et_wellnessRecommendLocation;
    private EditText et_wellnessRecommendDesc;
    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness_recommend);

        et_wellnessRecommendName = findViewById(R.id.et_wellnessRecommendName);
        et_wellnessRecommendLocation = findViewById(R.id.et_wellnessRecommendLocation);
        et_wellnessRecommendDesc = findViewById(R.id.et_wellnessRecommendDesc);
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

        String wellName = et_wellnessRecommendName.getText().toString();
        String wellLocateName = et_wellnessRecommendLocation.getText().toString();
        String wellnessDescName = et_wellnessRecommendDesc.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("name", wellName);
        reading.put("location", wellLocateName);
        reading.put("description", wellnessDescName);

        // Add a new document with a generated ID

        db.collection("Wellness")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(WellnessRecommend.this, "Wellness recommendation successfully added!",
                        Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(WellnessRecommend.this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_submit:
                sendToDB();
                break;

            case R.id.btn_viewAll:
                startActivity(new Intent(WellnessRecommend.this, WellnessRecommendShow.class));
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