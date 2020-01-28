package com.example.keepitapplication2020;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          //DatabaseReference reference;
       // reference = FirebaseDatabase.getInstance().getReference("Database").child("Text");
        //reference.setValue("maram");
        //this is my test
    }
}
