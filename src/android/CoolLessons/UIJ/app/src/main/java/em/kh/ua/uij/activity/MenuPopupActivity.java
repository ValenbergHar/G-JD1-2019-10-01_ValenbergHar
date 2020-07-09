package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import em.kh.ua.uij.R;
import em.kh.ua.uij.fragments.DialogInput;

public class MenuPopupActivity extends AppCompatActivity {

    Button actionButton;
    TextView justText;
    private static final String DIALOG_INPUT = "DialogInput";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_popup);

        justText = findViewById(R.id.just_text);

        actionButton = findViewById(R.id.button_action);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MenuPopupActivity.this, actionButton);

                popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu_register:
                                DialogInput dialogInput = new DialogInput();
                                dialogInput.show(getSupportFragmentManager(), DIALOG_INPUT);
                                return true;
                            case R.id.menu_change:
                                justText.setText("Текст другой");
                                return true;
                            case R.id.menu_nothing:
                                Toast.makeText(MenuPopupActivity.this,
                                        R.string.toast_nothing, Toast.LENGTH_LONG).show();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });
    }
}
