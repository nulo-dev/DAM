/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat1.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño de la tabla");
        int tamaño;
        tamaño = util.validint();     
        tabla(tamaño);
        System.out.println("");
    }

public static void tabla(int num2){
    int array[] = new int[num2];
    int num;
    for (int i = 0; i <array.length;) {
        System.out.print("Ingrese un numero: ");
        num = util.validint(); 
        if (num % 2 == 0) {
            array[i] = num;
            i++;
        }
    }
    for (int i = 0; i <array.length; i++) {
        System.out.print(array[i]+" ");
    }
}    

    
}
