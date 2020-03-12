package com.example.playingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int variant = 1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.stuff);
    }

    public void play(View view) {
        switch (variant) {
            case (1):
                mediaPlayer.start();
                button = findViewById(R.id.play);
                button.setText("PLAY");
                variant = 2;
                break;
            case (2):
                mediaPlayer.pause();
                button = findViewById(R.id.play);
                button.setText("STOP");
                variant = 1;
                break;
        }
    }
}
