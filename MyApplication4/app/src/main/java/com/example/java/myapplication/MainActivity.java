package com.example.java.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"icomoon.ttf");
        button.setTypeface(typeface);
        button.setText("\uE901");
        button.setTextSize(30);
        button.setTextColor(Color.GREEN);
    }
}
