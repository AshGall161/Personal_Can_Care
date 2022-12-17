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

public class AccessoryRecommend extends AppCompatActivity implements View.OnClickListener {

    private EditText et_accessoryName;
    private EditText et_accessoryLocation;
    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessory_recommend);

        et_accessoryName = findViewById(R.id.et_accessoryName);
        et_accessoryLocation = findViewById(R.id.et_accessoryLocation);
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

        String accessoryName = et_accessoryName.getText().toString();
        String accessoryLocationName = et_accessoryLocation.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>(); //the > reading = could also be set as user..
        reading.put("accessoryName", accessoryName);
        reading.put("accessoryLocation", accessoryLocationName);

        // Add a new document with a generated ID
        db.collection("Accessories")
                .add(reading)
                .addOnSuccessListener(documentReference-> Toast.makeText(AccessoryRecommend.this, "Accessory recommendation successfully added!",
                        Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(AccessoryRecommend.this, "Error, recommendation was not added!", Toast.LENGTH_SHORT).show());

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnSubmit:
                sendToDB();
                break;

            case R.id.btnViewAll:
                startActivity(new Intent(AccessoryRecommend.this, AccessoryShow.class));
                break;

            case R.id.btnAdditionalSvcs:
                Intent goToAdditionalSvcs = new Intent(AccessoryRecommend.this, AdditionalSvcs.class);
                startActivity(goToAdditionalSvcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(AccessoryRecommend.this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }

}