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
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresi un nombre: ");
        int num;
        num = validint();
        
        System.out.printf("La suma total es: %d%n",senars(num));
        
    }

    public static int senars(int num){
        
        int resultado = 0;
        for (int i = 1; i <=num; i++) {
            if (i % 2 == 1) {
                resultado += i;
            }
        }
        return resultado;
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
