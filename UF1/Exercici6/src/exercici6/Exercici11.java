/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici6;

import java.util.Random;
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
        
        System.out.println("Ingresi las dimensions N");
        int n = input.nextInt();
        System.out.println("Ingresi las dimensions M");
        int m = input.nextInt();
        Random ran = new Random();
        boolean nulo = true;
        int [][] matriz = new int [n][m];

        for (int f = 0; f <matriz.length; f++) {
            for (int c = 0; c <matriz[f].length; c++) {
                matriz[f][c] = ran.nextInt(2);
            }
        }
        for (int f = 0; f <matriz.length; f++) {
            for (int c = 0; c <matriz[f].length; c++) {
                System.out.printf("%d ",matriz[f][c]);
                if (matriz[f][c] < 0) {
                    nulo = false;
                }
            }
            System.out.println("");
        }
      
        if(nulo == true){
            System.out.println("La matriz es positiva");
        } else {
            System.out.println("La matriz no es positiva");
        }
        
    }
    
}
