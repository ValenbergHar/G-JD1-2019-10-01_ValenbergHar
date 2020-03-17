package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = findViewById(R.id.listView);
        final ArrayList<String> post = new ArrayList<>();


        post.add("Чырвоны" );
        post.add("Аранжавы" );
        post.add("Жоўты" );
        post.add("Зялёны" );
        post.add("Блакітны" );
        post.add("Сіні" );
        post.add("Фіялетавы" );



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, post);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //parent.setVisibility(View.GONE);
                //view.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Нумар " + position + " - " + post.get(position), Toast.LENGTH_SHORT).show();


//                switch (post.get(position))
//                {
//                    case ("Чырвоны"):
//                        Toast.makeText(MainActivity.this, "Чырвоны", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Аранжавы"):
//                        Toast.makeText(MainActivity.this, "Аранжавы", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Жоўты"):
//                        Toast.makeText(MainActivity.this, "Жоўты", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Зялёны"):
//                        Toast.makeText(MainActivity.this, "Зялёны", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Блакітны"):
//                        Toast.makeText(MainActivity.this, "Блакітны", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Сіні"):
//                        Toast.makeText(MainActivity.this, "Сіні", Toast.LENGTH_SHORT).show();
//                        break;
//                    case ("Фіялетавы"):
//                        Toast.makeText(MainActivity.this, "Фіялетавы", Toast.LENGTH_SHORT).show();
//                        break;
//
//
//                }
            }
        });

    }
}
