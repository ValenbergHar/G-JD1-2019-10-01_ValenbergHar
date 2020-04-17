package com.example.clubolympus;





import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.clubolympus.data.ClubOlympysContract;


public class AddMemberActivity extends AppCompatActivity {
    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText sportEditText;
    private Spinner genderSpinner;
    private int gender = 0;
    private ArrayAdapter spinnerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        sportEditText = findViewById(R.id.sportEditText);
        genderSpinner = findViewById(R.id.genderSpinner);


        spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.array_gender, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(spinnerAdapter);
        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedGender = (String) adapterView.getItemAtPosition(i);
                if (!TextUtils.isEmpty(selectedGender)) {
                    if (selectedGender.equals("Male")) {
                        gender = ClubOlympysContract.MemberEntry.GENDER_MALE;
                    } else if (selectedGender.equals("Female")) {
                        gender = ClubOlympysContract.MemberEntry.GENDER_FEMALE;
                    } else {
                        gender = ClubOlympysContract.MemberEntry.GENDER_UNKNOWN;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                gender = 0;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit_member_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_member:
                insertMember();
                return true;
            case R.id.delete_member:
                return true;
            case android.R.id.home:
                return true;

        }
        return super.onOptionsItemSelected(item);

    }

    private void insertMember() {
        String firstName = firstNameEditText.getText().toString().trim();
        String lastName = lastNameEditText.getText().toString().trim();
        String sport = sportEditText.getText().toString().trim();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ClubOlympysContract.MemberEntry.COLUMN_FIRST_NAME, firstName);
        contentValues.put(ClubOlympysContract.MemberEntry.COLUMN_LAST_NAME, lastName);
        contentValues.put(ClubOlympysContract.MemberEntry.COLUMN_SPORT, sport);
        contentValues.put(ClubOlympysContract.MemberEntry.COLUMN_GENDER, gender);

        ContentResolver contentResolver = getContentResolver();
        Uri uri = contentResolver.insert(ClubOlympysContract.MemberEntry.CONTENT_URI, contentValues);

        if (uri == null) {
            Toast.makeText(this, "Insertion of data in the table failed for " + uri, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show();
        }
    }
}
