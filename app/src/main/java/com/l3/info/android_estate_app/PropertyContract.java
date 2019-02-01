package com.l3.info.android_estate_app;

import android.provider.BaseColumns;

public class PropertyContract implements BaseColumns{

    public static final String BD_TABLE = "properties";
    public static final String COL_ID = "_id";
    public static final String COL_TITLE = "title";
    public static final String COL_DESC = "description";
    public static final String COL_PIECES = "nb_pieces";
    public static final String COL_FEATS = "features";
    public static final String COL_PRICE = "price";
    public static final String COL_TOWN_ = "town";
    public static final String COL_POSTCODE = "postcode";
    public static final String COL_SELLER = "seller";
    public static final String COL_PICS = "pictures";
    public static final String COL_DATE = "timestamp";
}
