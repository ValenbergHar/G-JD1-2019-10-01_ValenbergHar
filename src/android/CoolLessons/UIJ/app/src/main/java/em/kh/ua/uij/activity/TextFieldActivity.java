package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.santalu.maskedittext.MaskEditText;

import em.kh.ua.uij.R;


public class TextFieldActivity extends AppCompatActivity {

    MaskEditText etPhoneMask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_field);

        etPhoneMask = findViewById(R.id.et_phone_mask);
    }

    // показываем маску телефона
    public void showMaskedPhone(View view){
        Toast.makeText(this,etPhoneMask.getText(),Toast.LENGTH_LONG).show();
    }

}