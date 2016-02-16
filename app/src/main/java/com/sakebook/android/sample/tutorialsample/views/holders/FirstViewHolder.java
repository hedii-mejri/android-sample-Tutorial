package com.sakebook.android.sample.tutorialsample.views.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/16.
 */
public class FirstViewHolder implements ViewHolder{

    public ImageView centerIcon;
    public TextView title;

    public FirstViewHolder(View view) {
        this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
        this.title = (TextView) view.findViewById(R.id.text_title);
    }

    @Override
    public void transition(View page, float position, boolean reverse) {
        if (reverse) {
            // right
        } else {
            // left
        }
        centerIcon.setTranslationX(-position * page.getWidth());
    }
}
