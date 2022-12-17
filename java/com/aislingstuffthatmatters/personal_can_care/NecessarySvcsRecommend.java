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

public class NecessarySvcsRecommend extends AppCompatActivity implements View.OnClickListener {

        private EditText et_necessarySvcsName;
        private EditText et_necessarySvcsLocation;
        private EditText et_necessarySvcsDescription;
        private Button btnSubmit;
        private Button btnViewAll;
        private Button btnAdditionalSvcs;
        private Button btnHome;

        FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessary_svcs_recommend);

        et_necessarySvcsName = findViewById(R.id.et_necessarySvcsName);
        et_necessarySvcsLocation = findViewById(R.id.et_necessarySvcsLocation);
        et_necessarySvcsDescription = findViewById(R.id.et_necessarySvcsDescription);
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

        String necessarySvcsName = et_necessarySvcsName.getText().toString();
        String necessarySvcsLocationName = et_necessarySvcsLocation.getText().toString();
        String necessarySvcsDescName = et_necessarySvcsDescription.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("name", necessarySvcsName);
        reading.put("location", necessarySvcsLocationName);
        reading.put("description", necessarySvcsDescName);

        // Add a new document with a generated ID

        db.collection("NecessarySvcs")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(NecessarySvcsRecommend.this, "Necessary Services recommendation successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(NecessarySvcsRecommend.this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @Override
    public void onClick (View v){

        switch (v.getId()) {

            case R.id.btn_submit:
                sendToDB();
                break;

            case R.id.btn_viewAll:
                startActivity(new Intent(NecessarySvcsRecommend.this, NecessarySvcsRecommendShow.class));
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