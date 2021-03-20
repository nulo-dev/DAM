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
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese el tamaño de la tabla: ");
        int tamaño;
        tamaño = validint();
        
        int array[] = new int[tamaño];
        System.out.print("Los valores de la tabla son: ");
        for (int i = 0; i < tamaño; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(" "+array[i]);
        }
        System.out.println("");

        System.out.println("El numero maximo es "+numax(array));
    }
    
    public static int numax(int[] array){
        int numaximo = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numaximo) {
                numaximo = array[i];
            }
        }
        return numaximo;
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
