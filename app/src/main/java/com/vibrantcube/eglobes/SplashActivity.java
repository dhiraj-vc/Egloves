package com.vibrantcube.eglobes;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {


    private Activity mActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);


        mActivity = SplashActivity.this;


        try {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    startActivity(new Intent(mActivity, MainActivity.class));
                    finish();
                }
            }, 2000);
        } catch (Exception e) {
            Log.e("Splash Exc", "::  " + e.getMessage());
            startActivity(new Intent(mActivity, MainActivity.class));
            finish();
        }
    }
}
