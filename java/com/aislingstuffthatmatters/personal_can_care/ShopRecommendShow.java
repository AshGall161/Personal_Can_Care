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

public class ShopRecommendShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_ShopRecommend;
    private ShopAdapter shopAdapter;
    private List<ShopModel> shopList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_recommend_show);

        recyclerView_ShopRecommend = findViewById(R.id.recyclerView_ShopRecommend);
        recyclerView_ShopRecommend.setHasFixedSize(true);
        recyclerView_ShopRecommend.setLayoutManager(new LinearLayoutManager(this));

        shopList = new ArrayList<>();
        shopAdapter = new ShopAdapter(this, shopList);
        recyclerView_ShopRecommend.setAdapter(shopAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Shops").get()
                .addOnCompleteListener(task -> {
                    shopList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        ShopModel shopModel = new ShopModel(snapshot.getString("name"), snapshot.getString("location"),
                                snapshot.getString("description"));
                        shopList.add(shopModel);
                    }
                    shopAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(ShopRecommendShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}