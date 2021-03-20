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
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    
        int cantidad = 5;
        int [] vector1 = {10,20,30,40,50,60,70,80,90,100};
        int ultnum = vector1[vector1.length-1];
        int j = 0;
        System.out.printf("");
        System.out.printf("%d ",ultnum);
        System.out.printf("%d ",vector1[0]);
        for (int i = 0; i < vector1.length-2; i++) {
            j++;
            vector1[i]= vector1[j];
            System.out.printf("%d ",vector1[i]);
            
        }
        System.out.println(" ");
    }
    
}
