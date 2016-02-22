package com.sakebook.android.sample.tutorialsample.views;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.sakebook.android.sample.tutorialsample.views.holders.ViewHolder;

/**
 * Created by sakemotoshinya on 16/02/11.
 */
public class ViewPagerTransformer implements ViewPager.PageTransformer {

    private final static String TAG = ViewPagerTransformer.class.getSimpleName();

    @Override
    public void transformPage(View page, float position) {
        if (position <= -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
        } else if (position <= 1) {
            ((ViewHolder)page.getTag()).transition(page, position);
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
        }
    }
}
