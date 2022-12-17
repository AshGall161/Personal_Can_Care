package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AccessoryAdapter extends RecyclerView.Adapter<AccessoryAdapter.MyViewHolder> {


    private AccessoryShow accessoryShow;
    private List<AccessoryModel> accessoryList;

    public AccessoryAdapter() {

    }

    public AccessoryAdapter(AccessoryShow accessoryShow, List<AccessoryModel> accessoryList){
        this.accessoryShow = accessoryShow;
        this.accessoryList = accessoryList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(accessoryShow).inflate(R.layout.item_accessory, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.accessoryName.setText(accessoryList.get(position).getAccessoryName());
        holder.accessoryLocation.setText(accessoryList.get(position).getAccessoryLocation());
    }

    @Override
    public int getItemCount(){
        return accessoryList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView accessoryName;
        TextView accessoryLocation;

        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            accessoryName = itemView.findViewById(R.id.accessoryName_txt);
            accessoryLocation = itemView.findViewById(R.id.accessoryLocation_txt);
        }
    }


}