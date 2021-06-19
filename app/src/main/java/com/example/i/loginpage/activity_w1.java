package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_w1 extends AppCompatActivity {
    ViewPager viewPager;
    private Button Buynow;
    String et="Bird Wallhanging";
    String pt="Rs.500";
    String st,jt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w1);
        Buynow=(Button)findViewById(R.id.btnaddcart);
        viewPager=(ViewPager)findViewById(R.id.myViewpager);
        Adapterw1 adapterw1=new Adapterw1(this);
        viewPager.setAdapter(adapterw1);
        Buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_w1.this,buynow.class);
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
