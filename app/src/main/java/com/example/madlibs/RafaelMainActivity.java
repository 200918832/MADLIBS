package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RafaelMainActivity extends AppCompatActivity {

    private EditText etAdjective, etNoun, etVerb, etColor, etShape, etLocation, etFood, etFriend;

    private Button btnGenerate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link objects to layout file
        etAdjective = findViewById(R.id.et_adjective);
        etNoun = findViewById(R.id.et_noun);
        etVerb = findViewById(R.id.et_noun);
        etColor = findViewById(R.id.et_Color);
        etShape = findViewById(R.id.et_Shape);
        etLocation = findViewById(R.id.et_Location);
        etFood = findViewById(R.id.et_Food);
        etFriend = findViewById(R.id.et_Friend);
        btnGenerate = findViewById(R.id.btn_generate);

        Intent intent = new Intent(RafaelMainActivity.this, RafelDisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = "";
                story += "Today I am visiting a friend house " + etLocation.getText() + ". ";
                story += "My freind name is Maria " + etFriend.getText() + ". ";
                story += "We took a left, to try to go to her Maria house  " + etVerb.getText() + ". ";
                story += "We were already here in Maria house " + etLocation.getText() + ". ";
                story += "Maria's house was yellow " + etColor.getText() + ". ";
                story += "We went inside  " + etVerb.getText() + ". ";
                story += "Maria house is very cozy " + etAdjective.getText() + ". ";
                story += "Maria showed me her cute dog " + etAdjective.getText() + ". ";
                story += "Me and Maria found a bunch of dvd's and a dvd player " + etAdjective.getText() + ". ";
                story += "We watched the Titanic movie " + etAdjective.getText() + ". ";
                intent.putExtra("story",story);
                startActivity(intent);


            }
        });


        //add  button

    }
}