package com.netclan.task.adapters;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.netclan.task.fragments.IndividualFragment;
import com.netclan.task.fragments.MerchantFragment;
import com.netclan.task.fragments.ProfessionalFragment;


public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.tabcount = behavior;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new IndividualFragment();
            case 1: return new ProfessionalFragment();
            case 2: return new MerchantFragment();

            default: return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}