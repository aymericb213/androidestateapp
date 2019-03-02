package com.l3.info.android_estate_app;

import android.os.Parcel;
import android.os.Parcelable;

public class Vendeur implements Parcelable {

    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    public Vendeur(String id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<Vendeur> CREATOR = new Parcelable.Creator<Vendeur>(){

        @Override
        public Vendeur createFromParcel(Parcel parcel) {
            return new Vendeur(parcel);
        }

        @Override
        public Vendeur[] newArray(int size) {
            return new Vendeur[0];
        }
    };

    public Vendeur(Parcel parcel) {
        this(
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString()
        );
    }

    //write object values to parcel for storage
    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(id);
        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeString(email);
        dest.writeString(telephone);
    }

    //return hashcode of object
    @Override
    public int describeContents() {
        return hashCode();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}