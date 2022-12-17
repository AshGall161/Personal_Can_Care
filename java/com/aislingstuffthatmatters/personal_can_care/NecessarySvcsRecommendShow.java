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

public class NecessarySvcsRecommendShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_NecessarySvcsRecommend;
    private NecessarySvcsAdapter necessarySvcsAdapter;
    private List<NecessarySvcsModel> necessarySvcsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessary_svcs_recommend_show);

        recyclerView_NecessarySvcsRecommend = findViewById(R.id.recyclerView_NecessarySvcsRecommend);
        recyclerView_NecessarySvcsRecommend.setHasFixedSize(true);
        recyclerView_NecessarySvcsRecommend.setLayoutManager(new LinearLayoutManager(this));

        necessarySvcsList = new ArrayList<>();
        necessarySvcsAdapter = new NecessarySvcsAdapter(this, necessarySvcsList);
        recyclerView_NecessarySvcsRecommend.setAdapter(necessarySvcsAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("NecessarySvcs").get()
                .addOnCompleteListener(task -> {
                    necessarySvcsList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        NecessarySvcsModel necessarySvcsModel = new NecessarySvcsModel(snapshot.getString("name"), snapshot.getString("location"),
                                snapshot.getString("description"));
                        necessarySvcsList.add(necessarySvcsModel);
                    }
                    necessarySvcsAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(NecessarySvcsRecommendShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}