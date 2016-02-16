package com.sakebook.android.sample.tutorialsample.views.holders;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/17.
 */
public class ThirdViewHolder implements ViewHolder {

    public ImageView centerIcon;
    public ImageView leftIcon;
    public ImageView rightIcon;
    public TextView title;

    public ThirdViewHolder(View view) {
        this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        this.leftIcon = (ImageView) view.findViewById(R.id.image_icon_left);
        this.rightIcon = (ImageView) view.findViewById(R.id.image_icon_right);
        this.title = (TextView) view.findViewById(R.id.text_title);
    }

    @Override
    public void transition(View page, float position) {
        Log.d(this.getClass().getSimpleName(), "transformThird: ");
        if (-1 < position && position < 0) {
            // left
            leftIcon.setTranslationX(position * page.getWidth() * 2);
            rightIcon.setTranslationX(-position * page.getWidth() / 4);
        } else if (0 <= position && position <= 1) {
            // right
            leftIcon.setTranslationX(position * page.getWidth() * 2);
            rightIcon.setTranslationX(position * page.getWidth());
        }
        centerIcon.setTranslationX(-position * page.getWidth());
    }

}
