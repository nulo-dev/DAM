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
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingresi el numero de filas que vol:");
        int filas = input.nextInt();
        System.out.println("Ingresi el numero de columnas que vol:");
        int columnas = input.nextInt();
        
        int [][] matriu = new int [filas][columnas];
        int [] suma = new int [columnas];
        for (int f = 0; f <matriu.length; f++) {
            for (int c = 0; c <matriu[f].length; c++) {
                System.out.printf("Ingresi el valor de [%d] [%d]: ",f,c);
                matriu[f][c] = input.nextInt();
            }
        }

        
        for (int c = 0; c <matriu[0].length; c++) {
            for (int f = 0; f <matriu.length; f++) {
                suma[c] = suma[c] + matriu[c][f];
            }
            System.out.printf("%n[%d] = %d %n",c,suma[c]);
        }
        }
        
    }

