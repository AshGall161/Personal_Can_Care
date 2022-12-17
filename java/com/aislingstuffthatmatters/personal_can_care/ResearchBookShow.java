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

public class ResearchBookShow extends AppCompatActivity {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView_Book;
    private ResearchBookAdapter researchBookAdapter;
    private List<ResearchBookModel> researchBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_book_show);

        recyclerView_Book = findViewById(R.id.recyclerView_Book);
        recyclerView_Book.setHasFixedSize(true);
        recyclerView_Book.setLayoutManager(new LinearLayoutManager(this));

        researchBookList = new ArrayList<>();
        researchBookAdapter = new ResearchBookAdapter(this, researchBookList);
        recyclerView_Book.setAdapter(researchBookAdapter);

        showData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void showData() {

        db.collection("Books").get()
                .addOnCompleteListener(task -> {
                    researchBookList.clear();
                    for(DocumentSnapshot snapshot : task.getResult()){
                        ResearchBookModel researchBookModel = new ResearchBookModel(snapshot.getString("author"), snapshot.getString("bookTitle"));
                        researchBookList.add(researchBookModel);
                    }
                    researchBookAdapter.notifyDataSetChanged();
                }).addOnFailureListener(e -> Toast.makeText(ResearchBookShow.this, "Something went wrong!!", Toast.LENGTH_SHORT).show());

    }

}