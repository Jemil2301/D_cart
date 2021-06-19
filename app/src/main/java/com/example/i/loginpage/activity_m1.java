package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_m1 extends AppCompatActivity {
    ViewPager viewPager;
    private Button Buynow;
    String et="Black Mask";
    String pt="Rs.200";
    String st,jt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        Buynow=(Button)findViewById(R.id.btnaddcart);
        viewPager=(ViewPager)findViewById(R.id.myViewpager);
        Adapterm1 adapterm1=new Adapterm1(this);
        viewPager.setAdapter(adapterm1);
        Buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_m1.this,buynow.class);
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
