package com.example.layoutcoord;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener, View.OnClickListener {
private PopupMenu popupMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerForContextMenu(findViewById(R.id.hello));
        popupMenu = new PopupMenu(this,findViewById(R.id.yo));
        popupMenu.inflate(R.menu.popup);
        popupMenu.setOnMenuItemClickListener(this);

        findViewById(R.id.hello).setOnClickListener(this);


    }

    public void click(View view) {
        Toast.makeText(this, "dcdafsddaf", Toast.LENGTH_LONG).show();
       // Snackbar.make(findViewById(R.id.coordinator), "hvjhbk", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId()==R.id.hello){
            getMenuInflater().inflate(R.menu.context, menu);
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()) {
           case R.id.df:
               Toast.makeText(this,
                       "df", Toast.LENGTH_LONG).show();
           case R.id.main_add:
               Toast.makeText(this,
                       "main", Toast.LENGTH_LONG).show();
       }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId()==R.id.popup_){
            Toast.makeText(this,
                    "main", Toast.LENGTH_LONG).show();
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        popupMenu.show();
    }
}
