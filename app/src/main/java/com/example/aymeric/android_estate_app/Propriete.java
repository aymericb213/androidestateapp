package com.example.aymeric.android_estate_app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Propriete {

    private String id;
    private String title;
    private String description;

    private int nb_rooms;
    private List<String> features;//ex : garage, piscine...
    private int price;

    private String city;
    private int city_postcode;

    private Vendeur seller;
    private List<String> pics;//liste d'URL
    private Date creation_date;

    public Propriete(String id) {
        this.title = "Maison";
        this.description = "C'est une maison";
        this.nb_rooms=2;
        this.features = new ArrayList<String>();
        this.price=20;
        this.city="Caen";
        this.city_postcode=14000;
        this.seller=new Vendeur();
        this.pics= new ArrayList<String>();
        this.creation_date=new Date();
    }
}
