package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.chip.Chip;

import em.kh.ua.uij.R;
import em.kh.ua.uij.utilities.ToastFactory;

public class ChipActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);

        Chip chip1 = findViewById(R.id.chip_1);

        chip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastFactory.showToastBasic(context);
            }
        });


        Chip chip2 = findViewById(R.id.chip_2);

        chip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastFactory.showToastBasic(context);
            }
        });

    }
}
