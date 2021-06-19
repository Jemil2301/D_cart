package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ActivityOccassion extends AppCompatActivity {
    private CardView Birthday,Wedding,Bachelor,Valentine,Babyshower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occassion);
        Birthday=(CardView)findViewById(R.id.birthday);
        Wedding=(CardView)findViewById(R.id.wedding);
        Bachelor=(CardView)findViewById(R.id.bachelor);
        Valentine=(CardView)findViewById(R.id.valentine);
        Babyshower=(CardView)findViewById(R.id.babyshower);

        Birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOccassion.this,activity_birthday.class));
            }
        });


        Wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOccassion.this,activity_wedding.class));
            }
        });


        Bachelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOccassion.this,activity_bachelor.class));
            }
        });


        Valentine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOccassion.this,activity_valentine.class));
            }
        });


        Babyshower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOccassion.this,activity_babyshower.class));
            }
        });
    }
}
