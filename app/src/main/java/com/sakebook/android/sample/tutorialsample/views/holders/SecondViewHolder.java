package com.sakebook.android.sample.tutorialsample.views.holders;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/17.
 */
public class SecondViewHolder implements ViewHolder {

    public ImageView centerIcon;
    public ImageView leftIcon;
    public ImageView rightIcon;
    public TextView title;

    public SecondViewHolder(View view) {
        this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        this.leftIcon = (ImageView) view.findViewById(R.id.image_icon_left);
        this.rightIcon = (ImageView) view.findViewById(R.id.image_icon_right);
        this.title = (TextView) view.findViewById(R.id.text_title);
    }

    @Override
    public void transition(View page, float position, boolean reverse) {
        Log.d(this.getClass().getSimpleName(), "transformSecond: " + reverse);
        if (reverse) {
            // right
            leftIcon.setTranslationX(position * page.getWidth() * 2);
            rightIcon.setTranslationX(position * page.getWidth());
        } else {
            // left
            leftIcon.setTranslationX(position * page.getWidth() * 2);
            rightIcon.setTranslationX(-position * page.getWidth() / 4);
        }
        centerIcon.setTranslationX(-position * page.getWidth());
    }
}
