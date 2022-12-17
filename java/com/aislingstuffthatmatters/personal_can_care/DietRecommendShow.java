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

public class DietRecommendShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_DietRecommend;
    private DietAdapter dietAdapter;
    private List<DietModel> dietList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_recommend_show);

        recyclerView_DietRecommend = findViewById(R.id.recyclerView_DietRecommend);
        recyclerView_DietRecommend.setHasFixedSize(true);
        recyclerView_DietRecommend.setLayoutManager(new LinearLayoutManager(this));

        dietList = new ArrayList<>();
        dietAdapter = new DietAdapter(this, dietList);
        recyclerView_DietRecommend.setAdapter(dietAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Diet").get()
                .addOnCompleteListener(task -> {
                    dietList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        DietModel dietModel = new DietModel(snapshot.getString("diet"), snapshot.getString("dietLocation"),
                                snapshot.getString("dietDescription"));
                        dietList.add(dietModel);
                    }
                    dietAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(DietRecommendShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}