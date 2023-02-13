package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Taemfure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taemfure);
        ClassFour classFour = new ClassFour();
        TextView textView = findViewById(R.id.four);
        textView.setText(classFour.getCharlotteHornets());
    }
}