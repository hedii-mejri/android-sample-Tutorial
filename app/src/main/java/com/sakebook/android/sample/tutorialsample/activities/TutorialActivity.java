package com.sakebook.android.sample.tutorialsample.activities;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.sakebook.android.sample.tutorialsample.R;
import com.sakebook.android.sample.tutorialsample.views.ViewPagerTransformer;
import com.sakebook.android.sample.tutorialsample.views.adapters.TutorialPagerAdapter;

public class TutorialActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private ImageView icon;
    private ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private Integer[] colors;
    private static final String TAG = TutorialActivity.class.getSimpleName();

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
        icon = (ImageView) findViewById(R.id.image_icon);
    }

    private void initColor() {
        this.colors = new Integer[]{
                ContextCompat.getColor(this, R.color.amber200),
                ContextCompat.getColor(this, R.color.cyan200),
                ContextCompat.getColor(this, R.color.deeporange200),
                ContextCompat.getColor(this, R.color.deeppurple200),
                ContextCompat.getColor(this, R.color.lime200),
                ContextCompat.getColor(this, R.color.deeppurple200), // for end evaluate
        };
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.d(TAG, "positionOffset: " + positionOffset);
        viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1]));
        if (position == 1) {
            icon.setVisibility(View.VISIBLE);
            icon.setScaleX(1 + positionOffset * 40);
            icon.setScaleY(1 + positionOffset * 40);
            icon.setTranslationY(-positionOffsetPixels);
            icon.setAlpha(3.0f - positionOffset * 3);
        } else {
            icon.setVisibility(View.INVISIBLE);
            icon.setScaleX(1);
            icon.setScaleY(1);
        }

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
