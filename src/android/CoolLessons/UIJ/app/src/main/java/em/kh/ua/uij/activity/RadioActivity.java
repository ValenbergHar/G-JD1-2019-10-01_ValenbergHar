package em.kh.ua.uij.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.radiobutton.MaterialRadioButton;

import em.kh.ua.uij.R;

public class RadioActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }

    public void onClickRadio(View view) {

        boolean checked = ((MaterialRadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rb_fruit:
                if (checked)
                    Toast.makeText(context, R.string.rb_fruit, Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb_veges:
                if (checked)
                    Toast.makeText(context, R.string.rb_veges, Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb_berry:
                if (checked)
                    Toast.makeText(context, R.string.rb_berry, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_water:
                if (checked)
                    Toast.makeText(context, R.string.rb_water, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
