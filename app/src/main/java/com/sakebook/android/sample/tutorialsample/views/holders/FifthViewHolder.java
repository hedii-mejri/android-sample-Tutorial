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
    public void transition(View page, float position, boolean reverse) {
        if (reverse) {
            // right
        } else {
            // left
        }
    }

}
