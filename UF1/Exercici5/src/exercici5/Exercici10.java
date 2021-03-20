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
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int vect1[];
        vect1 = new int[10];
        int vect2[];
        vect2 = new int[10];
        int bucle = 10;
        
        for(int i = 0; i<bucle; i++){
         System.out.print("Ingresi un nombre: ");  
         vect1[i] = input.nextInt();
         vect2[i] = vect1[i]*2;
        }
        for(int i = 0; i<bucle; i++){
            System.out.printf("%d ",vect2[i]);
        }
        System.out.println(" ");
    }
    
}
