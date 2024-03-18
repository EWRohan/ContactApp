package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Container> arrItems= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrItems.add(new Container(R.drawable.a,"Rohan","6291392900"));
        arrItems.add(new Container(R.drawable.b,"Abhash","6291392900"));
        arrItems.add(new Container(R.drawable.c,"Aniket","6291392900"));
        arrItems.add(new Container(R.drawable.d,"Koley","6291392900"));
        arrItems.add(new Container(R.drawable.a,"Rohan","6291392900"));
        arrItems.add(new Container(R.drawable.b,"Abhash","6291392900"));
        arrItems.add(new Container(R.drawable.c,"Aniket","6291392900"));
        arrItems.add(new Container(R.drawable.d,"Koley","6291392900"));
        arrItems.add(new Container(R.drawable.a,"Rohan","6291392900"));
        arrItems.add(new Container(R.drawable.b,"Abhash","6291392900"));
        arrItems.add(new Container(R.drawable.c,"Aniket","6291392900"));
        arrItems.add(new Container(R.drawable.d,"Koley","6291392900"));
        arrItems.add(new Container(R.drawable.a,"Rohan","6291392900"));
        arrItems.add(new Container(R.drawable.b,"Abhash","6291392900"));
        arrItems.add(new Container(R.drawable.c,"Aniket","6291392900"));
        arrItems.add(new Container(R.drawable.d,"Koley","6291392900"));
        RecycleAdapter adapter=new RecycleAdapter(this,arrItems);
        recyclerView.setAdapter(adapter);
    }
}