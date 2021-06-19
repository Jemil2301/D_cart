package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_valentine extends AppCompatActivity {
    ViewPager viewPager;
    private Button BookNow;
    String et = "Valentine Day";
    String pt = "Rs.10000";
    String st, jt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valentine);
        viewPager = (ViewPager) findViewById(R.id.myViewpager);
        Adapterv adapterv = new Adapterv(this);

        viewPager.setAdapter(adapterv);
        BookNow=(Button)findViewById(R.id.btnBooknow);
        BookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_valentine.this,Booknow.class);
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