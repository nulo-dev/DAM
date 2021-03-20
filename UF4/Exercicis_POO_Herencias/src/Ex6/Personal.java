/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

/**
 *
 * @author nmartinez
 */
public abstract class Personal {
    
    String dni;
    String nom;

    public Personal(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }
    
    abstract double calculSou();

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

    @Override
    public String toString() {
        return "Personal{" + "dni=" + dni + ", nom=" + nom + '}';
    }
    
    
    
}
