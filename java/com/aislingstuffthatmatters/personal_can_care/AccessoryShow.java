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

public class AccessoryShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recycerView_AccessoryRecommend;
    private AccessoryAdapter accessoryAdapter;
    private List<AccessoryModel> accessoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessory_show);

        recycerView_AccessoryRecommend = findViewById(R.id.recyclerView_AccessoryRecommend);
        recycerView_AccessoryRecommend.setHasFixedSize(true);
        recycerView_AccessoryRecommend.setLayoutManager(new LinearLayoutManager(this));

        accessoryList = new ArrayList<>();
        accessoryAdapter = new AccessoryAdapter(this, accessoryList);
        recycerView_AccessoryRecommend.setAdapter(accessoryAdapter);

        showData();

    }


    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Accessories").get()
                .addOnCompleteListener(task -> {
                    accessoryList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        AccessoryModel accessoryModel = new AccessoryModel(snapshot.getString("accessoryName"), snapshot.getString("accessoryLocation"));
                        accessoryList.add(accessoryModel);
                    }
                    accessoryAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(AccessoryShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }


}