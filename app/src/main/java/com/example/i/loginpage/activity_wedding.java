package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_wedding extends AppCompatActivity {
    ViewPager viewPager;
    private Button BookNow;
    String et = "Wedding";
    String pt = "Rs.150000";
    String st, jt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);
        viewPager = (ViewPager) findViewById(R.id.myViewpager);
        Adapterwed adapterwed = new Adapterwed(this);

        viewPager.setAdapter(adapterwed);
        BookNow=(Button)findViewById(R.id.btnBooknow);
        BookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_wedding.this,Booknow.class);
                st=et.toString();
                jt=pt.toString();
                i.putExtra("Price",jt);
                i.putExtra("Value",st);
                startActivity(i);
                finish();

            }
        });

    }
}