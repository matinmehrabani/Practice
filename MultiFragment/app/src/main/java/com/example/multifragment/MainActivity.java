package com.example.multifragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.multifragment.Adapter.ViewPagerAdapter;
import com.example.multifragment.Ui.Fragment.FragmentList.Fragment1;
import com.example.multifragment.Ui.Fragment.FragmentList.Fragment2;
import com.example.multifragment.Ui.Fragment.FragmentList.Fragment3;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.ViewPager);
        tabLayout = findViewById(R.id.tab_layout);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFrg(new Fragment1(), "view1");
        viewPagerAdapter.addFrg(new Fragment2(), "view 2");
        viewPagerAdapter.addFrg(new Fragment3(), "view 3");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }
}
