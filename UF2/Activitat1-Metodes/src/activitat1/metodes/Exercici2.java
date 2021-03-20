/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat1.metodes;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresi un nombre: ");
        int num1;
        num1 = validint();
        System.out.println("Ingresi un nombre: ");
        int num2;
        num2 = validint();
        System.out.println("Ingresi un nombre: ");
        int num3;
        num3 = validint();
        
        int maximo = numax(num1,num2,num3);
        System.out.println("El numero maxim es: " + maximo);
    }
    
    public static int numax (int num1, int num2, int num3){
        
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if(num2 > num1 && num2 > num3){
            return num2;
        } else {
            return num3;
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
