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
        chooseViewHolder(page, position, false);
    }

    private void rightTransition(View page, float position) {
        chooseViewHolder(page, position, true);
    }

    private void chooseViewHolder(View page, float position, boolean reverse) {
        int parentId = page.getId();
        switch (parentId) {
            case R.id.layout_first:
                transformFirst(page, position, (TutorialViewHolder.FirstViewHolder) page.getTag(), !reverse);
                break;
            case R.id.layout_second:
                transformSecond(page, position, (TutorialViewHolder.SecondViewHolder) page.getTag(), !reverse);
                break;
            case R.id.layout_third:
                transformThird(page, position, (TutorialViewHolder.ThirdViewHolder) page.getTag(), !reverse);
                break;
            case R.id.layout_fourth:
                transformFourth(page, position, (TutorialViewHolder.FourthViewHolder) page.getTag(), !reverse);
                break;
            case R.id.layout_fifth:
                transformFifth(page, position, (TutorialViewHolder.FifthViewHolder) page.getTag(), !reverse);
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
            holder.leftTopIcon.setTranslationX(position * page.getWidth() / 4);
            holder.leftBottomIcon.setTranslationX(position * page.getWidth() / 4);
            holder.rightTopIcon.setTranslationX(position * page.getWidth() / 8);
            holder.rightBottomIcon.setTranslationX(position * page.getWidth() / 8);
        } else {
            // left
            holder.leftTopIcon.setTranslationX(position * page.getWidth() / 8);
            holder.leftBottomIcon.setTranslationX(position * page.getWidth() / 8);
            holder.rightTopIcon.setTranslationX(position * page.getWidth() / 4);
            holder.rightBottomIcon.setTranslationX(position * page.getWidth() / 4);
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

    private void transformThird(View page, float position, TutorialViewHolder.ThirdViewHolder holder, boolean reverse) {
        Log.d(TAG, "transformThird: " + reverse);
        if (reverse) {
            // right
        } else {
            // left
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

    private void transformFourth(View page, float position, TutorialViewHolder.FourthViewHolder holder, boolean reverse) {
        Log.d(TAG, "transformFourth: " + reverse);
        if (reverse) {
            // right
        } else {
            // left
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

    private void transformFifth(View page, float position, TutorialViewHolder.FifthViewHolder holder, boolean reverse) {
        Log.d(TAG, "transformFifth: " + reverse);
        if (reverse) {
            // right
        } else {
            // left
        }
        holder.centerIcon.setTranslationX(-position * page.getWidth());
    }

}
