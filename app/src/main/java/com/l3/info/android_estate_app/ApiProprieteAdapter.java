package com.l3.info.android_estate_app;

import android.util.Log;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.ToJson;

import java.io.IOException;
import java.util.List;

public class ApiProprieteAdapter {

    @ToJson
    public String toJson(Propriete propriete) {
        return propriete.getId() + propriete.getTitre().substring(0,1);
    }

    @FromJson
    public Propriete fromJson(JsonReader reader, JsonAdapter<Propriete> delegate) throws IOException {
        Propriete result = null;

        // démarrer le parsing du Json
        reader.beginObject();
        while (reader.hasNext()) {
            // récupérer le nom de la clé
            String name = reader.nextName();
            if (name.equals("success")) {
                boolean success = reader.nextBoolean();
                Log.i("JML", "Success vaut " + success);
                if (!success) {
                    throw new IOException("API a répondu FALSE");
                }
            } else if (name.equals("response")) {
                // déléguer l'extraction à l'adapteur qui transforme du Json en Personne

                result=delegate.fromJson(reader);
            } else {
                // dans notre cas on ne devrait pas avoir d'autres clés que success et response dans le Json
                throw new IOException("Response contient des données non conformes");
            }
        }
        // fermer le reader
        reader.endObject();
        return result;
    }
}