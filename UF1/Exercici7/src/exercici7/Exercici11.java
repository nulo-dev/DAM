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
public class Exercici11 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingressi un text: ");
        String texto = input.nextLine();
        texto = texto.replaceAll("y", "i");
        texto = texto.replaceAll("Y", "i");
        System.out.println(texto);
    }
    
}
