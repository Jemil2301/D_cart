package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class activity_balloon extends AppCompatActivity {
    RecyclerView recyclerView;
    private CardView Dotted,Spiral,Solid,Emoji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balloon);
        Dotted=(CardView)findViewById(R.id.b1);
        Spiral=(CardView)findViewById(R.id.b4);
        Solid=(CardView)findViewById(R.id.b7);
        Emoji=(CardView)findViewById(R.id.b10);
        Dotted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_balloon.this,activity_b1.class));
            }
        });
        Spiral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_balloon.this,activity_b4.class));
            }
        });
        Solid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_balloon.this,activity_b7.class));
            }
        });
        Emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_balloon.this,activity_b10.class));
            }
        });

    }
}