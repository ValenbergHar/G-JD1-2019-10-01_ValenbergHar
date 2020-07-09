package com.example.animals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;

import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_arrow_up:
                orderBy = AnimalsTable.COLUMN_ANIMAL + " asc ";
                updateCursor();
                return true;
            case R.id.main_arrow_down:
                orderBy = AnimalsTable.COLUMN_ANIMAL + " desc ";
                updateCursor();
                return true;
            case R.id.main_search:

                return true;
            case R.id.main_plus:

                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
