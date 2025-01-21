package com.example.hm_21_1_2024;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyG extends RecyclerView.Adapter<MyG.MyViewHolder> {

    int[] mData;
    Context mContext;
    public MyG(Context context, int[] data){
        this.mContext = context;
        this.mData = data;
    }
    @NonNull
    @Override
    public MyG.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyG.MyViewHolder holder, int position) {
        holder.tv.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return this.mData.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv = itemView.findViewById(R.id.itemTextView);
            this.img = itemView.findViewById(R.id.imageView);
        }
    }
}