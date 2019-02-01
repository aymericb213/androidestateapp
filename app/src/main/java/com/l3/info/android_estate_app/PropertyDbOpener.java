package com.l3.info.android_estate_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PropertyDbOpener extends SQLiteOpenHelper {

    public static final String BD_NAME = "properties.db";
    public static final int BD_VERSION = 1;

    public PropertyDbOpener(Context context) {
        super(context, BD_NAME, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + PropertyContract.BD_TABLE + "(" +
                PropertyContract.COL_ID + " INTEGER PRIMARY KEY," +
                PropertyContract.COL_TITLE + " TEXT," +
                PropertyContract.COL_DESC + " TEXT," +
                PropertyContract.COL_PIECES + " INTEGER," +
                PropertyContract.COL_FEATS + " TEXT," +
                PropertyContract.COL_PRICE + " INTEGER," +
                PropertyContract.COL_TOWN_+ " TEXT," +
                PropertyContract.COL_POSTCODE + " TEXT," +
                PropertyContract.COL_SELLER + " TEXT," +
                PropertyContract.COL_PICS + " TEXT," +
                PropertyContract.COL_DATE + "DATETIME)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + PropertyContract.BD_TABLE);
        onCreate(db);
    }
}