package com.example.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int counter;

    private EditText edit;
    private TextView textView;
    private Button button;
    private static final String KEY_COUNTER = "COUNTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        edit = findViewById(R.id.edit);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(KEY_COUNTER, counter);
        }
        textView.setText("" + counter);
    }




    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNTER, counter);
    }

    @Override
    public void onClick(View v) {
        counter++;
        textView.setText("" + counter);
    }

    public void start(View view) {
        String data = edit.getText().toString();
        Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse(data)
        );
        startActivity(intent);
    }
}
