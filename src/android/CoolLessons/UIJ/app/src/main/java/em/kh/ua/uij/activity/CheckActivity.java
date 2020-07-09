package em.kh.ua.uij.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

import em.kh.ua.uij.R;

public class CheckActivity extends AppCompatActivity {

    Context context = this;
    MaterialCheckBox chFruit;
    MaterialCheckBox chVeges;
    MaterialCheckBox chBerry;
    MaterialCheckBox chWater;
    MaterialButton btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        chFruit = findViewById(R.id.ch_fruit);
        chVeges = findViewById(R.id.ch_veges);
        chBerry = findViewById(R.id.ch_berry);
        chWater = findViewById(R.id.ch_water);
        btnOrder = findViewById(R.id.btn_order);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder order = new StringBuilder();
                order.append("Ваш выбор:");

                if(chFruit.isChecked()){
                    order.append("\nФрукты");
                }
                if (chVeges.isChecked()){
                    order.append("\nОвощи");
                }
                if (chBerry.isChecked()){
                    order.append("\nЯгоды");
                }
                if (chWater.isChecked()){
                    order.append("\nВода");
                }
                Toast.makeText(context, order.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
