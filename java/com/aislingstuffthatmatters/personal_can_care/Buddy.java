package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Buddy extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText subject;
    private EditText feedback;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buddy);

    }

    public void sendClick(View v){

        name = findViewById(R.id.et_Name);
        email = findViewById(R.id.et_Email);
        subject = findViewById(R.id.et_Subject);
        feedback = findViewById(R.id.et_Feedback);
        btnSubmit = findViewById(R.id.btnSubmit);
        //btnSubmit.setOnClickListener(this);

        if(name.getText().toString().equals("")){
            name.setError("Mandatory field");
        }else if(email.getText().toString().equals("")){
            email.setError("Mandatory field");
        }else if(subject.getText().toString().equals("")) {
            subject.setError("Mandatory field");
        }else if(feedback.getText().toString().equals("")){
            feedback.setError("Mandatory field");
        }else{
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[] {"cancarebuddy@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, "Hi, \n"
                    + feedback.getText().toString() + "\n \nRegards, \n"
                    + email.getText().toString());

            try{
                startActivity(Intent.createChooser(i, "send mail"));
            }catch(android.content.ActivityNotFoundException ex){
                Toast.makeText(this, "No mail app found", Toast.LENGTH_SHORT).show();
            }catch(Exception ex){
                Toast.makeText(this, "Unexpected error" + ex.toString(), Toast.LENGTH_SHORT).show();
            }

        }

    }

}