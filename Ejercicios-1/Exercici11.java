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
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int cantidad = 5;
        int vect1[];
        vect1 = new int[cantidad];
        int vect2[];
        vect2 = new int[cantidad];
        int mult[];
        mult = new int[cantidad];
        int suma[];
        suma = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingressi un nombre (vect1): ");
            vect1[i] = input.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingressi un nombre (vect2): ");
            vect2[i] = input.nextInt();
        }
        for (int i = 0; i < cantidad; i++){
            suma[i]= vect1[i]+vect2[i];
            mult[i] = vect1[i]*vect2[i];
        }
        System.out.println("Suma");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d ",suma[i]);
        }
        System.out.printf("%nProducte%n");
                for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d ",mult[i]);
        }
        System.out.println(" ");
    }
    
}
