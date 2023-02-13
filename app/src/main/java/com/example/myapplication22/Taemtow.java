package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Taemtow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taemtow);
        ClassTow classTow = new ClassTow();
        TextView textView = findViewById(R.id.tow);
        textView.setText(classTow.getBrooklynNets());
    }
}