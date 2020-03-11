package com.example.androidlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView quantity_text;
    int quantity = 0;
    Spinner spinner;
    List spinnerList;
    ArrayAdapter spinnerAdapter;
    String goodsName;
    double price;
    HashMap goodsMap;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        spinnerList = new ArrayList();
        spinnerList.add("guitar");
        spinnerList.add("bass");
        spinnerList.add("drums");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        goodsMap = new HashMap();
        goodsMap.put("guitar", 500.0);
        goodsMap.put("bass", 600.0);
        goodsMap.put("drums", 700.0);

    }

    public void increaseQuantity(View view) {

        quantity_text = findViewById(R.id.quantity_text);
        quantity_text.setText("" + (++quantity));
        priceTextView = findViewById(R.id.order_price);
        priceTextView.setText("" + price * quantity);

    }

    public void decreaseQuantity(View view) {
        quantity_text = findViewById(R.id.quantity_text);
        quantity_text.setText("" + (quantity <= 0 ? quantity : --quantity));
        priceTextView = findViewById(R.id.order_price);
        priceTextView.setText("" + price * quantity);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        goodsName = spinner.getSelectedItem().toString();
        price = (double) goodsMap.get(goodsName);
        priceTextView = findViewById(R.id.order_price);
        priceTextView.setText("" + price * quantity);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
