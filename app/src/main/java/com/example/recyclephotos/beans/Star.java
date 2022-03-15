package com.example.recyclephotos.beans;

public class Star {
    private int id;
    private String nom;
    private String image;
    private float star;

    public Star( String nom, String image, float star) {

        this.nom = nom;
        this.image = image;
        this.star = star;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", image='" + image + '\'' +
                ", star=" + star +
                '}';
    }
}
