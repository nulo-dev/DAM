/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf2_pe1;

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
        int tamaño;
        tamaño = util.validint("Ingrese el tamaño del vector: ");
        int vector[] = new int[tamaño];
        llenarVector(tamaño,vector);
        mostrarVector(tamaño,vector);
        int mayor = masGrandeVector(tamaño,vector);
        System.out.println("\nEl numero mas grande es: "+mayor);
    }
    
    public static int[] llenarVector(int tamaño, int[] vector){
        
        Random rnd = new Random();
        for (int i = 0; i < tamaño; i++) {
            vector[i]=rnd.nextInt(900)+1;
        }
        
        return vector;
    }
    
    public static void mostrarVector(int tamaño, int[] vector){
        int aux = 0;
        for (int i = 0; i <tamaño; i++) {
            if (vector[i]<10) {
             System.out.print("|"+vector[i]+"   ");   
            } else if (vector[i]<100) {
             System.out.print("|"+vector[i]+"  ");      
            } else{
             System.out.print("|"+vector[i]+" "); 
            }
            aux++;
            if (aux==10) {
            System.out.print("|");
            System.out.println("");
            aux = 0;
            }
        }
        
    }

    public static int masGrandeVector(int tamaño, int[] vector){
        
        int grande = 0;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]>=grande) {
                grande = vector[i];
            }
        }
        
        return grande;
    }
}
