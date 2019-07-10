package com.example.myapplication2;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class PagerActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("1")
                .setBackgroundColor(Color.parseColor("#990534")) // int background color
                .setDrawable(R.drawable.ic_stat_name) // int top drawable
                .setSummary("Tutorial 1")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("2")
                .setBackgroundColor(Color.parseColor("#102f61")) // int background color
                .setDrawable(R.drawable.ic_stat_name) // int top drawable
                .setSummary("Tutorial 2")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("3")
                .setBackgroundColor(Color.parseColor("#4287f5")) // int background color
                .setDrawable(R.drawable.ic_stat_name) // int top drawable
                .setSummary("Tutorial 3")
                .build());

    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
