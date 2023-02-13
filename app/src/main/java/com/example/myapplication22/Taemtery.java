package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Taemtery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taemtery);
        ClassThery classThery = new ClassThery();
        TextView textView = findViewById(R.id.terey);
        textView.setText(classThery.getTorontoRaptors());
    }
}