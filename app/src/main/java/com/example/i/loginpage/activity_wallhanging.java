package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_wallhanging extends AppCompatActivity {
    private CardView Bird,Colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallhanging);
        Bird=(CardView)findViewById(R.id.w1);
        Colour=(CardView)findViewById(R.id.w4);


        Bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wallhanging.this,activity_w1.class));
            }
        });
        Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wallhanging.this,activity_w4.class));
            }
        });

    }
}
