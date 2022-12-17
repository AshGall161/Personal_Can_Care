package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ResearchVideoAdapter extends RecyclerView.Adapter<ResearchVideoAdapter.MyViewHolder> {

    private ResearchVideoShow researchVideoShow;
    private List<ResearchVideoModel> videoList;

    public ResearchVideoAdapter(){

    }

    public ResearchVideoAdapter(ResearchVideoShow researchVideoShow, List<ResearchVideoModel> videoList){
        this.researchVideoShow = researchVideoShow;
        this.videoList = videoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(researchVideoShow).inflate(R.layout.item_research_videos, parent, false);
        return new MyViewHolder(v);

    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.video.setText(videoList.get(position).getVideo());
        holder.videoLocation.setText(videoList.get(position).getVideoLocation());

    }

    @Override
    public int getItemCount() {

        return videoList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView video;
        TextView videoLocation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            video = itemView.findViewById(R.id.videoTitle_txt);
            videoLocation = itemView.findViewById(R.id.videoLocation_txt);

        }
    }

}
