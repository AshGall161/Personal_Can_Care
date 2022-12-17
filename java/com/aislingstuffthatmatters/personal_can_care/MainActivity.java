package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtQuote;
    private Button btnShowQuote;
    private Button btnAdditionalSvcs;
    private Button btnNecessarySvcs;

    //GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQuote = findViewById(R.id.txtQuote);
        btnShowQuote = findViewById(R.id.btnShowQuote);

        btnShowQuote.setOnClickListener(v -> {
            QuoteServ quoteServe = new QuoteServ();
            txtQuote.setText(quoteServe.getRandomQuotes());
        });

        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnNecessarySvcs = findViewById(R.id.btnNecessarySvcs);

        btnAdditionalSvcs.setOnClickListener(this);
        btnNecessarySvcs.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAdditionalSvcs:
                Intent goToAbout = new Intent(this, AdditionalSvcs.class);
                startActivity(goToAbout);
                break;

           case R.id.btnNecessarySvcs:
                Intent goToNecessarySvcs = new Intent(this, NecessarySvcs.class);
                startActivity(goToNecessarySvcs);
                break;

        }

    }

}