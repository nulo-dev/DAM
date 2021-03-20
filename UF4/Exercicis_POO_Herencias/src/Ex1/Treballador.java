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
public class Treballador extends Persona {
    
    double sou;

    public Treballador(double sou, String dni, String nom, int naixement) {
        super(dni, nom, naixement);
        this.sou = sou;
    }  
    public Treballador(){
        
    }
    
    public void setsou(double sou){
        this.sou=sou;
    }
    public double getsout(){
        return this.sou;
    }

    @Override
    public String toString() {
        return "Treballador{" + super.toString() +" sou=" + sou + '}';
    }
    
    
    
    
}
