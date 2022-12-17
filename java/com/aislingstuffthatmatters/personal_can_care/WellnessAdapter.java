package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WellnessAdapter extends RecyclerView.Adapter<WellnessAdapter.MyViewHolder> {

    private WellnessRecommendShow wellnessRecommendShow;
    private List<WellnessModel> wellnessRecommendList;

    public WellnessAdapter() {

    }

    public WellnessAdapter(WellnessRecommendShow wellnessRecommendShow, List<WellnessModel> wellnessRecommendList) {
        this.wellnessRecommendShow = wellnessRecommendShow;
        this.wellnessRecommendList = wellnessRecommendList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(wellnessRecommendShow).inflate(R.layout.item_wellness, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.what.setText(wellnessRecommendList.get(position).getWhat());
        holder.where.setText(wellnessRecommendList.get(position).getWhere());
        holder.description.setText(wellnessRecommendList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {

        return wellnessRecommendList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView what;
        TextView where;
        TextView description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            what = itemView.findViewById(R.id.wellnessName_txt);
            where = itemView.findViewById(R.id.wellnessLocation_txt);
            description = itemView.findViewById(R.id.wellnessDesc_txt);
        }
    }


}
