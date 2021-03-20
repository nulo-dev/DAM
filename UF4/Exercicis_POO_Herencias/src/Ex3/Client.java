/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public abstract class Client {
    
    String dni;
    String nom;
    String any_naixement;
    int edat;
    double pes;
    double alçada;
    
    public Client(String dni, String nom, String any_naixement, int edat, double alçada, double pes) {
        this.dni = dni;
        this.nom = nom;
        this.any_naixement = any_naixement;
        this.edat = edat;
        this.alçada = alçada;
        this.pes = pes;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAny_naixement() {
        return any_naixement;
    }

    public void setAny_naixement(String any_naixement) {
        this.any_naixement = any_naixement;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getAlçada() {
        return alçada;
    }

    public void setAlçada(double alçada) {
        this.alçada = alçada;
    }

    public abstract double Calorias();

    @Override
    public String toString() {
        return "\nClient{" + "dni=" + dni + ", nom=" + nom + ", any_naixement=" + any_naixement + ", edat=" + edat + ", al\u00e7ada=" + alçada + " Calorias: " + this.Calorias() + '}';
    }
    
    
    
}
