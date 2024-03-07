package com.example.maryammubasharmakeuplookshowcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    MyAdapter adapter;
    List<Item> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = getItemData();
        adapter = new MyAdapter(this, data);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
    }


        private List<Item> getItemData(){
            List<Item> items=new ArrayList<>();
            Item item=new Item(
                    "How to Achieve the “Dewy” Look—Even in Winter!",
                    "BY KIANA MURDEN",
                    "January 12, 2024",

                    R.drawable.makeup1
            );
            items.add(item);

             item =new Item(
                    "HOW TO NAIL THE PERFECT NUDE MAKEUP LOOK IN 7 EASY STEPS",
                    "by Team BB",
                    "Feb 01, 2024",

                    R.drawable.makeup2
            );
             items.add(item);
            item =new Item(
                    "SOFT GLAM LOOKS YOU NEED TRY THIS SUMMER",
                    "by Team BB",
                    "Feb 07, 2023",

                    R.drawable.makeup3
            );
            items.add(item);
            item =new Item(
                    "SOFT GLAM LOOKS YOU NEED TRY THIS SUMMER",
                    "by Team BB",
                    "Feb 07, 2023",

                    R.drawable.makeup3
            );
            items.add(item);
            item =new Item(
                    "Fabulous Full Glam Makeup Looks To Flaunt This Fall",
                    "Maria B",
                    "March 07, 2022",

                    R.drawable.makeup4
            );
            items.add(item);item =new Item(
                    "Makeup looks like the pros ",
                    "Maria B",
                    "March 24, 2022",

                    R.drawable.makeup5
            );
            items.add(item);items.add(item);item =new Item(
                    "Glamorous Vintage Makeup Ideas ",
                    "Hailey can",
                    "April 02, 2022",

                    R.drawable.makeup6
            );
            items.add(item); items.add(item);items.add(item);item =new Item(
                    "Achieving the “No Makeup” Makeup Look ",
                    "Hailey can",
                    "April 24, 2022",

                    R.drawable.makeup7
            );
            items.add(item); items.add(item); items.add(item);items.add(item);item =new Item(
                    "How to create the perfect smoky eye for your eye shape ",
                    "Hailey can",
                    "April 24, 2022",

                    R.drawable.makeup8
            );
            items.add(item);items.add(item); items.add(item); items.add(item);items.add(item);item =new Item(
                    "A Step-by-Step Guide to Korean Natural Autumn Makeup  ",
                    "Hailey can",
                    "April 24, 2022",

                    R.drawable.makeup9
            );
            items.add(item);items.add(item);items.add(item); items.add(item); items.add(item);items.add(item);item =new Item(
                    "Asian Bridal Makeup Look ",
                    "Bushra Nasir",
                    "April 24, 2022",

                    R.drawable.makeup10
            );
            items.add(item);


            return items;
    }
}



