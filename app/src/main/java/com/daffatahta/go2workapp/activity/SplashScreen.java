package com.daffatahta.go2workapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.daffatahta.go2workapp.MainActivity;
import com.daffatahta.go2workapp.R;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //TODO set logo set header footer text
        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen().withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#000000"))
                .withFooterText("Copyright DaylightSeeker 2019")
                .withLogo(R.mipmap.logo_splash);
        config.getFooterTextView().setTextColor(Color.WHITE);
        View ess = config.create();
        setContentView(ess);
    }
}
