package com.example.androidlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    TextView orderTextView;
    String[] addresses = {"maskevich_valeri@mail.ru"};
    String subject = "OrderFromMusicShop";
    String emailText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setTitle("You Order");

        Intent recievedOrderIntent = getIntent();
        String userName = recievedOrderIntent.getStringExtra("userNameforIntent");
        String goodsName = recievedOrderIntent.getStringExtra("goodsName");
        int quantity = recievedOrderIntent.getIntExtra("quantity", 0);
        double orderPrice = recievedOrderIntent.getDoubleExtra("orderPrice", 0);


        orderTextView = findViewById(R.id.orderTextView);
        emailText = "User Name: " + userName + "\n" + "Goods Name: " + goodsName + "\n" + "Quantity: " + "" + quantity + "\n" + "Order Price: " + "" + orderPrice;
        orderTextView.setText(emailText);

    }

    public void submitOrder(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto"));
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, emailText);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
