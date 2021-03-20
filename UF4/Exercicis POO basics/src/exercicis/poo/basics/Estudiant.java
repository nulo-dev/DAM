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
public class Estudiant {
    
    String nom;
    String curs;
    double nota;
    private static int contador;
    public Estudiant(){
        contador = 0;
    }

    public Estudiant(String nom, String curs, double nota) {
        this.nom = nom;
        this.curs = curs;
        this.nota = nota;
    }

    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        contador++;
        this.nom=nom;
    }
    
    public String getCurs(){
        return curs;
    }
    
    public void setCurs(String curs){
        this.curs=curs;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nota){
        this.nota=nota;
    }
    
    public void mostrar(boolean a){
        
        if (a) {
            System.out.printf("\nNombre: %s\nCurs: %s\nNota: %.2f\n",this.nom,this.curs,this.nota);
        } else {
            System.out.printf("\nNombre: %s\nCurs: %s\n",this.nom,this.curs);
        }
        
    }
    public int contador(){
        return this.contador;
    }
    
}