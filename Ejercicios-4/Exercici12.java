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
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    
        int cantidad = 5;
        int vect1[];
        vect1 = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingressi un nombre: ");
            vect1[i] = input.nextInt();
        }
        
        System.out.print("Ingressi el numero que vol eliminar: ");
        int num = input.nextInt();
        
        for(int i = 0; i<cantidad; i++){
            if(vect1[i] == num) {
                vect1[i] = 0;
            }
        }
        for(int i = 0; i<cantidad; i++){
            if(vect1[i] == 0){
                vect1[i] = vect1[cantidad-1];
                vect1[cantidad-1] = 0;
            }
            System.out.printf("%d ",vect1[i]);
        }
        System.out.println(" ");
    }
    
}
