/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2uf2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author nmartinez
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int array[] = new int[30];
        for (int i = 0; i < array.length; i++) {
        array[i] = ran.nextInt(100);
        System.out.print(array[i]+" ");    
        }
        System.out.println("");
        System.out.println("Introduzca el numero a buscar: ");
        int num = input.nextInt();
        System.out.println("");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+" ");    
        }
        System.out.println("");
        int buscar = Arrays.binarySearch(array, num);
        System.out.println("La búsqueda binaria torna: "+buscar);
            
    }
    
}
