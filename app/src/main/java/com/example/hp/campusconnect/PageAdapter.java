package com.example.hp.campusconnect;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by suraj on 11-01-2018.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNoofTabs;
    public PageAdapter(FragmentManager fm, int NoOfTabs) {
        super(fm);
        this.mNoofTabs=NoOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
               all_f af=new all_f();
               return af;
            case 1:
                recent_f rf=new recent_f();
                return rf;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoofTabs;
    }
}
