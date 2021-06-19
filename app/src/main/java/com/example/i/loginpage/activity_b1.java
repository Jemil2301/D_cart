package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_b1 extends AppCompatActivity {
    ViewPager viewPager;
    private Button Buynow;
    String et="Dotted Balloon";
    String pt="Rs.250";
    String st,jt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
    viewPager=(ViewPager)findViewById(R.id.myViewpager);
    Adapterb1 adapterb1=new Adapterb1(this);
    viewPager.setAdapter(adapterb1);
    Buynow=(Button)findViewById(R.id.btnaddcart);
    Buynow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(activity_b1.this,buynow.class);
            st=et.toString();
            jt=pt.toString();
            i.putExtra("Price",jt);
            i.putExtra("Value",st);
            startActivity(i);
            finish();
            //startActivity(new Intent(activity_b1.this,buynow.class));
        }
    });
    }
}
