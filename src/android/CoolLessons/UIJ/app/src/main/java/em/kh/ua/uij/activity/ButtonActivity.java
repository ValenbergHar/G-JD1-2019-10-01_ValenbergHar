package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import android.widget.Toast;

import em.kh.ua.uij.R;
import em.kh.ua.uij.utilities.SnackBarFactory;


public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    final Context context = this;
    MaterialButton btnSimple;
    MaterialButton btnDefault;
    MaterialButton btnRounded;
    MaterialButton btnCutted;
    MaterialButton btnTexted;
    MaterialButton btnOutlined;
    MaterialButton btnIconed;
    MaterialButton btnIconedRt;
    MaterialButton btnTextIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btnSimple = findViewById(R.id.btn_simple);
        btnSimple.setOnClickListener(this);

        btnDefault = findViewById(R.id.btn_default);
        btnDefault.setOnClickListener(this);

        btnRounded = findViewById(R.id.btn_rounded);
        btnRounded.setOnClickListener(this);

        btnCutted = findViewById(R.id.btn_cutted);
        btnCutted.setOnClickListener(this);

        btnTexted = findViewById(R.id.btn_texted);
        btnTexted.setOnClickListener(this);

        btnOutlined = findViewById(R.id.btn_outlined);
        btnOutlined.setOnClickListener(this);

        btnIconed = findViewById(R.id.btn_iconed);
        btnIconed.setOnClickListener(this);

        btnIconedRt = findViewById(R.id.btn_iconed_rt);
        btnIconedRt.setOnClickListener(this);

        btnTextIcon = findViewById(R.id.btn_text_icon);
        btnTextIcon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_iconed:
                Toast.makeText(this,R.string.toast_button_iconed,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_simple:
            case R.id.btn_default:
            case R.id.btn_rounded:
            case R.id.btn_texted:
            case R.id.btn_outlined:
                Toast.makeText(this,R.string.toast_button,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_cutted:
            case R.id.btn_iconed_rt:
            case R.id.btn_text_icon:
                SnackBarFactory.showSnackBarSimple(context);
                break;
            default:
                break;
        }
    }
}
