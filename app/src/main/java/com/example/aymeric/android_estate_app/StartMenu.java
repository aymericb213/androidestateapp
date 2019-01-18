package com.example.aymeric.android_estate_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }


    public void randomProperty(View view) {
        setContentView(R.layout.activity_property_view);
    }
}
