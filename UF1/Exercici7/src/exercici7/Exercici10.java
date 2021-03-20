/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici7;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici10 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("Dóna'm el teu DNI (recordi que el dni te 8 numeros): ");
        int nif = input.nextInt();
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int division = nif % 23;
        System.out.printf("%d%s%n",nif,cadena.charAt(division));
    }
    
}
