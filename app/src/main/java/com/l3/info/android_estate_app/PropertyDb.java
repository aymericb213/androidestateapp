package com.l3.info.android_estate_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;

public class PropertyDb {

    // Mon SQLiteOpenHelper
    private PropertyDbOpener dbo;

    public PropertyDb(Context context) {
        dbo = new PropertyDbOpener(context);
    }

    public long insert(Propriete prop) {
        ContentValues cv = new ContentValues();
        cv.put("title", prop.getTitre());
        cv.put("description", prop.getDescription());
        cv.put("nb_pieces", prop.getNbPieces());
        //cv.put("features", prop.getCaracteristiques());
        cv.put("price", prop.getPrix());
        cv.put("town", prop.getVille());
        cv.put("postcode", prop.getCodePostal());
        cv.put("seller", prop.getVendeur().getNom());
        //cv.put("pictures", prop.getImages());
        cv.put("timestamp", prop.getDate());
        SQLiteDatabase db = dbo.getWritableDatabase();
        return db.insert( PropertyContract.BD_TABLE, null, cv);
    }

}