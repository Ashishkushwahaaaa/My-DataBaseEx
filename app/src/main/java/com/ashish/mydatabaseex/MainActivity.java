package com.ashish.mydatabaseex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

            //Comment out because as many times it will execute so many time this data will be added in the database;
            //The insertion of the data in most cases should be done on the click of the users;
//        dbHelper.insertContacts("Ashish", "9889583686");
//        dbHelper.insertContacts("Ritika", "9653088544");
//        dbHelper.insertContacts("Mommy", "9616885575");


        //Updating the data;
        ContactsModel contactsModel = new ContactsModel();
        contactsModel.id = 1;
        contactsModel.name = "Ashish"; //Not required here as we are not updating the name;
        contactsModel.phone_no = "7983924706";
        dbHelper.updateContacts(contactsModel);


        //Fetching the data;
        ArrayList<ContactsModel> contacts = dbHelper.fetchContacts();
        for(int i = 0; i < contacts.size(); i++){
            Log.d("Contacts_Info", "Name: " + contacts.get(i).name + ", Phone_no: " + contacts.get(i).phone_no);
        }

        // Or we can use for each loop;
//        for(ContactsModel model : dbHelper.fetchContacts()){
//            Log.d("Contacts_Info" , "Name: " + model.name + ", Phone_no: " + model.phone_no);
//        }
    }
}