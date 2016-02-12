package com.sakebook.android.sample.tutorialsample.views;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.sakebook.android.sample.tutorialsample.R;


/**
 * Created by sakemotoshinya on 16/02/11.
 */
public class ViewPagerTransformer implements ViewPager.PageTransformer {
    private final static String TAG = ViewPagerTransformer.class.getSimpleName();
    @Override
    public void transformPage(View page, float position) {
        Log.d(TAG, "position: " + position);
        if (position <= -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
        } else if (-1 < position && position < 0) {
            // left side shown View
            leftTransition(page, position);
        } else if (0 <= position && position <= 1) {
            // right side shown View
            rightTransition(page, position);
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
        }
    }


    private void leftTransition(View page, float position) {
        int parentId = page.getId();
        switch (parentId) {
            case R.id.layout_first:
                transformFirst(page, position, (TutorialViewHolder.FirstViewHolder) page.getTag(), false);
                break;
            case R.id.layout_second:
                transformSecond(page, position, (TutorialViewHolder.SecondViewHolder) page.getTag(), false);
                break;
        }
    }

    private void rightTransition(View page, float position) {
        int parentId = page.getId();
        switch (parentId) {
            case R.id.layout_first:
                transformFirst(page, position, (TutorialViewHolder.FirstViewHolder) page.getTag(), true);
                break;
            case R.id.layout_second:
                transformSecond(page, position, (TutorialViewHolder.SecondViewHolder) page.getTag(), false);
                break;
        }
    }
    private void transformFirst(View page, float position, TutorialViewHolder.FirstViewHolder holder, boolean reverse) {
        Log.d(TAG, "transformFirst: " + reverse);
        if (reverse) {
            // right
        } else {
            // left
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

    private void transformSecond(View page, float position, TutorialViewHolder.SecondViewHolder holder, boolean reverse) {
        Log.d(TAG, "transformSecond: " + reverse);
        if (reverse) {
            // right
        } else {
            // left
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

}
