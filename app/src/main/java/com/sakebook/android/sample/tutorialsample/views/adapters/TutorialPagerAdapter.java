package com.sakebook.android.sample.tutorialsample.views.adapters;

import android.content.Context;
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
        switch (position) {
            default:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_first);
            case 0:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_first);
            case 1:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_second);
            case 2:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_third);
            case 3:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_fourth);
            case 4:
                return TutorialFragment.newInstance(R.layout.fragment_tutorial_fifth);
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
