package com.netclan.task.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.netclan.task.R;
import com.netclan.task.adapters.PageAdapter;
import com.netclan.task.databinding.ActivityDashboardBinding;
import com.netclan.task.helpers.Utils;

public class DashboardActivity extends AppCompatActivity {

    private ActivityDashboardBinding binding;

    private String selectTab = "";

    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        Utils.setStatusBarPrimary(this);

        binding.tabType.addTab(binding.tabType.newTab().setText(R.string.individual));
        binding.tabType.addTab(binding.tabType.newTab().setText(R.string.professional));
        binding.tabType.addTab(binding.tabType.newTab().setText(R.string.merchant));

        if (getIntent().hasExtra("selectTab")){
            selectTab = getIntent().getStringExtra("selectTab");
        }

        pagerAdapter =new PageAdapter(getSupportFragmentManager() , binding.tabType.getTabCount());

        binding.vPager.setAdapter(pagerAdapter);

        binding.tabType.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                binding.vPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        binding.vPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabType));


        if (selectTab.equals("0")) {
            TabLayout.Tab selectedTab = binding.tabType.getTabAt(0);
            if (selectedTab != null) {
                selectedTab.select();
            }
        } else if (selectTab.equals("1")) {
            TabLayout.Tab selectedTab = binding.tabType.getTabAt(1);
            if (selectedTab != null) {
                selectedTab.select();
            }
        } else {
            TabLayout.Tab selectedTab = binding.tabType.getTabAt(2);
            if (selectedTab != null) {
                selectedTab.select();
            }
        }

    }

}