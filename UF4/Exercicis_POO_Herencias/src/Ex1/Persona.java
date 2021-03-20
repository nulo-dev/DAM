/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author nmartinez
 */
public class Persona {
    
    String dni;
    String nom;
    int naixement;

    public Persona(String dni, String nom, int naixement) {
        this.dni = dni;
        this.nom = nom;
        this.naixement = naixement;
    }
    
    public Persona() {

    }  
    
    
    public void setdni(String dni){
        this.dni=dni;
    }
    public String getdni(){
        return this.dni;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public String getnom(){
        return this.nom;
    }
    public void setnaixement(int naixement){
        this.naixement=naixement;
    }
    public int getnaixement(){
        return this.naixement;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nom=" + nom + ", naixement=" + naixement + '}';
    }
    
    
    
    
}
