package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_showpiece extends AppCompatActivity {
    private CardView Ganesh,Couple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showpiece);
        Ganesh=(CardView)findViewById(R.id.s1);
        Couple=(CardView)findViewById(R.id.s4);


        Ganesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_showpiece.this,activity_s1.class));
            }
        });
        Couple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_showpiece.this,activity_s4.class));
            }
        });

    }
}
