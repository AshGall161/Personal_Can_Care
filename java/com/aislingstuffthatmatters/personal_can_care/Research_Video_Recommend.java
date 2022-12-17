package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Research_Video_Recommend extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private Button btnViewAll;
    private Button btnAdditionalSvcs;
    private Button btnHome;
    private EditText et_videoTitle;
    private EditText et_videoLocation;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_video_recommend);

        et_videoTitle = findViewById(R.id.et_videoTitle);
        et_videoLocation = findViewById(R.id.et_videoLocation);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnViewAll = findViewById(R.id.btnViewAll);
        btnAdditionalSvcs = findViewById(R.id.btnAdditionalSvcs);
        btnHome = findViewById(R.id.btnHome);

        btnSubmit.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnAdditionalSvcs.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }


    public void sendToDB() {

        String videoName = et_videoTitle.getText().toString();
        String videoLocationName = et_videoLocation.getText().toString();

        // Create a new reading with a first and last name
        Map<String, Object> reading = new HashMap<>();
        reading.put("video", videoName);
        reading.put("videoLocation", videoLocationName);

        // Add a new document with a generated ID
        db.collection("Video")
                .add(reading)
                .addOnSuccessListener(documentReference -> Toast.makeText(this, "Video successfully added!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show());



    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.btnSubmit) {
            sendToDB();
        }else if (id == R.id.btnViewAll) {
            startActivity(new Intent(this, DietRecommendShow.class));
        }else if (id == R.id.btnAdditionalSvcs) {
            startActivity(new Intent(this, AdditionalSvcs.class));
        }else if (id == R.id.btnHome) {
            startActivity(new Intent(this, MainActivity.class));
        }

    }

}