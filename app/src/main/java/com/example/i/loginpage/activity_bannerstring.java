package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class activity_bannerstring extends AppCompatActivity {
    private CardView Colour,Birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bannerstring);
        Colour=(CardView)findViewById(R.id.ba1);
        Birthday=(CardView)findViewById(R.id.ba4);

        Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_bannerstring.this,activity_ba1.class));
            }
        });
        Birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_bannerstring.this,activity_ba4.class));
            }
        });

    }
}
