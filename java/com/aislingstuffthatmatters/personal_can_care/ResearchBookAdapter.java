package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ResearchBookAdapter extends RecyclerView.Adapter<ResearchBookAdapter.MyViewHolder>{

    private ResearchBookShow researchBookShow;
    private List<ResearchBookModel> bookList;


    public ResearchBookAdapter(){

    }

    public ResearchBookAdapter(ResearchBookShow researchBookShow, List<ResearchBookModel> bookList){
        this.researchBookShow = researchBookShow;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(researchBookShow).inflate(R.layout.item_research_books, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.author.setText(bookList.get(position).getAuthor());
        holder.bookTitle.setText(bookList.get(position).getBookTitle());

    }

    @Override
    public int getItemCount() {

        return bookList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView author;
        TextView bookTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            author = itemView.findViewById(R.id.author_txt);
            bookTitle = itemView.findViewById(R.id.bookTitle_txt);

        }
    }

}
