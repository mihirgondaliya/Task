package com.netclan.task.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.netclan.task.databinding.ActivityJoinUsBinding;
import com.netclan.task.helpers.Utils;

public class JoinUsActivity extends AppCompatActivity {

    private ActivityJoinUsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJoinUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Utils.fullScreen(this);

        binding.tvFirstDesc.setSelected(true);
        binding.tvSecDesc.setSelected(true);
        binding.tvThirdDesc.setSelected(true);

        binding.cvIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinUsActivity.this , DashboardActivity.class);
                intent.putExtra("selectTab" , "0");
                startActivity(intent);
            }
        });

        binding.cvProfessional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinUsActivity.this , DashboardActivity.class);
                intent.putExtra("selectTab" , "1");
                startActivity(intent);
            }
        });

        binding.cvMerchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinUsActivity.this , DashboardActivity.class);
                intent.putExtra("selectTab" , "2");
                startActivity(intent);
            }
        });

    }
}