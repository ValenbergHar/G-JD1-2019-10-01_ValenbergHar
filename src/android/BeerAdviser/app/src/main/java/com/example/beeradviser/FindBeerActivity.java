package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
//Получить ссылку на TextView
        TextView brands =  findViewById(R.id.brands);
//Получить ссылку на Spinner
        Spinner color =  findViewById(R.id.color);
//Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
//Вывести выбранный вариант
        brands.setText(beerType);
    }
}
