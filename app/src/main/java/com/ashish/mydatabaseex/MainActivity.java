package com.ashish.mydatabaseex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

        dbHelper.insertContacts("Ashish", "9889583686");
        dbHelper.insertContacts("Ritika", "9653088544");
        dbHelper.insertContacts("Mommy", "9616885575");
    }
}