/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf1_pe2;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correcto = true;
        int cantidad = 0;
        int trimestres = 4;
        int j = 1;
        int l = 0;
        double mitjana = 0;
        while(correcto){
        System.out.println("Nombre de videos: ");
        cantidad = input.nextInt();
        
        if (cantidad > 0) {
            correcto = false;
        } else {
            System.out.println("Numero no correcto");
        }
        }
        int[] array = new int[cantidad*4];
        int[] array2 = new int[trimestres];
        for (int i = 1; i <=trimestres; i++) {
            System.out.println("Trimestre "+i+":");
            for (int k = 0; k < cantidad; k++) {
                System.out.print("Video "+j+":");
                int respuesta = input.nextInt();
                if (respuesta >0 && respuesta <9999) {
                    array[k] = array[k]+respuesta;
                    array2[l] = array2[l] + respuesta;
                    j++;
                } else {
                    k--;
                    System.out.println("Numero no correcto");
                }
            }
            l++;
            j=1;
        }
        j = 1;
        for (int i = 0; i < cantidad; i++) {
            mitjana = array[i]/4.0;
            System.out.printf("Mitjana Video "+j+": %.1f%n",mitjana);
            j++;
            mitjana = 0;
        }
        correcto = false;
        System.out.println("Introdueix Trimestre de 1 a 4: ");
        int introduccion = input.nextInt();
        while(!correcto)
        if (introduccion >=1 && introduccion <=4) {
            System.out.println("Suma trimestre "+introduccion+": "+array2[introduccion-1]);
            correcto = true;
        } else {
            System.out.println("Numero no correcto");
        }
    }
    
}
