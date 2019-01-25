package com.l3.info.android_estate_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.widget.TextView;

public class PropertyView extends AppCompatActivity {

    TextView title = findViewById(R.id.property_title);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_view);
        Intent intent = getIntent();
        Propriete propriete = intent.getParcelableExtra("Property");
        title.setText(propriete.getTitre());
    }

}
