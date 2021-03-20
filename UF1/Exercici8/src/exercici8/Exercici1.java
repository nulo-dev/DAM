/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici8;

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
        float array[] = new float [5];
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Escriu la nota del alumne %d: ",i);
            array[i] = input.nextFloat();
        }
        
        System.out.println("Ingresi la nota que vol buscar: ");
        float nota = input.nextFloat();
        int j=0;
        for (int i = 0; i < array.length; i++) {
            j++;
            if(array[i] == nota){
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.printf("La posicio del alumne es %d%n",j);
        } else {
            System.out.println("No he trobat la nota");
        }
        
    }
    
}
