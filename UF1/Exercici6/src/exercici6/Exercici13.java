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
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        

        int contador = 0;
        boolean diagonal = true;
        
        System.out.println("Ingresi el numero de filas que vols: ");
        int filas = input.nextInt();
        System.out.println("Ingresi el numero de columnas que vols: ");
        int columnas = input.nextInt();
        int [][] matriz = new int [filas][columnas];
        
        for (int f = 0; f <matriz.length; f++) {
            
            for (int c = 0; c <matriz[f].length; c++) {
                System.out.printf("Ingresi el valor de [%d] [%d]: ",f,c);
                matriz[f][c] = input.nextInt();
            }
        }
        
        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[f].length; c++) {

                System.out.printf("%d ",matriz[f][c]);
                if (f != c && matriz[f][c] != 0) {
                    diagonal = false;
                }
            }
            System.out.println(" ");
        }
        
        if (diagonal) {
            System.out.println("Es diagonal");
        } else {
            System.out.println("No es diagonal");
        }
        }
        
    }

