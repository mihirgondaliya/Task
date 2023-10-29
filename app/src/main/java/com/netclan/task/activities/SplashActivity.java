package com.netclan.task.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.netclan.task.databinding.ActivitySplashBinding;
import com.netclan.task.helpers.Utils;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Utils.fullScreen(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goTo();
            }
        },2500);

    }

    private void goTo() {
        Intent intent = new Intent(SplashActivity.this , JoinUsActivity.class);
        startActivity(intent);
        finish();
    }

}