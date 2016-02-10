package com.sakebook.android.sample.tutorialsample.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sakebook.android.sample.tutorialsample.R;

public class TutorialActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, TutorialActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }
}
