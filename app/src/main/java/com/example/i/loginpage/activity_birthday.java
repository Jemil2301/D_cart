package com.example.i.loginpage;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_birthday extends AppCompatActivity {
    ViewPager viewPager;
    private Button BookNow;
    String et = "Birthday Party";
    String pt = "Rs.5000";
    String st, jt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        viewPager = (ViewPager) findViewById(R.id.myViewpager);
        Adapterbir adapterbir = new Adapterbir(this);

        viewPager.setAdapter(adapterbir);
        BookNow=(Button)findViewById(R.id.btnBooknow);
        BookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity_birthday.this,Booknow.class);
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