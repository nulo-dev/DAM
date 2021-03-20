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
public class Exercici12 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingressi un text: ");
        String texto = input.nextLine();

        texto = texto.trim().toLowerCase().replace(" ", "").replace(",","").replace(".","").replace("'", "");
        int cantidad = texto.length()-1;
        int num = texto.length()-1;
        boolean salida = false;
        
        for (int i = 0; i <cantidad; i++) {
            if (texto.charAt(i)==texto.charAt(num)) {
                num--;
                
            } else {
                salida = true;
                break;
            }
        }
        
        if (salida) {
            System.out.println("No es palindrom");
        } else {
            System.out.println("Es palindrom");
        }
        
    }
    
}
