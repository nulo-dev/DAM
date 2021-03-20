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
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresi un nombre:");
        int num;
        num = validint();

        parell(num);
        
    }
    
    public static void parell(int num){
        
        if (num % 2 == 0) {
            System.out.println("El numero que ha ingresat es parell");
        } else {
            System.out.println("El numero que ha ingresat no es parell");
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
