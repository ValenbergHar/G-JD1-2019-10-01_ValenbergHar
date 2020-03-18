package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleView; // сувязь разметкі з джава кодам
    private RecyclerView.Adapter adapter; // няпоўнае запаўненне RecyclerView
    private RecyclerView.LayoutManager layoutManager; // кіраванне запаўненнем RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<RecycleViewItem> recycleViewItems = new ArrayList<>();

        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "Happy", "Life is fun"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp, "Sad", "Life is sad"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp, "Neutral", "Life is life"));

        recycleView = findViewById(R.id.recycleView);
        recycleView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recycleViewItems);
        layoutManager = new LinearLayoutManager(this);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(layoutManager);
    }
}
