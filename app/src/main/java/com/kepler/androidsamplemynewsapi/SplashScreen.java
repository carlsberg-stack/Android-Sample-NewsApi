package com.kepler.androidsamplemynewsapi;


import android.os.Bundle;
import android.os.Handler;

import com.kepler.androidsamplemynewsapi.boilers.BaseActivity;

public class SplashScreen extends BaseActivity {


    private static final long DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(() -> {
            startActivity(MainActivity.class);
            finish();
        }, DELAY);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_splash_screen;
    }

}
