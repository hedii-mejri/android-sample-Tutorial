package com.sakebook.android.sample.tutorialsample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sakebook.android.sample.tutorialsample.R;
import com.sakebook.android.sample.tutorialsample.activities.TutorialActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(TutorialActivity.createIntent(this));
    }
}
