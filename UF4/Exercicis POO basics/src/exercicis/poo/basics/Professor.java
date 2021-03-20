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
public class Professor {
    
    String nom;
    int edat;
    int anycontracte;

    public Professor(){
        
    }
    
    public Professor(String nom, int edat, int anycontracte) {
        this.nom = nom;
        this.edat = edat;
        this.anycontracte = anycontracte;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setEdat(int edat){
        this.edat=edat;
    }
    
    public int getEdat(){
        return this.edat;
    }
    
    public void setAnycontracte(int any){
        this.anycontracte=any;
    }
    
    public double getAnycontracte(){
        return this.anycontracte;
    }
    
    public void setNota(Estudiant est,double nota){
        est.setNota(nota);
    }
    
    public void mostrar(){
        System.out.println("Nom: "+this.nom+" Edat: "+this.edat+" Any Contracte :"+this.anycontracte);
    }
    
}
