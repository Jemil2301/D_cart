package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_led extends AppCompatActivity {
    private CardView Star,Ball,Yellow,String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        Star=(CardView)findViewById(R.id.l1);
        Ball=(CardView)findViewById(R.id.l4);
        Yellow=(CardView)findViewById(R.id.l7);
        String=(CardView)findViewById(R.id.l10);
        Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_led.this,activity_l1.class));
            }
        });
        Ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_led.this,activity_l4.class));
            }
        });
        Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_led.this,activity_l7.class));
            }
        });
        String.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_led.this,activity_l10.class));
            }
        });
    }
}
