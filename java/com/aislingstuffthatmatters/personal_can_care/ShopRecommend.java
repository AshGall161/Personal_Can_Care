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

public class ShopRecommend extends AppCompatActivity implements View.OnClickListener {

    private EditText et_shopName;
    private EditText et_shopLocation;
    private EditText et_shopDescription;
    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_recommend);

        et_shopName = findViewById(R.id.et_shopName);
        et_shopLocation = findViewById(R.id.et_shopLocation);
        et_shopDescription = findViewById(R.id.et_shopDescription);
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

        String shopName = et_shopName.getText().toString();
        String shopLocationName = et_shopLocation.getText().toString();
        String shopDescName = et_shopDescription.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("name", shopName);
        reading.put("location", shopLocationName);
        reading.put("description", shopDescName);

        // Add a new document with a generated ID

        db.collection("Shops")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(ShopRecommend.this, "Shop recommendation successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(ShopRecommend.this, "Error!", Toast.LENGTH_SHORT).show());

    }

    @Override
    public void onClick (View v){

        switch (v.getId()) {

            case R.id.btn_submit:
                sendToDB();
                break;

            case R.id.btn_viewAll:
                startActivity(new Intent(ShopRecommend.this, ShopRecommendShow.class));
                break;

            case R.id.btnAdditionalSvcs:
                Intent goToAdditionalSvcs = new Intent(ShopRecommend.this, AdditionalSvcs.class);
                startActivity(goToAdditionalSvcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(ShopRecommend.this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }


}