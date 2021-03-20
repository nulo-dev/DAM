/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;

/**
 *
 * @author nmartinez
 */
public class Soci {
    
    String dni;
    String nom;
    Llibre llibre=null;

    public Soci(String dni, String nom, Llibre llibre) {
        this.dni = dni;
        this.nom = nom;
        this.llibre = llibre;
        
    }
    
    public Soci(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        
    }
    
    public Soci() {
    
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
    
    public void setllibre(Llibre llibre){
        this.llibre=llibre;
    }
    
    public Llibre getLlibre(){
        return this.llibre;
    }

    @Override
    public String toString() {
        return "Soci{" + "dni=" + dni + ", nom=" + nom + ", llibre=" + llibre + '}';
    }

    
    
    public void mostrarTitol(){
        if (this.llibre == null) {
            System.out.println("No tiene ningun libro");
        } else {
            System.out.println("Titol: "+this.llibre.titol);
            System.out.println("Informacion extra libro: ");
            llibre.mostrar();
        }
    }
    
    
}
