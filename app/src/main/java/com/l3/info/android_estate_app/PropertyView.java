package com.l3.info.android_estate_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Date;

public class PropertyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_view);
        Intent intent = getIntent();
        Propriete propriete;
        //Log.i("prop", intent.getParcelableExtra("propriete").toString());
        if (intent.getParcelableExtra("propriete") != null) {
            propriete = getIntent().getParcelableExtra("propriete");
        } else {
            propriete = new Propriete(
                    "1",
                    "Maison",
                    "Super maison",
                    5,
                    new ArrayList<String>(),
                    1005600,
                    "Caen",
                    "14000",
                    new Vendeur(
                            "76",
                            "Bob",
                            "Bobby",
                            "Boby@gmail.com",
                            "0215653289"
                    ),
                    new ArrayList<String>(),
                    new Date().getDate()
            );
        }
        fillAnnonce(propriete);
    }


    public void fillAnnonce(Propriete propriete) {
        ((TextView) findViewById(R.id.property_title)).setText(propriete.getTitre());
        ((TextView) findViewById(R.id.property_price)).setText(propriete.getPrix() + " €");
        ((TextView) findViewById(R.id.property_city)).setText(propriete.getVille());
        ((TextView) findViewById(R.id.property_description)).setText(propriete.getDescription());
        ((TextView) findViewById(R.id.ad_creation)).setText(new Date(propriete.getDate()).toString());
        ((TextView) findViewById(R.id.seller_name)).setText(propriete.getVendeur().getNom());
        ((TextView) findViewById(R.id.seller_mail)).setText(propriete.getVendeur().getEmail());
        ((TextView) findViewById(R.id.seller_phone)).setText(propriete.getVendeur().getTelephone());
        /*ImageView image = (ImageView) findViewById(R.id.ad_image);
        Picasso.get().load(
                propriete.getImages().get(0)
        ).into(image);*/
    }

}
