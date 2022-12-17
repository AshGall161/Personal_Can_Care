package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Research extends AppCompatActivity implements View.OnClickListener {

    private Button btnBooks;
    private Button btnVideo;
    private Button btnLibrary;
    private Button btnHome;
    private Button btnAdditionalSvcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);

        btnBooks = findViewById(R.id.btnBooks);
        btnVideo = findViewById(R.id.btnVideo);
        btnLibrary = findViewById(R.id.btnLibrary);
        btnHome = findViewById(R.id.btnHome);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);

        btnBooks.setOnClickListener(this);
        btnVideo.setOnClickListener(this);
        btnLibrary.setOnClickListener(this::browser1);
        btnHome.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);

    }

    public void browser1(View v){

        Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.donegallibrary.ie/"));
        startActivity(browser1);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnBooks:
                Intent goToBooks = new Intent(this, ResearchBook.class);
                startActivity(goToBooks);
                break;

            case R.id.btnVideo:
                Intent goToVideo = new Intent(this, ResearchVideo.class);
                startActivity(goToVideo);
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