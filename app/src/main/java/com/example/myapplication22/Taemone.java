package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Taemone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taemone);
        ClassOne classOne = new ClassOne();
        TextView textView = findViewById(R.id.one);
        textView.setText(classOne.getCharlotteHornets());
    }
}