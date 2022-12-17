package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accessories extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdditionalSvcs;
    private Button btnHome;
    private Button btn_AccessoryRecommend;
    private Button btnGenesis;
    private Button btnPatrickGildea;
    private Button btnPatrickGildeaFB;
    private Button btnUrsulaHeadwear;
    private Button btnMcElhinneys;
    private Button btnBeautyByLisa;
    private Button btnNikkisBeautySalon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);
        btn_AccessoryRecommend = findViewById(R.id.btn_AccessoryRecommend);
        btnGenesis = findViewById(R.id.btnGenesis);
        btnPatrickGildea = findViewById(R.id.btnPatrickGildea);
        btnPatrickGildeaFB = findViewById(R.id.btnPatrickGildeaFB);
        btnUrsulaHeadwear = findViewById(R.id.btnUrsulasHeadwear);
        btnMcElhinneys = findViewById(R.id.btnMcElhinneys);
        btnBeautyByLisa = findViewById(R.id.btnBeautyByLisa);
        btnNikkisBeautySalon = findViewById(R.id.btnNikkisBeautySalon);

        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btn_AccessoryRecommend.setOnClickListener(this);
        btnGenesis.setOnClickListener(this::browser1);
        btnPatrickGildea.setOnClickListener(this::browser1);
        btnUrsulaHeadwear.setOnClickListener(this::browser1);
        btnMcElhinneys.setOnClickListener(this::browser1);

        btnPatrickGildeaFB.setOnClickListener(v -> goToFacebookPage("221345944547817"));

        btnBeautyByLisa.setOnClickListener(v -> goToFacebookPage("183620388327403"));

        btnNikkisBeautySalon.setOnClickListener(v -> goToFacebookPage("383246011834679"));

    }

    private void goToFacebookPage(String id) {

        switch (id) {
            case "221345944547817":
            case "183620388327403":
            case "383246011834679":
                Intent goToFBPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
                startActivity(goToFBPageIntent);
                break;
        }

    }

    @SuppressLint("NonConstantResourceId")
    public void browser1(View v) {

        switch (v.getId()) {

            case R.id.btnGenesis:
                Intent goToGenesis = new Intent(Intent.ACTION_VIEW, Uri.parse("https://genesissalon.ie/"));
                startActivity(goToGenesis);
                break;

            case R.id.btnPatrickGildea:
                Intent goToPatrick_Gildea = new Intent(Intent.ACTION_VIEW, Uri.parse("https://patrickgildea.ie/"));
                startActivity(goToPatrick_Gildea);
                break;

            case R.id.btnUrsulasHeadwear:
                Intent goToUrsulas_Headgear = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.headwear.ie/"));
                startActivity(goToUrsulas_Headgear);
                break;

            case R.id.btnMcElhinneys:
                Intent goToMcElhinneys = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mcelhinneys.com/"));
                startActivity(goToMcElhinneys);
                break;

        }

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_AccessoryRecommend:
                Intent goToAddAccessory = new Intent(this, AccessoryRecommend.class);
                startActivity(goToAddAccessory);
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