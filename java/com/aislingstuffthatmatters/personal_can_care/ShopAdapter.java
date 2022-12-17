package com.aislingstuffthatmatters.personal_can_care;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.MyViewHolder> {

    private ShopRecommendShow shopRecommendShow;
    private List<ShopModel> shopRecommendList;

    public ShopAdapter(){

    }

    public ShopAdapter(ShopRecommendShow shopRecommendShow, List<ShopModel> shopRecommendList) {
        this.shopRecommendShow = shopRecommendShow;
        this.shopRecommendList = shopRecommendList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(shopRecommendShow).inflate(R.layout.item_shop, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.shopName.setText(shopRecommendList.get(position).getShopName());
        holder.shopLocation.setText(shopRecommendList.get(position).getShopLocation());
        holder.shopDescription.setText(shopRecommendList.get(position).getShopDescription());

    }

    @Override
    public int getItemCount() {

        return shopRecommendList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView shopName;
        TextView shopLocation;
        TextView shopDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            shopName = itemView.findViewById(R.id.shopName_txt);
            shopLocation = itemView.findViewById(R.id.shopLocation_txt);
            shopDescription = itemView.findViewById(R.id.shopDescription_txt);
        }
    }

}