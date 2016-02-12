package com.sakebook.android.sample.tutorialsample.views;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.ImageView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/12.
 */
public class TutorialViewHolder {

    public static void makeViewHolder(@LayoutRes int layoutRes, View view) {
        ViewHolder holder = null;
        switch (layoutRes) {
            case R.layout.fragment_tutorial_first:
                holder = new FirstViewHolder(view);
                break;
            case R.layout.fragment_tutorial_second:
                holder = new SecondViewHolder(view);
                break;
            default:
                break;
        }
        view.setTag(holder);
    }

    public static class FirstViewHolder implements ViewHolder {

        public ImageView centerIcon;
        public FirstViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }

    public static class SecondViewHolder implements ViewHolder {

        public ImageView centerIcon;
        public SecondViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }


}
