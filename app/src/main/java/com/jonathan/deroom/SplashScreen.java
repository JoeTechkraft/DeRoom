package com.jonathan.deroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(6000);
                    Intent i = new Intent(SplashScreen.this, LoginScreen.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        timerThread.start();
    }
}
