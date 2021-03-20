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
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresi un nombre:");
        int num;
        num = validint();
        System.out.println("Ingresi el nombre de elevacio:");
        int num2;
        num2 = validint();
        int resultado = elevado(num,num2);
        System.out.printf("El numero %d elevat a %d es: %d%n",num,num2,resultado);
    }
    
    public static int elevado(int num,int num2){
        
        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = resultado*num;
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
