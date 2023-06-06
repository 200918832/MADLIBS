package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RafelDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_rafael_display);

        TextView tvStory = findViewById(R.id.tv_story);

        ImageView ivMain = findViewById(R.id.iv_display);
        ivMain.setImageResource(R.drawable.rafael_image);

        String story = getIntent().getStringExtra("story");

        tvStory.setText(story);
    }
}