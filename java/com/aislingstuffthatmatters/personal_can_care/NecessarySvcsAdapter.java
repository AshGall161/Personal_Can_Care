package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NecessarySvcsAdapter extends RecyclerView.Adapter<NecessarySvcsAdapter.MyViewHolder>{

    private NecessarySvcsRecommendShow necessarySvcsRecommendShow;
    private List<NecessarySvcsModel> necessarySvcsRecommendList;

    public NecessarySvcsAdapter(){

    }

    public NecessarySvcsAdapter(NecessarySvcsRecommendShow necessarySvcsRecommendShow, List<NecessarySvcsModel> necessarySvcsRecommendList){
        this.necessarySvcsRecommendShow = necessarySvcsRecommendShow;
        this.necessarySvcsRecommendList = necessarySvcsRecommendList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(necessarySvcsRecommendShow).inflate(R.layout.item_necessary_svcs, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.necessarySvcsName.setText(necessarySvcsRecommendList.get(position).getNecessarySvcsName());
        holder.necessarySvcsLocation.setText(necessarySvcsRecommendList.get(position).getNecessarySvcsLocation());
        holder.necessarySvcsDescription.setText(necessarySvcsRecommendList.get(position).getNecessarySvcsDescription());

    }

    @Override
    public int getItemCount() {

        return necessarySvcsRecommendList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView necessarySvcsName;
        TextView necessarySvcsLocation;
        TextView necessarySvcsDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            necessarySvcsName = itemView.findViewById(R.id.necessary_svc_name_txt);
            necessarySvcsLocation = itemView.findViewById(R.id.necessary_svc_location_txt);
            necessarySvcsDescription = itemView.findViewById(R.id.necessary_svc_description_txt);
        }
    }

}
