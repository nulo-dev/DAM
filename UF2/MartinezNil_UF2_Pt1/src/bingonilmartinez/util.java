/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingonilmartinez;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class util {
   
    /**
     * @author nmartinez
     * @param texto Ingresamos el texto que queremos printear por pantalla
     * Comprobamos si el caracter que le hemos pasado es un int
     * @return numero Devuelve el numero si la comprobacion de que es un int es correcta
     */
        public static int validint(String texto){
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean leido = false;
        do {
            System.out.print(texto);
            if (input.hasNextInt()) {
                numero = input.nextInt();
                leido = true;
            } else {
                System.out.println("Esto no es un numero...");
                input.next();
            }
        } while (!leido);
        return numero;
    }
        /**
     * @author nmartinez
     * @param texto Ingresamos el texto que queremos printear por pantalla
     * Comprobamos si el caracter que le hemos pasado es un double
     * @return numero Devuelve el numero si la comprobacion de que es un double es correcta
     */
        public static double validdouble(String texto){
        
        Scanner input = new Scanner(System.in);
        double numero = 0;
        boolean leido = false;
        do {
            System.out.print(texto);
            if (input.hasNextDouble()) {
                numero = input.nextDouble();
                leido = true;
            } else {
                System.out.println("Esto no es un numero...");
                input.next();
            }
        } while (!leido);
        return numero;
    }
}
