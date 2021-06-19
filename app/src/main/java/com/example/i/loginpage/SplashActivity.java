package com.example.i.loginpage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView logo;
    private int SLEEP_TIMER=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        logo=(ImageView)findViewById(R.id.imglogo);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.dcart);
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        logo.setImageDrawable(roundedBitmapDrawable);
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mysplashscreen);
        logo.startAnimation(myanim);
            }

    private class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(1000*SLEEP_TIMER);
            }
            catch (InterruptedException e) {

                e.printStackTrace();

            }
            Intent intent=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }
}