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
public class Conversor {
 
    static final double E_TO_D = 1.20;
    
    public double eutodo(double euros){
        
        return euros*E_TO_D;
        
    }
    
    public double dotoeu(double dolares){
        
        return dolares/E_TO_D;
        
    }
    
}
