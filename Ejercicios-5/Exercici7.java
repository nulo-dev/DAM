/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici6;

import java.util.Random;


/**
 *
 * @author nmartinez
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [][] matriu = new int [3][3];
        int [][] matriu2 = new int [3][3];
        int [][] resultado = new int [3][3];
        Random ran = new Random();
        System.out.println("Matriu 1");
        for (int f = 0; f <matriu.length; f++) {
            for (int c = 0; c <matriu[f].length; c++) {
                matriu[f][c] = ran.nextInt(5);
                System.out.printf("%d ",matriu[f][c]);
            }
            System.out.println(" ");
        }
        System.out.println("\nMatriu 2");
        for (int f = 0; f <matriu2.length; f++) {
            for (int c = 0; c <matriu2[f].length; c++) {
                matriu2[f][c] = ran.nextInt(5);
                System.out.printf("%d ",matriu2[f][c]);
            }
            System.out.println(" ");
        }
        System.out.println("\nResultado");
        for (int f = 0; f <matriu.length; f++) {
            for (int c = 0; c <matriu[f].length; c++) {
                resultado[f][c] = matriu[f][c] + matriu2[f][c];
                System.out.printf("%d ",resultado[f][c]);
            }
            System.out.println(" ");
        }
        
        
    }
    
}
