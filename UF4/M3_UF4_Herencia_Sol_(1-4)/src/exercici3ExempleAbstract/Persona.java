/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3ExempleAbstract;

/**
 *
 * @author Alfredo
 */
public abstract class Persona {
    
    /** nom del treballador */
    protected String nom;
    /** dni del treballador */
    protected String dni;
    /** adreca del treballador */
    protected String adreca;

    public Persona(String nom, String dni, String adreca) {
        this.nom = nom;
        this.dni = dni;
        this.adreca = adreca;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", dni=" + dni + ", adreca=" + adreca + '}';
    }
    
    
}
