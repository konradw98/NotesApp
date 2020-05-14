package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lisView= findViewById(R.id.listView);
        notes.add("Example Notes");
 

        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_gallery_item, notes);
        lisView.setAdapter(arrayAdapter);

    }
}
