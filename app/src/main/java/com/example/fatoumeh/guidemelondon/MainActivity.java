package com.example.fatoumeh.guidemelondon;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] tab_title = {getString(R.string.show_me), getString(R.string.feed_me), getString(R.string.accommodate_me),
               getString(R.string.buy_me), getString(R.string.tell_me)};

        ViewPager viewPager = findViewById(R.id.viewPager);
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), tab_title );
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.slidingtTabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }
}
