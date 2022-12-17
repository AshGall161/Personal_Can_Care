package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wellness extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdditionalSvcs;
    private Button btnHome;
    private Button btn_AddWellness;
    private Button btnAtlantic_GymFB;
    private Button btnComhcheol;
    private Button btnDgl_Yoga_Retreats;
    private Button btnSocial_Prescribing;
    private Button btnSocial_Prescribing2;
    private Button btnWholistic_Healing;
    private Button btnSoul_TreeFB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness);

        //instantiate my buttons
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);
        btn_AddWellness = findViewById(R.id.btn_AddWellness);
        btnAtlantic_GymFB = findViewById(R.id.btnAtlantic_GymFB);
        btnComhcheol = findViewById(R.id.btnComhcheol);
        btnDgl_Yoga_Retreats = findViewById(R.id.btnDgl_Yoga_Retreats);
        btnSocial_Prescribing = findViewById(R.id.btnSocial_Prescribing);
        btnSocial_Prescribing2 = findViewById(R.id.btnSocial_Prescribing2);
        btnWholistic_Healing = findViewById(R.id.btnWholistic_Healing);
        btnSoul_TreeFB = findViewById(R.id.btnSoulTreeFB);

        // Set an event handler for the Button
        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btn_AddWellness.setOnClickListener(this);
        btnComhcheol.setOnClickListener(this::browser1);
        btnDgl_Yoga_Retreats.setOnClickListener(this::browser1);
        btnSocial_Prescribing.setOnClickListener(this::browser1);
        btnWholistic_Healing.setOnClickListener(this::browser1);
        btnSoul_TreeFB.setOnClickListener(this::browser1);

        btnSocial_Prescribing2.setOnClickListener(v -> goToFacebookPage("273228876030113"));

        btnAtlantic_GymFB.setOnClickListener(v -> goToFacebookPage("1363532200332358"));

        btnSoul_TreeFB.setOnClickListener(v -> goToFacebookPage("293717107679503"));

    }

    private void goToFacebookPage(String id) {

        switch (id) {
            case "273228876030113":
            case "1363532200332358":
            case "1074902995856544":
            case "2220391788200892":
            case "293717107679503":
            case "1185518158499389":
                Intent goToFBPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
                startActivity(goToFBPageIntent);
                break;
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void browser1(View v) {

        switch (v.getId()) {

            case R.id.btnComhcheol:
                Intent goToComhcheol = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.comhcheol.ie/inspiration"));
                startActivity(goToComhcheol);
                break;

            case R.id.btnDgl_Yoga_Retreats:
                Intent goToDgl_Yoga_Retreats = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.donegalyogaretreats.com/"));
                startActivity(goToDgl_Yoga_Retreats);
                break;

            case R.id.btnWholistic_Healing:
                Intent goToWholistic_Healing = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wholistichouseofhealing.com/"));
                startActivity(goToWholistic_Healing);
                break;

            case R.id.btnSocial_Prescribing:
                Intent goToSocial_Prescribing = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hse.ie/eng/health/hl/selfmanagement/donegal/programmes-services/social-prescribing/"));
                startActivity(goToSocial_Prescribing);
                break;

        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_AddWellness:
                Intent goToAddWellness = new Intent(this, WellnessRecommend.class);
                startActivity(goToAddWellness);
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