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
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamaño = 6;
        Random rand = new Random();
        int[] array = new int[tamaño];
        int[] loteria = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.printf("Ingresi el %d nombre: ",i);
            int num;
            num = validint();
            array[i] = num;
            loteria[i] = rand.nextInt(50);
        }        

        buscador(array,loteria);
        System.out.println("");
    }

    public static void buscador(int[] array,int[] loteria){
        boolean ganado = false;
        int aciertos = 0;
        System.out.println("Array");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(" ");
            System.out.print(array[i]);
        }
                System.out.println("");
         System.out.println("Loteria");
                for (int i = 0; i < loteria.length; i++) {
                    System.out.print(" ");
            System.out.print(loteria[i]);
        }
                System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < loteria.length; j++) {
            if (array[i] == loteria[j]) {
                aciertos ++;
                ganado = true;
            }   
           }
        }
        if (!ganado) {
            System.out.print("No has acertado ningun numero.");
        } else {
            System.out.println("Has acertado "+aciertos+" numeros");
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
