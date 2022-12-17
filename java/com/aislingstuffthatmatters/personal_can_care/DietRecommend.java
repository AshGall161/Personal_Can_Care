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

public class DietRecommend extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;
    private EditText et_dietName;
    private EditText et_dietLocation;
    private EditText et_dietDescription;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_recommend);

        et_dietName = findViewById(R.id.et_dietName);
        et_dietLocation = findViewById(R.id.et_dietLocation);
        et_dietDescription = findViewById(R.id.et_dietDescription);
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

        String dietName = et_dietName.getText().toString();
        String dietLocationName = et_dietLocation.getText().toString();
        String dietDescriptionName = et_dietDescription.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("diet", dietName);
        reading.put("dietLocation", dietLocationName);
        reading.put("dietDescription", dietDescriptionName);

        // Add a new document with a generated ID
        db.collection("Diet")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(DietRecommend.this, "Food/diet/spice successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(DietRecommend.this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSubmit:
                sendToDB();
                break;

            case R.id.btnViewAll:
                startActivity(new Intent(DietRecommend.this, DietRecommendShow.class));
                break;

            case R.id.btnAdditionalSvcs:
                startActivity(new Intent(this, AdditionalSvcs.class));
                break;

            case R.id.btnHome:
                startActivity(new Intent(this, MainActivity.class));
                break;

        }

        /*
        int id = v.getId();
        if (id == R.id.btnSubmit) {
            sendToDB();
        }else if (id == R.id.btnViewAll) {
            startActivity(new Intent(DietRecommend.this, DietRecommendShow.class));
        }else if (id == R.id.btnAdditionalSvcs) {
            startActivity(new Intent(this, AdditionalSvcs.class));
        }else if (id == R.id.btnHome) {
            startActivity(new Intent(this, MainActivity.class));
        }*/

    }

}