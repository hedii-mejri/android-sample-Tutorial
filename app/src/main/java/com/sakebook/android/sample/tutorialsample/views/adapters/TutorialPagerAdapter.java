package com.sakebook.android.sample.tutorialsample.views.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sakebook.android.sample.tutorialsample.R;
import com.sakebook.android.sample.tutorialsample.fragments.TutorialFragment;

/**
 * Created by sakemotoshinya on 16/02/11.
 */
public class TutorialPagerAdapter extends FragmentPagerAdapter{

    private Context context;

    public TutorialPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return TutorialFragment.newInstance(R.layout.fragment_tutorial);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
