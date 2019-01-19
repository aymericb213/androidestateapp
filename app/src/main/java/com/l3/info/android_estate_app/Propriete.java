package com.l3.info.android_estate_app;

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
    private String city_postcode;

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
        this.city_postcode="14000";
        this.seller=new Vendeur();
        this.pics= new ArrayList<String>();
        this.creation_date=new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_rooms() {
        return nb_rooms;
    }

    public void setNb_rooms(int nb_rooms) {
        this.nb_rooms = nb_rooms;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_postcode() {
        return city_postcode;
    }

    public void setCity_postcode(String city_postcode) {
        this.city_postcode = city_postcode;
    }

    public Vendeur getSeller() {
        return seller;
    }

    public void setSeller(Vendeur seller) {
        this.seller = seller;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
