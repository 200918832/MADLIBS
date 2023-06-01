package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RafelDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rafel_display);

        TextView tvStory = findViewById(R.id.tv_story);

        String story = getIntent().getStringExtra("story");

        tvStory.setText(story);
    }
}