package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication22.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.myapplication22.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.taem1one.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,Taemone.class));
        });
        binding.taem2tow.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,Taemtow.class));
        });
        binding.taem3tery.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,Taemtery.class));
        });
        binding.taem4four.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,Taemfure.class));
        });
    }
}