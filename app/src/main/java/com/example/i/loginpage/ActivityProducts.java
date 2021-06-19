package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ActivityProducts extends AppCompatActivity {

    private CardView Ballons,Led,Flower,ShowPiece,WallHanging,CrepePaperroll,BannerString,PartyMask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        Ballons=(CardView)findViewById(R.id.balloon);
        Led=(CardView)findViewById(R.id.led);
        Flower=(CardView)findViewById(R.id.flower);
        ShowPiece=(CardView)findViewById(R.id.showpiece);
        WallHanging=(CardView)findViewById(R.id.wallhanging);
        CrepePaperroll=(CardView)findViewById(R.id.paperroll);
        BannerString=(CardView)findViewById(R.id.stringbanner);
        PartyMask=(CardView)findViewById(R.id.partymask);

        Ballons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_balloon.class));
            }
        });

        Led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_led.class));
            }
        });

        Flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_flower.class));
            }
        });

        ShowPiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_showpiece.class));
            }
        });

        WallHanging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_wallhanging.class));
            }
        });

        CrepePaperroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_paperroll.class));
            }
        });

        BannerString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_bannerstring.class));
            }
        });

        PartyMask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityProducts.this,activity_partymask.class));
            }
        });

    }
}
