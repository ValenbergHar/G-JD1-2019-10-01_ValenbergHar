package em.kh.ua.uij.activity;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import em.kh.ua.uij.R;

public class MenuGroupActivity extends AppCompatActivity {

    TextView justText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_group);

        justText = findViewById(R.id.just_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_group, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.menu_like:
                Toast.makeText(MenuGroupActivity.this,
                        R.string.toast_like, Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onSizeChoice(MenuItem item){
        if(item.getItemId() == R.id.menu_small){
            item.setChecked(true);
            justText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
        }else if (item.getItemId() == R.id.menu_big){
            item.setChecked(true);
            justText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 56f);
        }else {
            justText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f);
        }
    }

    public void onColorChoice(MenuItem item){
        if(item.getItemId() == R.id.menu_green){
            item.setChecked(true);
            justText.setTextColor(Color.GREEN);
        }else if (item.getItemId() == R.id.menu_red){
            item.setChecked(true);
            justText.setTextColor(Color.RED);
        }else {
            justText.setTextColor(Color.BLACK);
        }
    }

}
