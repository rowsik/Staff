package com.example.android.happymeals;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class FirebaseData {
    public String itemName;
    public String itemQuantity;

    public FirebaseData() {
    }

    public FirebaseData(String itemName, String itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

}
