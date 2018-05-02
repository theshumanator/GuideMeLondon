package com.example.fatoumeh.guidemelondon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by fatoumeh on 27/02/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tab_title[];

    public SimpleFragmentPagerAdapter(FragmentManager fm, String [] title) {
        super(fm);
        this.tab_title=title;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShowMeFragment();
        } else if (position == 1) {
            return new FeedMeFragment();
        } else if (position == 2) {
            return new AccommodateMeFragment();
        } else if (position == 3) {
            return new BuyMeFragment();
        } else {
            return new TellMeFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) { return tab_title[position]; }

    @Override
    public int getCount() { return tab_title.length; }
}
