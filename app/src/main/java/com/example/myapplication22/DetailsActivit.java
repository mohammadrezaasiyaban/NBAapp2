package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication22.databinding.ActivityDetailsBinding;
import com.example.myapplication22.recyclerview.TeamImage;

public class DetailsActivit extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    private String image_photo, info_team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        image_photo = getIntent().getStringExtra(TeamImage.INFO_IMAGE_KEY);
        info_team = getIntent().getStringExtra(TeamImage.INFO_TEAM_KEY);


        Glide.with(this)
                .load(image_photo)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(binding.imageTeamsFlag);
        binding.textTeamsFlag.setText(info_team);


        binding.back.setOnClickListener(v -> {
            startActivity(new Intent(DetailsActivit.this, MainActivity.class));
        });
    }

}