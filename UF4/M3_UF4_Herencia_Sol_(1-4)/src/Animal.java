/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class Animal {
    private String nom;
    private int edat;

    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Animal{" + "nom=" + nom + ", edat=" + edat + '}';
    }       
}
