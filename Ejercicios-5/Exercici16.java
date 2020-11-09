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
public class Exercici16 {

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
        int [][] matriu2 = new int [filas][columnas];
        int [][] resultado = new int [filas][columnas];
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

