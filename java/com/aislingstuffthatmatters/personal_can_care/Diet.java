package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diet extends AppCompatActivity implements View.OnClickListener {

    private Button btnLovingItVegan;
    private Button btnCillUlta;
    private Button btnCillUltaFB;
    private Button btnCaifeKittyFB;
    private Button btnAdditionalSvcs;
    private Button btnHome;
    private Button btnAddFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        btnLovingItVegan = findViewById(R.id.btnLovingItVegan);
        btnCillUlta = findViewById(R.id.btnCillUlta);
        btnCillUltaFB = findViewById(R.id.btnCillUltaFB);
        btnCaifeKittyFB = findViewById(R.id.btnCaifeKittyFB);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);
        btnAddFood = findViewById(R.id.btnAddFood);

        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnAddFood.setOnClickListener(this);

        btnLovingItVegan.setOnClickListener(this::browser1);
        btnCillUlta.setOnClickListener(this::browser1);

        btnCaifeKittyFB.setOnClickListener(v -> goToFacebookPage("600479959974627"));
        btnCillUltaFB.setOnClickListener(v -> goToFacebookPage("101326241555190"));

    }


    //private void goToFacebookPage() {
    private void goToFacebookPage(String id){

        switch (id) {
            case "600479959974627":
            case "101326241555190":
                Intent goToFBPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
                startActivity(goToFBPageIntent);
                break;
        }

        /*try{
            Intent caifeKittyFB = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + "600479959974627"));
            startActivity(caifeKittyFB);
        }catch (ActivityNotFoundException e) {
            Intent intentCaifeKittyFB = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + "600479959974627"));
            startActivity(intentCaifeKittyFB);
        }*/
    }

    public void browser1(View v){

        switch (v.getId()) {

            case R.id.btnCillUlta:
                Intent goToCillUlta = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cillulta.ie/"));
                startActivity(goToCillUlta);
                break;

            case R.id.btnLovingItVegan:
                Intent goToLovingItVegan = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lovingitvegan.com/"));
                startActivity(goToLovingItVegan);
                break;
        }

        /*
        int id = v.getId();
        if (id == R.id.btnLovingItVegan) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://lovingitvegan.com/")));
        }*/

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAddFood:
                Intent goToAddFood = new Intent(Diet.this, DietRecommend.class);
                startActivity(goToAddFood);
                break;

            case R.id.btnAdditionalSvcs:
                Intent goToAdditionalSvcs = new Intent(Diet.this, AdditionalSvcs.class);
                startActivity(goToAdditionalSvcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(Diet.this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }

}