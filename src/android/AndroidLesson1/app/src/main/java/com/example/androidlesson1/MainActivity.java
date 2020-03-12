package com.example.androidlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
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
    ImageView goodsImageView;
    EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSpinner();
        createMap();
        userNameEditText = findViewById(R.id.editText);
    }

    public void createSpinner() {
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        spinnerList = new ArrayList();
        spinnerList.add("guitar");
        spinnerList.add("bass");
        spinnerList.add("drums");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
    }

    public void createMap() {
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


        goodsImageView = findViewById(R.id.imagine_center);

        switch (goodsName) {
            case ("guitar"):
                goodsImageView.setImageResource(R.drawable.jaryla);
                break;
            case ("bass"):
                goodsImageView.setImageResource(R.drawable.khlieb);
                break;
            case ("drums"):
                goodsImageView.setImageResource(R.drawable.piesnia);
                break;
            default:
                goodsImageView.setImageResource(R.drawable.vasmi_rog);

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void addToCard(View view) {
        Order order = new Order();
        order.userName = userNameEditText.getText().toString();
        Log.d("userName", order.userName);
        order.goodsName = goodsName;
        Log.d("goodsName", order.goodsName);
        order.quantity = quantity;
        Log.d("quantity", "" + order.quantity);
        order.orderPrice = quantity * price;
        Log.d("orderPrice", "" + order.orderPrice);

        Intent orderIntent = new Intent(this, OrderActivity.class);

        orderIntent.putExtra("userNameforIntent", order.userName);
        orderIntent.putExtra("goodsName", order.goodsName);
        orderIntent.putExtra("quantity", order.quantity);
        orderIntent.putExtra("orderPrice", order.orderPrice);


        startActivity(orderIntent);


    }
}