package com.example.maryammubasharmakeuplookshowcase;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView title;
    TextView name;
    TextView date;
    LinearLayout post;
    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
        name = itemView.findViewById(R.id.name);
        date = itemView.findViewById(R.id.date);
        post=itemView.findViewById(R.id.post);
    }


}
