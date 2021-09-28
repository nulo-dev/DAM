/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nmartinez
 */
public class M_Vaixell{
    
    int codi;
    String nom;
    M_Categoria categoria;
    double rating;
    String club;
    String tipus;
    boolean senior;
    double temps;

    public M_Vaixell(int codi, String nom, M_Categoria categoria, double rating, String club, String tipus, boolean senior, double temps) {
        this.codi = codi;
        this.nom = nom;
        this.categoria = categoria;
        this.rating = rating;
        this.club = club;
        this.tipus = tipus;
        this.senior = senior;
        this.temps = temps;
    }
    public M_Vaixell(){
        
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public M_Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(M_Categoria categoria) {
        this.categoria = categoria;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public double getTemps() {
        return temps;
    }

    public void setTemps(double temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "M_Vaixell{" + "codi=" + codi + ", nom=" + nom + ", categoria=" + categoria + ", rating=" + rating + ", club=" + club + ", tipus=" + tipus + ", senior=" + senior + ", temps=" + temps + '}';
    }
    
}
