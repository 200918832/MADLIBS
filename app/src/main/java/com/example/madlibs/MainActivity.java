package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etAdjective;
    private EditText etNoun;
    private EditText etVerb;

    private Button btnGenerate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link objects to layout file
        etAdjective = findViewById(R.id.et_adjective);
        etNoun = findViewById(R.id.et_noun);
        etVerb = findViewById(R.id.et_noun);

        //add  button

    }
}