package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView pausePlayIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stuff);
        pausePlayIcon = findViewById(R.id.playIconImageView);
    }

    public void prev(View view) {

    }

    public void play(View view) {

    }

    public void next(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            pausePlayIcon.setImageResource(R.drawable.ic_play_arrow_yellow_24dp);
        }else{
            mediaPlayer.start();
            pausePlayIcon.setImageResource(R.drawable.ic_pause_black_24dp);
        }
    }
}
