package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private AnimalsHelper helper;
    private SimpleCursorAdapter adapter;
    private String selection;
    private String[] selectionsArgs;
    private String orderBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        listView.setEmptyView(findViewById(R.id.notfound));

        helper = new AnimalsHelper(this);
        adapter = new SimpleCursorAdapter(
                this,
                android.R.layout.simple_list_item_1,
                null,
                new String[]{AnimalsTable.COLUMN_ANIMAL},
                new int[]{android.R.id.text1},
                0

        );
        listView.setAdapter(adapter);
        updateCursor();
    }

    private void updateCursor() {
        Cursor cursor = helper.getReadableDatabase().query(
                AnimalsTable.TABLE_ANIMALS,
                null,
                selection,
                selectionsArgs,
                null,
                null,
                orderBy
                );

        adapter.swapCursor(cursor);
    }
}
