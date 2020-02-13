package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int quantity;
    private int price=10;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view) {
        display(++quantity);

    }
    public void decrement(View view) {
        display(quantity<=0?quantity:--quantity);

    }

    private void display ( int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(createOrderSummary (name, quantity));
        //priceTextView.setText(""+number);
        //(NumberFormat.getCurrencyInstance(new Locale("hi", "IN")).format(""+number));
    }

    public void order(View view) {

        displayPrice(price*quantity);
        Toast.makeText(this, "Шчыры Дзяк!", Toast.LENGTH_SHORT).show();
    }

    public String createOrderSummary (String name, int quantity){
        return "Name: " + name + "\n" + "Quantity: " + quantity + "\n" + "Total: $" + price*quantity +"\n";
    }



}
