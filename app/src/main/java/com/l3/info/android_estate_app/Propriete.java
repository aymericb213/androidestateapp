package com.l3.info.android_estate_app;

import java.util.ArrayList;
import java.util.List;

public class Propriete {

    private String id;
    private String titre;
    private String description;

    private int nbPieces;
    private List<String> caracteristiques;//ex : garage, piscine...
    private int prix;

    private String ville;
    private String codePostal;

    private Vendeur vendeur;
    private List<String> images;//liste d'URL
    private long date;

    public Propriete(String id, String titre, String description, int nbPieces, List<String> caracteristiques, int prix, String ville, String codePostal, Vendeur vendeur, List<String> images, long date) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.nbPieces = nbPieces;
        this.caracteristiques = caracteristiques;
        this.prix = prix;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.images = images;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public List<String> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(List<String> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Propriete{" +
                "id='" + id + '\'' +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", nbPieces=" + nbPieces +
                ", caracteristiques=" + caracteristiques +
                ", prix=" + prix +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", vendeur=" + vendeur +
                ", images=" + images +
                ", date=" + date +
                '}';
    }
}
