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
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresi el tamany de la taula: ");
        int tamaño;
        tamaño = validint();
        Random rand = new Random();
        int[] array = new int[tamaño];
        System.out.println("La taula es compon de: ");
        for (int i = 0; i < tamaño; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingresi el numero que vol buscar a la taula: ");
        int num;
        num = validint();
        
        buscador(array,num);
    }

    public static void buscador(int[] array,int num){

        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
              System.out.printf("El numero %d es troba a la posicio %d%n",num,i);  
              encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No he trobar el numero D:");
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
