package com.rhar.age;

public class Book {

    private String titre, auteur, editeur, edition, codeBarre;
    private int thumbnail;
    private double prix;
    private boolean disponible;

    public Book() {
    }

    public Book(String titre, String auteur, String editeur, String edition, String codeBarre, int thumbnail, double prix, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.edition = edition;
        this.codeBarre = codeBarre;
        this.thumbnail = thumbnail;
        this.prix = prix;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) { this.editeur = editeur; }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public int getThumbnail() { return thumbnail; }

    public void setThumbnail(int thumbnail) { thumbnail = thumbnail; }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
