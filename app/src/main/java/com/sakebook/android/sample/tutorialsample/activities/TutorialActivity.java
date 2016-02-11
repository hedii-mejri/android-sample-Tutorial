package com.sakebook.android.sample.tutorialsample.activities;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sakebook.android.sample.tutorialsample.R;
import com.sakebook.android.sample.tutorialsample.views.ViewPagerTransformer;
import com.sakebook.android.sample.tutorialsample.views.adapters.TutorialPagerAdapter;

public class TutorialActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private Integer[] colors;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, TutorialActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        initColor();
        initViewPager();
    }

    private void initViewPager() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        TutorialPagerAdapter adapter = new TutorialPagerAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(false, new ViewPagerTransformer());
        viewPager.addOnPageChangeListener(this);
    }

    private void initColor() {
        this.colors = new Integer[]{
                Color.RED,
                Color.GREEN,
                Color.MAGENTA,
                Color.BLUE,
                Color.YELLOW,
                Color.BLUE, // for end evaluate
        };

//        this.colors = new Integer[]{
//                ContextCompat.getColor(this, Color.RED),
//                ContextCompat.getColor(this, Color.GREEN),
//                ContextCompat.getColor(this, Color.MAGENTA),
//                ContextCompat.getColor(this, Color.BLUE),
//                ContextCompat.getColor(this, Color.YELLOW),
//                ContextCompat.getColor(this, Color.BLUE), // for end evaluate
//        };
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1]));

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
