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
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresi el primer nombre: ");
        int num1;
        num1 = validint();
        System.out.println("Ingresi el segon nombre: ");
        int num2;
        num2 = validint();
        compresos(num1,num2);
        System.out.println("");
    }
    
    public static void compresos(int num, int num2){
        
        for (int i = num; i <=num2; i++) {
            System.out.print(i+" ");
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
