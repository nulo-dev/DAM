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
public class Agent {
    
    String dni;
    String nom;

    public Agent() {
    }

    public Agent(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setVol(Passatger pas, Vol vol){
        pas.setVol(vol);
    }
}
