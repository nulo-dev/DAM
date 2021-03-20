/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2uf2;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char caracter;
        System.out.println("Introduce un caracter: ");
        String palabra = input.nextLine();
        caracter = palabra.charAt(0);
        
        if (Character.isWhitespace(caracter)) {
            System.out.println("No ha ingresado nada.");
        } else if (Character.isDigit(caracter)){
            System.out.println("Ha ingresado un digito.");
        } else if (Character.isAlphabetic(caracter)){    
            System.out.println("Ha ingresado una letra.");
        } else {
            System.out.println("Has ingresado algo raro xD");
        }
        
    }
    
}
