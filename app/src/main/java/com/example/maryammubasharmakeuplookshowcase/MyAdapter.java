package com.example.maryammubasharmakeuplookshowcase;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<Item> data;

    public MyAdapter(Context context, List<Item> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        Item items=data.get(position);
        holder.name.setText(items.getName());
        holder.date.setText(items.getDate());
        holder.title.setText(items.getTitle());
        holder.image.setImageResource(items.getImage());
       holder.post.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(v.getContext(),ArticlesDetailsActivity.class);
               intent.putExtra("title",items.getTitle());
               intent.putExtra("name", items.getName());
               intent.putExtra("date", items.getDate());
               intent.putExtra("image", items.getImage());
               v.getContext().startActivity(intent);
           }
       });}

    @Override
    public int getItemCount() {
        return data.size();
    }
}
