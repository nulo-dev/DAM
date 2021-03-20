/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici4_Institut;

/**
 *
 * @author Alfredo
 */
public abstract class Persona {
    protected String nom;
    protected String dni;
    protected String curs;

    public Persona(String nom, String dni, String curs) {
        this.nom = nom;
        this.dni = dni;
        this.curs = curs;
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

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", dni=" + dni + ", curs=" + curs + '}';
    }

    
}
