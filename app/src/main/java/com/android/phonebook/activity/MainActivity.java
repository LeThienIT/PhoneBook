package com.android.phonebook.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.android.phonebook.fragment.FragmentCall;
import com.android.phonebook.fragment.FragmentContact;
import com.android.phonebook.fragment.FragmentFav;
import com.android.phonebook.R;
import com.android.phonebook.adapter.ViewpagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewpagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout_id);
        viewPager = findViewById(R.id.viewPager_id);
        adapter = new ViewpagerAdapter(getSupportFragmentManager());

        // add fragment
        adapter.addFragment(new FragmentCall(), "");
        adapter.addFragment(new FragmentContact(), "");
        adapter.addFragment(new FragmentFav(), "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.call);
        tabLayout.getTabAt(1).setIcon(R.drawable.contact);
        tabLayout.getTabAt(2).setIcon(R.drawable.fav);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation(0);
    }
}