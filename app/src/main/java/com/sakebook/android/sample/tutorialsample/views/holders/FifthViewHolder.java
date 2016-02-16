package com.sakebook.android.sample.tutorialsample.views.holders;

import android.view.View;
import android.widget.ImageView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/17.
 */
public class FifthViewHolder implements ViewHolder{

    public ImageView centerIcon;

    public FifthViewHolder(View view) {
        this.centerIcon = (ImageView) view.findViewById(R.id.image_icon);
    }

    @Override
    public void transition(View page, float position) {
        if (-1 < position && position < 0) {
            // left
        } else if (0 <= position && position <= 1) {
            // right
        }
    }

}
