package com.l3.info.android_estate_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewPropertyFormView extends AppCompatActivity {

    public PropertyDb db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_form);
        new PropertyContract();
        db = new PropertyDb(getApplicationContext());
    }

    public void insert(View view) {
        long id = db.insert(new Propriete());
        Toast.makeText(getApplicationContext(), "Message enregistré avec le numéro " + id, 3).show();
    }
}