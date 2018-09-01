package com.example.android.happymeals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        ValueEventListener postListner =new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
            
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        FirebaseDatabase.getInstance().getReference().child("1").addValueEventListener(postListner);
    }
}

