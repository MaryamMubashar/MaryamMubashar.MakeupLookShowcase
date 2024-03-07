package com.example.maryammubasharmakeuplookshowcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.gson.Gson;




public class ArticlesDetailsActivity extends AppCompatActivity {
    TextView title;
    TextView name;
    TextView date;
    ImageView image;
    Item items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_details);
    title = findViewById(R.id.title);
    name = findViewById(R.id.name);
    date = findViewById(R.id.date);
     image = findViewById(R.id.image);
        Gson gson = new Gson(); // Correct instantiation of Gson
        items = gson.fromJson(getIntent().getStringExtra("data"), Item.class);

        title.setText(getIntent().getExtras().getString("title"));
        name.setText(getIntent().getExtras().getString("name"));
        date.setText(getIntent().getExtras().getString("data"));
        int image1 = getIntent().getIntExtra("image", 0);
        image.setImageResource(image1);
    }
}