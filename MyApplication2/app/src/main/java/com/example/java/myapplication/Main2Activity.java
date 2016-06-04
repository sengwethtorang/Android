package com.example.java.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
//        get input form
        String word = intent.getStringExtra("Word");
        TextView textView = (TextView) findViewById(R.id.input);
        textView.setText(word);

    }
}
