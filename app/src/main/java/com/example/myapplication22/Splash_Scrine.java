package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.example.myapplication22.databinding.ActivitySplashScrineBinding;

public class Splash_Scrine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.myapplication22.databinding.ActivitySplashScrineBinding binding = ActivitySplashScrineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Handler handler;

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_Scrine.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },7000);


        VideoView videoView =findViewById(R.raw.splash);
        Uri uri=Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.splash);
        binding.videoView.setVideoURI(uri);
        binding.videoView.start();

        binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });





    }
}