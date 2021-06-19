package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_flower extends AppCompatActivity {
    private CardView Yellow,White,Lotus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
        Yellow=(CardView)findViewById(R.id.f1);
        White=(CardView)findViewById(R.id.f4);
        Lotus=(CardView)findViewById(R.id.f7);

        Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_flower.this,activity_f1.class));
            }
        });
        White.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_flower.this,activity_f4.class));
            }
        });
        Lotus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_flower.this,activity_f7.class));
            }
        });

    }
}
