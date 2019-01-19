package com.l3.info.android_estate_app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        checkConnectivity(this);
    }


    protected void checkConnectivity(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null && activeNetwork.isConnected()) {
            // connecté à l'internet
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                // connecté au wifi
                Snackbar.make( findViewById(R.id.start), "Connecté au Wifi", Snackbar.LENGTH_LONG).show();
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                // connected to the mobile provider's data plan
                Snackbar.make( findViewById(R.id.start), "Connecté au data", Snackbar.LENGTH_LONG).show();
            }
        } else {
            // non connecté
            Snackbar.make( findViewById(R.id.start), "Non connecté", Snackbar.LENGTH_LONG).show();
        }
    }

    public void randomProperty(View view) {
        setContentView(R.layout.activity_property_view);
    }
}
