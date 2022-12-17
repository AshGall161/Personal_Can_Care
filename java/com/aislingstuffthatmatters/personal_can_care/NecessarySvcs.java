package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NecessarySvcs extends AppCompatActivity implements View.OnClickListener {

    private Button btnHome;
    private Button btnAdditionalSvcs;
    private Button btnIonadFB;
    private Button btnCCW;
    private Button btnDaffodilCr;
    private Button btnIrishCancerSociety;
    private Button btnLGFB;
    private Button btnRelay;
    private Button btnMacmillan;
    private Button btnAddSvc;
    private Button btnMarieKeating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessary_svcs);

        btnHome = findViewById(R.id.btnHome);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnIonadFB = findViewById(R.id.btnIonadFB);
        btnCCW = findViewById(R.id.btnCCW);
        btnDaffodilCr = findViewById(R.id.btnDaffodilCr);
        btnIrishCancerSociety = findViewById(R.id.btnIrishCancerSociety);
        btnLGFB = findViewById(R.id.btnLGFB);
        btnRelay = findViewById(R.id.btnRelay);
        btnMacmillan = findViewById(R.id.btnMacmillan);
        btnAddSvc = findViewById(R.id.btnAddSvc);
        btnMarieKeating = findViewById(R.id.btnMarieKeating);

        btnHome.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);

        btnIonadFB.setOnClickListener(v -> goToFacebookPage());

        btnDaffodilCr.setOnClickListener(this::browser1);
        btnIrishCancerSociety.setOnClickListener(this::browser1);
        btnLGFB.setOnClickListener(this::browser1);
        btnCCW.setOnClickListener(this::browser1);
        btnRelay.setOnClickListener(this::browser1);
        btnMacmillan.setOnClickListener(this::browser1);
        btnMarieKeating.setOnClickListener(this::browser1);
        btnAddSvc.setOnClickListener(this);

    }

    private void goToFacebookPage() {  //(String id) is never used because only one entry, therefore ide suggested replacing it with ()

        Intent ionadFB = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + "273228876030113"));
        startActivity(ionadFB);

    }

    @SuppressLint("NonConstantResourceId")
    public void browser1(View v){

        switch(v.getId()){

            case R.id.btnDaffodilCr:
                Intent browser2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cancer.ie/cancer-information-and-support/cancer-support/find-support/local-support/daffodil-centre-letterkenny-university-hospital"));
                startActivity(browser2Intent);
                break;

            case R.id.btnIrishCancerSociety:
                Intent browser3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cancer.ie/"));
                startActivity(browser3Intent);
                break;

            case R.id.btnLGFB:
                Intent browser4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lookgoodfeelbetter.ie/"));
                startActivity(browser4Intent);
                break;

            case R.id.btnCCW:
                Intent browser5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cancercarewest.ie/"));
                startActivity(browser5Intent);
                break;

            case R.id.btnRelay:
                Intent browser6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://donegalrelayforlife.com/"));
                startActivity(browser6Intent);
                break;

            case R.id.btnMacmillan:
                Intent browser7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.macmillan.org.uk/"));
                startActivity(browser7Intent);
                break;

            case R.id.btnMarieKeating:
                Intent browser8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mariekeating.ie/"));
                startActivity(browser8Intent);
                break;

        }

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAddSvc:
                Intent goToAddSvc = new Intent(this, NecessarySvcsRecommend.class);
                startActivity(goToAddSvc);
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