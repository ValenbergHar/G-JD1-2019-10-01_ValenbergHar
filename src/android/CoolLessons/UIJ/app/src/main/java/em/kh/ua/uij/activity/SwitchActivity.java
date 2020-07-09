package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import android.widget.TextView;

import em.kh.ua.uij.R;

public class SwitchActivity extends AppCompatActivity {

    SwitchMaterial btnSwitch;
    TextView tvSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        btnSwitch = findViewById(R.id.btn_switch);
        tvSwitch = findViewById(R.id.tv_switch);


        btnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tvSwitch.setText(R.string.tv_switch_on);
                    tvSwitch.setTextColor(getResources().getColor(R.color.colorOrange));
                } else {
                    tvSwitch.setText(R.string.tv_switch_off);
                    tvSwitch.setTextColor(getResources().getColor(R.color.colorGray));
                }
            }
        });


    }
}
