package com.example.alishev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;

import static com.example.alishev.utils.Network_utils.generatedURL;
import static com.example.alishev.utils.Network_utils.getResponceFromURL;

public class MainActivity extends AppCompatActivity {
    private EditText searchField;
    private Button searchButton;
    private TextView result;

    class VKQueryTask extends AsyncTask<URL, Void, String>{


        @Override
        protected String doInBackground(URL... urls) {
            String response = null;
            try {
                response = getResponceFromURL(urls[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  response;
        }
        @Override
        protected void onPostExecute(String response){

            //result.setText(response);
            String firstName = null;
            String lastName = null;

            try {
                JSONObject jsonResponse= new JSONObject(response);
                JSONArray jsonArray = jsonResponse.getJSONArray("response");
                JSONObject userInfo = jsonArray.getJSONObject(0);
                firstName = userInfo.getString("first_name");
                lastName = userInfo.getString("last_name");

            } catch (JSONException e) {
                e.printStackTrace();
            }
            String resultString = "First name: " + firstName + "\n" + "Last name: " + lastName;



            result.setText(resultString);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = findViewById(R.id.et_search_field);
        searchButton = findViewById(R.id.b_search_id);
        result= findViewById(R.id.result);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL generatedURL = generatedURL(searchField.getText().toString());
                new VKQueryTask().execute(generatedURL);
            }
        };
        searchButton.setOnClickListener(onClickListener);
    }
}
