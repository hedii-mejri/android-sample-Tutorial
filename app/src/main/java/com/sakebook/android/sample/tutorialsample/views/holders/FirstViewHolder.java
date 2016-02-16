package com.sakebook.android.sample.tutorialsample.views.holders;

import android.view.View;
import android.widget.ImageView;

import com.sakebook.android.sample.tutorialsample.R;

/**
 * Created by sakemotoshinya on 16/02/16.
 */
public class FirstViewHolder implements ViewHolder{

    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public ImageView image6;

    public FirstViewHolder(View view) {
        this.image1 = (ImageView) view.findViewById(R.id.image_icon1);
        this.image2 = (ImageView) view.findViewById(R.id.image_icon2);
        this.image3 = (ImageView) view.findViewById(R.id.image_icon3);
        this.image4 = (ImageView) view.findViewById(R.id.image_icon4);
        this.image5 = (ImageView) view.findViewById(R.id.image_icon5);
        this.image6 = (ImageView) view.findViewById(R.id.image_icon6);

    }

    @Override
    public void transition(View page, float position) {
        if (-1 < position && position < 0) {
            // left
        } else if (0 <= position && position <= 1) {
            // right
        }
        image1.setTranslationX(position * page.getWidth() * 2);
        image2.setTranslationX(position * page.getWidth());
        image3.setTranslationX(0);
        image4.setTranslationX(-position * page.getWidth());
        image5.setTranslationX(-position * page.getWidth() * 2);
        image6.setTranslationX(-position * page.getWidth() * 4);
    }
}
