package em.kh.ua.uij.activity;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import em.kh.ua.uij.R;
import em.kh.ua.uij.fragments.DialogInput;

public class MenuIconsActivity extends AppCompatActivity {

    TextView justText;
    private static final String phone = "tel:+555666777";
    private static final String DIALOG_INPUT = "DialogInput";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_icons);

        justText = findViewById(R.id.just_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_icons, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent;
        switch (id){
            case R.id.menu_phone:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(phone));
                startActivity(intent);
                return true;
            case R.id.menu_about:
                startActivity(new Intent(this, AboutsActivity.class));
                return true;
            case R.id.menu_register:
                DialogInput dialogInput = new DialogInput();
                dialogInput.show(getSupportFragmentManager(), DIALOG_INPUT);
                return true;
            case R.id.menu_change:
                justText.setText("Текст другой");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
