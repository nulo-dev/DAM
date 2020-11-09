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
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [][] matriu = new int [10][10];
        int fila = 0;
        int colum = 0;
        Random ran = new Random();

        for (int f = 0; f <matriu.length; f++) {
            for (int c = 0; c <matriu[f].length; c++) {
                matriu[f][c] = ran.nextInt(5);
            }
        } 
        for (int f = 0; f <matriu.length; f++) {
            for (int c = 0; c <matriu[f].length; c++) {
                System.out.printf("%d ",matriu[f][c]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int f = 0; f <matriu.length; f++){
            fila = 0;
            for (int c = 0; c <matriu[f].length; c++) {
                fila = fila + matriu[f][c];
            }
            System.out.printf("Suma fila %d : %d%n",f,fila);
        }        
        
        for (int f = 0; f <matriu[0].length; f++) {
            colum = 0;
            for (int c = 0; c <matriu.length; c++) {
                colum = colum + matriu[c][f];
            }
            System.out.printf("Suma colum %d : %d%n",f,colum);
        }
        
    }
    
}
