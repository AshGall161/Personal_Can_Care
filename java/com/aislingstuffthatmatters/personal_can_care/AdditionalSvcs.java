package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdditionalSvcs extends AppCompatActivity implements View.OnClickListener {

    private Button btnAbout;
    private Button btnAccessories;
    private Button btnDiet;
    private Button btnHelp;
    private Button btnResearch;
    private Button btnShops;
    private Button btnWellness;
    private Button btnNecessarySvcs;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_svcs);

        btnAbout = findViewById(R.id.btnAbout);
        btnAccessories = findViewById(R.id.btnAccessories);
        btnDiet = findViewById(R.id.btnDiet);
        btnHelp = findViewById(R.id.btnHelp);
        btnResearch = findViewById(R.id.btnResearch);
        btnShops = findViewById(R.id.btnShops);
        btnWellness = findViewById(R.id.btnWellness);
        btnNecessarySvcs = findViewById(R.id.btnNecessarySvcs);
        btnHome = findViewById(R.id.btnHome);

        btnAbout.setOnClickListener((View.OnClickListener) this);
        btnAccessories.setOnClickListener(this);
        btnDiet.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
        btnResearch.setOnClickListener(this);
        btnShops.setOnClickListener(this);
        btnWellness.setOnClickListener(this);
        btnNecessarySvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAbout:
                Intent goToAbout = new Intent(AdditionalSvcs.this, About.class);
                startActivity(goToAbout);
                break;

            case R.id.btnAccessories:
                Intent goToAccessories = new Intent(AdditionalSvcs.this, Accessories.class);
                startActivity(goToAccessories);
                break;

            case R.id.btnDiet:
                Intent goToDiet = new Intent(AdditionalSvcs.this, Diet.class);
                startActivity(goToDiet);
                break;

            case R.id.btnHelp:
                Intent goToHelp = new Intent(AdditionalSvcs.this, Help.class);
                startActivity(goToHelp);
                break;

            case R.id.btnResearch:
                Intent goToResearch = new Intent(AdditionalSvcs.this, Research.class);
                startActivity(goToResearch);
                break;

            case R.id.btnShops:
                Intent goToShops = new Intent(AdditionalSvcs.this, Shop.class);
                startActivity(goToShops);
                break;

            case R.id.btnWellness:
                Intent goToWellness = new Intent(AdditionalSvcs.this, Wellness.class);
                startActivity(goToWellness);
                break;

            case R.id.btnNecessarySvcs:
                Intent goToNecessarySvcs = new Intent(AdditionalSvcs.this, NecessarySvcs.class);
                startActivity(goToNecessarySvcs);
                break;

            case R.id.btnHome:
                Intent goToHome = new Intent(AdditionalSvcs.this, MainActivity.class);
                startActivity(goToHome);
                break;

        }

    }

}