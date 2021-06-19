package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_partymask extends AppCompatActivity {
    private CardView Colour,Black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partymask);
        Black=(CardView)findViewById(R.id.m1);
        Colour=(CardView)findViewById(R.id.m4);


        Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_partymask.this,activity_m1.class));
            }
        });
        Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_partymask.this,activity_m4.class));
            }
        });

    }
}
