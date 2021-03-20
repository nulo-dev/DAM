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
public class Passatger {
    
    String DNI;
    String nom;
    Vol vol;

    public Passatger() {
    }

    public Passatger(String DNI, String nom, Vol vol) {
        this.DNI = DNI;
        this.nom = nom;
        this.vol = vol;
    }
    
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    
    public String getDNI(){
        return this.DNI;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setVol(Vol vol){
        this.vol=vol;
    }
    
    public Vol getVol(){
        return this.vol;
    }
    
    public void mostrar(){
        
        System.out.print("Nom: "+this.nom+" DNI: "+this.DNI+" Vol: ");
        getVol().mostrar();
        
    }
    
}
