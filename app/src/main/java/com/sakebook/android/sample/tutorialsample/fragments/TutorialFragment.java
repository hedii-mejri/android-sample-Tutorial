package com.sakebook.android.sample.tutorialsample.fragments;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sakebook.android.sample.tutorialsample.R;
import com.sakebook.android.sample.tutorialsample.views.holders.ViewHolder;
import com.sakebook.android.sample.tutorialsample.views.holders.FifthViewHolder;
import com.sakebook.android.sample.tutorialsample.views.holders.FirstViewHolder;
import com.sakebook.android.sample.tutorialsample.views.holders.FourthViewHolder;
import com.sakebook.android.sample.tutorialsample.views.holders.SecondViewHolder;
import com.sakebook.android.sample.tutorialsample.views.holders.ThirdViewHolder;

/**
 * Created by sakemotoshinya on 16/02/11.
 */
public class TutorialFragment extends Fragment{

    private static final String RES_ARG = "res_arg";

    public TutorialFragment() {
    }

    public static TutorialFragment newInstance(@LayoutRes int layoutRes) {
        TutorialFragment fragment = new TutorialFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(RES_ARG, layoutRes);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int layoutRes = getArguments().getInt(RES_ARG);
        View view = inflater.inflate(layoutRes, null);
        makeViewHolder(layoutRes, view);
        return view;
    }

    public void makeViewHolder(@LayoutRes int layoutRes, View view) {
        ViewHolder holder = null;
        switch (layoutRes) {
            case R.layout.fragment_tutorial_first:
                holder = new FirstViewHolder(view);
                break;
            case R.layout.fragment_tutorial_second:
                holder = new SecondViewHolder(view);
                break;
            case R.layout.fragment_tutorial_third:
                holder = new ThirdViewHolder(view);
                break;
            case R.layout.fragment_tutorial_fourth:
                holder = new FourthViewHolder(view);
                break;
            case R.layout.fragment_tutorial_fifth:
                holder = new FifthViewHolder(view);
                break;
            default:
                break;
        }
        view.setTag(holder);
    }
}
