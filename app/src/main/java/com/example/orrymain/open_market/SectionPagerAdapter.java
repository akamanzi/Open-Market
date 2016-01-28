package com.example.orrymain.open_market;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arnold on 27/01/16.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 0:
                fragment = new TabFragment1();
                break;
            case 1:
                fragment = new TabFragment2();
                //fragment = new RaggaeMusicFragment();
                break;
            case 2:
                fragment = new TabFragment3();
                //fragment = new RapMusicFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

}
