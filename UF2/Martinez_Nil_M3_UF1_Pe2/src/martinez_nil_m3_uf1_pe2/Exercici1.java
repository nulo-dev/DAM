/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf1_pe2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double mitjana = 0.0;
        int contador = 0;
        int jugadores = 0;
        int j = 1;
        boolean correcto = false;
        
        while(!correcto){
            System.out.println("Quants jugadors?");

            if (input.hasNextInt()) {
                jugadores = input.nextInt();
                if (jugadores >0) {
                 correcto = true;
                 input.nextLine();    
                } else {
                    System.out.println("El numero ha de ser positiu.");
                }
            } else {
                System.out.println("Ingreso un caracter no valido");
                input.next();
            }
        }
        int[] array = new int [jugadores];
        Random rand = new Random();
        System.out.println("Vols omplir puntuacions de forma aleatòtira? (s/n)");
        String respuesta = input.next();
        
        if (respuesta.equals("s")) {
            for (int i = 0; i <jugadores; i++) {
                array[i] = rand.nextInt(90)+10;
            }   
        } else if (respuesta.equals("n")) {
            for (int i = 0; i < jugadores; ) {
                System.out.println("Jugador "+j);
                int puntuacion = input.nextInt();
                if (puntuacion >=10 && puntuacion <=100) {
                    array[i] = puntuacion;
                    j++;
                    i++;
                } else {
                    System.out.println("El numero no cumpleix amb el '10' minim i '100' maxim.");
                }   
            }
        }
        System.out.print("Vector generat: ");
        for (int i = 0; i < jugadores; i++) {
            System.out.print(array[i]+" ");
            mitjana += array[i];
        }
        System.out.println("");
        double resultado = mitjana/jugadores;
        for (int i = 0; i < jugadores; i++) {
            if (array[i] > resultado) {
                contador++;
            }
        }
        System.out.printf("La mitjana de puntuació és: %.2f%n",resultado);
        System.out.println("Jugadors amb puntuació superior a la mitjana: "+contador);
    }
    
}
