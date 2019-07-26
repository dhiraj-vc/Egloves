package com.vibrantcube.eglobes.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.vibrantcube.eglobes.R;
import com.vibrantcube.eglobes.home.adapter.ViewPagerAdapter;

public class TrendActivity extends AppCompatActivity {

    ViewPager viewPager;
    private ActionBar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trend);
        toolbar = getSupportActionBar();
        toolbar.setTitle("Trending");

        viewPager =  findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
