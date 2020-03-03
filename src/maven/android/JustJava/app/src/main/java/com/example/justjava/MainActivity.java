package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private int count;
    private int price=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view) {
        display(++count);
        displayPrice(price*count);

    }
    public void decrement(View view) {
        display(count<=0?count:--count);
        displayPrice(price*count);
    }

        private void display ( int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
        }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(""+number);
        //(NumberFormat.getCurrencyInstance(new Locale("hi", "IN")).format(""+number));
    }
    }
