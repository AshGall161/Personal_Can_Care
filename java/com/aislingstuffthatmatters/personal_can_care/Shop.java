package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity implements View.OnClickListener  {

    private Button btnSiopaMhici;
    private Button btnGallaghersFB;
    private Button btnHealthwise;
    private Button btnHealthwiseFB;
    private Button btnTotalHealth;
    private Button btnTotalHealthFB;
    private Button btnSleepyPawsFB;
    private Button btnAdditionalSvcs;
    private Button btnHome;
    private Button btnAddShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        btnSiopaMhici = findViewById(R.id.btnSiopaMhici);
        btnGallaghersFB = findViewById(R.id.btnGallaghersFB);
        btnHealthwise = findViewById(R.id.btnHealthwise);
        btnHealthwiseFB = findViewById(R.id.btnHealthwiseFB);
        btnTotalHealth = findViewById(R.id.btnTotalHealth);
        btnTotalHealthFB = findViewById(R.id.btnTotalHealthFB);
        btnSleepyPawsFB = findViewById(R.id.btnSleepyPawsFB);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);
        btnAddShop = findViewById(R.id.btnAddShop);

        btnSiopaMhici.setOnClickListener(this::browser1);
        btnHealthwise.setOnClickListener(this::browser1);
        btnTotalHealth.setOnClickListener(this::browser1);
        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnAddShop.setOnClickListener(this);

        btnGallaghersFB.setOnClickListener(v -> goToFacebookPage("580755625294906"));

        btnHealthwiseFB.setOnClickListener(v -> goToFacebookPage("137058993037014"));

        btnTotalHealthFB.setOnClickListener(v -> goToFacebookPage("673661319313106"));

        btnSleepyPawsFB.setOnClickListener(v -> goToFacebookPage("297658187269981"));

}

    private void goToFacebookPage(String id) {

        switch (id) {
            case "580755625294906":  // changed from id == "580755625294906") then system asked to merge all cases
            case "137058993037014":
            case "673661319313106":
            case "297658187269981":
                Intent goToFBPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
                startActivity(goToFBPageIntent);
                break;
        }

    }

    @SuppressLint("NonConstantResourceId")
    public void browser1(View v){

        switch(v.getId()){

            case R.id.btnSiopaMhici:
                Intent goToMicis = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.siopamhici.ie/"));
                startActivity(goToMicis);
                break;

            case R.id.btnHealthwise:
                Intent goToHealthwise = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gaothdobhair.ie/en/gweedore-pharmacy-healthwise"));
                startActivity(goToHealthwise);
                break;

            case R.id.btnTotalHealth:
                Intent goToTotalHealth = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.totalhealth.ie/"));
                startActivity(goToTotalHealth);
                break;

        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAddShop:
                Intent goToAddShop = new Intent(this, ShopRecommend.class);
                startActivity(goToAddShop);
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