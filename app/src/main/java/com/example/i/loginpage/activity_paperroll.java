package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_paperroll extends AppCompatActivity {
    private CardView Colour,Star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paperroll);
        Colour=(CardView)findViewById(R.id.p1);
        Star=(CardView)findViewById(R.id.p4);


        Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_paperroll.this,activity_p1.class));
            }
        });
        Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_paperroll.this,activity_p4.class));
            }
        });

    }
}
