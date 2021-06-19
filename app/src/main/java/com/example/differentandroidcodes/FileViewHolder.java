package com.example.differentandroidcodes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class FileViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public CardView container;
    public ImageView imageView;

    public FileViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.textFileName);
        container = itemView.findViewById(R.id.container);
        imageView = itemView.findViewById(R.id.img);

    }
}
