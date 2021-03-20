/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici13 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingressi un text: ");
        String texto = input.nextLine();
        texto = texto.toLowerCase();
        Random ran = new Random();
        for (int i = 1; i <=texto.length(); i++) {
            System.out.print(texto.charAt(texto.length()-i));
        }
        System.out.print(ran.nextInt(10));  
        System.out.println("");
        
    }
    
}
