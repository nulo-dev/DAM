/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici14 {

    public static void main(String[] args) {
        
   Scanner input = new Scanner (System.in);
    
        int cantidad = 5;
        int vector1 [];
        vector1 = new int [cantidad];
        int vector2 [];
        vector2 = new int [cantidad];
        int result [];
        result = new int [10];
        
        
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Ingressi un valor: ");
            vector1[i] = input.nextInt();
            System.out.printf("Ingressi un valor: ");
            vector2[i] = input.nextInt();
        }
        int j=0;
        for (int i = 0; i < cantidad; i++) {
            result[j] = vector1[i];
            j++;
            result[j] = vector2[i];
            j++;
            
        }
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ",result[i]);
        }
        System.out.println(" ");
    }
    
}
