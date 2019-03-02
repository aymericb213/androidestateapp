package com.l3.info.android_estate_app;

public class MyObject {
    private String text;
    private String imageUrl;

    public MyObject(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    //getters & setters
    public String getText(){
        return this.text;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }
}
