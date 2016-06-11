package com.example.java.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Contact> contacts;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        contacts = Contact.createContactsList(20);
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
