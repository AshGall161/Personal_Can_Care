package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity implements View.OnClickListener {

    private Button btnBuddy;
    private Button btnFeedback;
    private Button btnHome;
    private Button btnAdditionalSvcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        btnBuddy= findViewById(R.id.btnBuddy);
        btnFeedback = findViewById(R.id.btnFeedback);
        btnHome = findViewById(R.id.btnHome);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);

        btnBuddy.setOnClickListener(this);
        btnFeedback.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnBuddy:
                Intent goToBuddy = new Intent(this, Buddy.class);
                startActivity(goToBuddy);
                break;

            case R.id.btnFeedback:
                Intent goToFeedback = new Intent(this, Feedback.class);
                startActivity(goToFeedback);
                break;

            case R.id.btnAdditionalSvcs:
                Intent goToAdditional_Svcs = new Intent(this, AdditionalSvcs.class);
                startActivity(goToAdditional_Svcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }
}