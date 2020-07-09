package ua.kh.em.desl.ui.bottomappbar;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ua.kh.em.desl.R;

public class BottomAppbarActivity extends AppCompatActivity {

    private Context context = this;
    Toolbar toolbar;
    BottomAppBar bar;
    FloatingActionButton fab;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_appbar);

        setupToolbar();
        setupNavMenu();
        setupFab();
    }


    private void setupToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupNavMenu() {
        bar = findViewById(R.id.bar);
        drawerLayout = findViewById(R.id.drawer_layout_1);
        //        bar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              // handling clicks
//            }
//        });
        bar.setNavigationOnClickListener(view ->
                drawerLayout.openDrawer(GravityCompat.START));

        bar.replaceMenu(R.menu.menu_bottom_appbar);
        bar.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()){
                case R.id.menu_item_info:
                case R.id.menu_item_transport:
                case R.id.menu_item_place:
                    Toast.makeText(context,R.string.app_name,Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });

    }

    private void setupFab() {
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
                Toast toast = Toast.makeText(context, "FAB clicked!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
                        0, 0);
                toast.show();
            }
        );
    }

}
