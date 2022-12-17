package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity implements View.OnClickListener {

    private Button btnHome;
    private Button btnAdditionalSvcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnHome = findViewById(R.id.btnHome);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);

        btnHome.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

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