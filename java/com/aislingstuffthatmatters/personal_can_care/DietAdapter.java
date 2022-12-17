package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DietAdapter extends RecyclerView.Adapter<DietAdapter.MyViewHolder> {

    private DietRecommendShow dietRecommendShow;
    private List<DietModel> dietList;

    public DietAdapter(){

    }

    public DietAdapter(DietRecommendShow dietRecommendShow, List<DietModel> dietList){
        this.dietRecommendShow = dietRecommendShow;
        this.dietList = dietList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(dietRecommendShow).inflate(R.layout.item_diet, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.diet.setText(dietList.get(position).getDiet());
        holder.dietLocation.setText(dietList.get(position).getDietLocation());
        holder.dietDescription.setText(dietList.get(position).getDietDescription());

    }

    @Override
    public int getItemCount() {

        return dietList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView diet;
        TextView dietLocation;
        TextView dietDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            diet = itemView.findViewById(R.id.diet_txt);
            dietLocation = itemView.findViewById(R.id.dietLocation_txt);
            dietDescription = itemView.findViewById(R.id.dietDescription_txt);

        }
    }

}
