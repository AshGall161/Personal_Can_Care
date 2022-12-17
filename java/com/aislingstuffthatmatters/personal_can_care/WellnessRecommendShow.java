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

public class WellnessRecommendShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_WellnessRecommend;
    private WellnessAdapter wellnessAdapter;
    private List<WellnessModel> wellnessList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness_recommend_show);

        recyclerView_WellnessRecommend = findViewById(R.id.recyclerView_WellnessRecommend);
        recyclerView_WellnessRecommend.setHasFixedSize(true);
        recyclerView_WellnessRecommend.setLayoutManager(new LinearLayoutManager(this));

        wellnessList = new ArrayList<>();
        wellnessAdapter = new WellnessAdapter(this, wellnessList);
        recyclerView_WellnessRecommend.setAdapter(wellnessAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Wellness").get()
                .addOnCompleteListener(task -> {
                    wellnessList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        WellnessModel wellnessModel = new WellnessModel(snapshot.getString("name"), snapshot.getString("location"),
                                snapshot.getString("description"));
                        wellnessList.add(wellnessModel);
                    }
                    wellnessAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(WellnessRecommendShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}