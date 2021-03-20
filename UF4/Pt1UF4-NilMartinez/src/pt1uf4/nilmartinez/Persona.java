/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1uf4.nilmartinez;

/**
 *
 * @author nmartinez
 */
public abstract class Persona {
        
    protected String dni;
    protected String nom;
    protected String cognom;

    public Persona(String dni, String nom, String cognom) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
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

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void mostrar() {
        System.out.printf("\t│DNI: %-69s %s",dni,"│");
        System.out.printf("\n\t│Nom i Cognom: %-60s %s",(nom + " " + cognom),"│");
//        return "\t│DNI: %-73s" + dni + "\n\t│Nom i Cognom: " + nom + " " + cognom+"\n";
    }
    
    
    
}
