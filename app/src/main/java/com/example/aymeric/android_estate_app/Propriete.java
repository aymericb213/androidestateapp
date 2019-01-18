package com.example.aymeric.android_estate_app;

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
}
