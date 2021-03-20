/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici7;

/**
 *
 * @author nmartinez
 */
public class Exercici7 {

    
    public static void main(String[] args) {
       
        String sCadena1 = new String("Avila");
        String sCadena2 = new String("Salamanca");
        String sCadena3 = new String("AVILA");

        System.out.println(sCadena1.equalsIgnoreCase(sCadena2));
        System.out.println(sCadena1.compareToIgnoreCase(sCadena3));
        
    }
    
}
