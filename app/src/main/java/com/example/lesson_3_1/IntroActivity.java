package com.example.lesson_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    ViewPager viewPager;
    SectionPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        viewPager = findViewById(R.id.viewPager);
        adapter = new SectionPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter {

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            bundle.putInt("pos", position);
            IntroFragment introFragment = new IntroFragment();
            introFragment.setArguments(bundle);
            return introFragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
