package com.aislingstuffthatmatters.personal_can_care;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class ResearchVideoShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_Video;
    private ResearchVideoAdapter researchVideoAdapter;
    private List<ResearchVideoModel> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_video_show);

        recyclerView_Video = findViewById(R.id.recyclerView_Video);
        recyclerView_Video.setHasFixedSize(true);
        recyclerView_Video.setLayoutManager(new LinearLayoutManager(this));

        videoList = new ArrayList<>();
        researchVideoAdapter = new ResearchVideoAdapter(this, videoList);
        recyclerView_Video.setAdapter(researchVideoAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Videos").get()
                .addOnCompleteListener(task -> {
                    videoList.clear();
                    for (DocumentSnapshot snapshot : task.getResult()) {
                        ResearchVideoModel videoModel = new ResearchVideoModel(snapshot.getString("video"), snapshot.getString("videoLocation"));
                        videoList.add(videoModel);
                    }
                    researchVideoAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(ResearchVideoShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}