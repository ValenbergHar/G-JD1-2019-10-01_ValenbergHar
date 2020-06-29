package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> stations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);

        stations.add("xfghgfh");
        stations.add("xfgdghdhhgfh");
        stations.add("xfdghdfhhgfh");
        stations.add("xfghgfh");
        stations.add("xfgzdfzhgfh");
        stations.add("xffzdfhghgfh");
        stations.add("xfgzdgnhgfh");
        stations.add("xfghgfh");
        stations.add("xfgzgnhgfh");
        stations.add("xfgzdgnhgfh");
        stations.add("xfghgfh");
        stations.add("xfggndfhsfghgfh");
        stations.add("xfgzdgnfgndfghgfh");
        stations.add("xfghsfdgdvbdsfbgfh");
        stations.add("ў");

        MetroAdapter adapter = new MetroAdapter(this, R.layout.item, stations);
        listView.setAdapter(adapter);
    }
}
