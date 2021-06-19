package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_l7 extends AppCompatActivity {
    ViewPager viewPager;
    private Button Buynow;
    String et="Yellow Led";
    String pt="Rs.300";
    String st,jt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l7);
        Buynow=(Button)findViewById(R.id.btnaddcart);
        viewPager=(ViewPager)findViewById(R.id.myViewpager);
        Adapterl7 adapterl7=new Adapterl7(this);
        viewPager.setAdapter(adapterl7);
        Buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_l7.this,buynow.class);
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
