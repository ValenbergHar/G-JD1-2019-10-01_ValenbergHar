package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int isFirst = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        switch (isFirst) {
            case (1):
                ImageView tomImageView = findViewById(R.id.tomImage);
                tomImageView.animate().alpha(0).rotation(tomImageView.getRotation()+3600).scaleY(0).scaleX(0).setDuration(3000);
                ImageView jerryImageView = findViewById(R.id.jerryImage);
                jerryImageView.animate().alpha(1).rotation(jerryImageView.getRotation()+3600).scaleY(1).scaleX(1).setDuration(3000);
                isFirst = 2;
                break;
            case (2):
                ImageView jerrryImageView = findViewById(R.id.jerryImage);
                jerrryImageView.animate().alpha(0).rotation(jerrryImageView.getRotation()+3600).scaleY(0).scaleX(0).setDuration(3000);
                ImageView qweImageView = findViewById(R.id.qweImage);
                qweImageView.animate().alpha(1).rotation(qweImageView.getRotation()+3600).scaleY(1).scaleX(1).setDuration(3000);
                isFirst = 3;
                break;
            case (3):
                ImageView rImageView = findViewById(R.id.qweImage);
                rImageView.animate().alpha(0).rotation(rImageView.getRotation()+3600).scaleY(0).scaleX(0).setDuration(3000);
                ImageView tommImageView = findViewById(R.id.tomImage);
                tommImageView.animate().alpha(1).rotation(tommImageView.getRotation()+3600).scaleY(1).scaleX(1).setDuration(3000);
                isFirst = 1;
                break;


        }
    }
}
