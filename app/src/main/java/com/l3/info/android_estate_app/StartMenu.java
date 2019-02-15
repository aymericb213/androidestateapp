package com.l3.info.android_estate_app;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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

    private void makeHttpRequest(String url) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected HTTP code " + response);
                    }
                    Moshi moshi = new Moshi.Builder().add(new ApiProprieteAdapter()).build();
                    JsonAdapter<Propriete> jsonAdapter = moshi.adapter(Propriete.class);
                    Propriete test = jsonAdapter.fromJson(responseBody.string());
                    Log.i("maison", test.toString());
                    updateUI(test);
                }
            }
        });
    }

    private void updateUI(Propriete p){
      Intent intent = new Intent(this, PropertyView.class);
      Propriete propriete = p;
      intent.putExtra("Propriete", propriete);
      startActivity(intent);
    }

    public void randomProperty(View view) {
        makeHttpRequest("https://ensweb.users.info.unicaen.fr/android-estate/mock-api/immobilier.json");
    }

    public void listProperties(View view) {
        makeHttpRequest("https://ensweb.users.info.unicaen.fr/android-estate/mock-api/liste.json");

    }

    public void addProperty(View view) {
        setContentView(R.layout.activity_property_form);
    }
}
