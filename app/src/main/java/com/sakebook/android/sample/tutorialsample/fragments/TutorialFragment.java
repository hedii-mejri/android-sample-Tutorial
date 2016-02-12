package com.sakebook.android.sample.tutorialsample.fragments;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sakebook.android.sample.tutorialsample.views.TutorialViewHolder;

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
        TutorialViewHolder.makeViewHolder(layoutRes, view);
        return view;
    }
}
