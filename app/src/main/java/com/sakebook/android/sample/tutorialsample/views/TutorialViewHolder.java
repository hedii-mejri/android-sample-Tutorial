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

    public static class FirstViewHolder implements ViewHolder {

        public ImageView centerIcon;

        public FirstViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }

    public static class SecondViewHolder implements ViewHolder {

        public ImageView centerIcon;
        public ImageView leftTopIcon;
        public ImageView leftBottomIcon;
        public ImageView rightTopIcon;
        public ImageView rightBottomIcon;

        public SecondViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
            this.leftTopIcon = (ImageView) view.findViewById(R.id.image_icon_left_top);
            this.leftBottomIcon = (ImageView) view.findViewById(R.id.image_icon_left_bottom);
            this.rightTopIcon = (ImageView) view.findViewById(R.id.image_icon_right_top);
            this.rightBottomIcon = (ImageView) view.findViewById(R.id.image_icon_right_bottom);
        }
    }

    public static class ThirdViewHolder implements ViewHolder {

        public ImageView centerIcon;

        public ThirdViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }

    public static class FourthViewHolder implements ViewHolder {

        public ImageView centerIcon;

        public FourthViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }

    public static class FifthViewHolder implements ViewHolder {

        public ImageView centerIcon;

        public FifthViewHolder(View view) {
            this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        }
    }

}
