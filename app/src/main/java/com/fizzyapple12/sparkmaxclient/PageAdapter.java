package com.fizzyapple12.sparkmaxclient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numTabs;

    public PageAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs + 1;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new basicTab();
            case 1:
                return new advancedTab();
            case 2:
                return new NoMC();
        }

        return null;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
