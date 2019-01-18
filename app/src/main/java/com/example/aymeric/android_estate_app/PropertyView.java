package com.example.aymeric.android_estate_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PropertyView extends AppCompatActivity {

    private Propriete client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_view);
    }
}
