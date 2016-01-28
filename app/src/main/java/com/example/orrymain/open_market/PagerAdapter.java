package com.example.orrymain.open_market; /**
 * Created by murenziorrymain on 26/01/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.orrymain.open_market.TabFragment1;
import com.example.orrymain.open_market.TabFragment2;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        //this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
       // Fragment fragment = null;

        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                //fragment = new com.example.orrymain.open_market.TabFragment1();
                //break;
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                //fragment = new com.example.orrymain.open_market.TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                //fragment = new com.example.orrymain.open_market.TabFragment3();
                return tab3;
                //break;
            default:
                return null;
        }
       // return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
       // return 3;
    }
}