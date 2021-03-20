/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat1.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("CALCULADORA");
        System.out.println("===========");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Ingrese el numero: ");
        int seleccion;
        seleccion = validint();
        
        if (seleccion == 1 || seleccion == 2) {
            System.out.print("Ingrese la temperatura que desea convertir: ");
                int temp;
                temp = validint();
                if (seleccion == 1) {
                    double resultado = conversion(seleccion,temp);
                    System.out.println("");
                    System.out.println("La temperatura "+temp+"°C en Fahrenheit es: "+resultado+"°F");
                } else {
                    System.out.println("");
                    double resultado = conversion(seleccion,temp);
                    System.out.println("La temperatura "+temp+"°F en Celsius es: "+resultado+"°C");
                }

        } else {
            System.out.println("Numero incorrecto.");
        }
        System.out.println("");
    }

    public static double conversion(int seleccion,int temperatura) {
        
        double resultado = 0;
        if (seleccion == 1) { // Celsius a Fahrenheit
            
            resultado = temperatura * 9.0/5 + 32;
            return resultado;
            
        } else { // Fahrenheit a Celsius
            
            resultado = (temperatura - 32) * 5.0/9;
            return resultado;
        }
        
    }
    
    
    public static int validint(){
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean leido = false;
        do {
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
    
}
