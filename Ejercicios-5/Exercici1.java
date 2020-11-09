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
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float [][] notes = new float[6][3];
        
        Random rnm = new Random();
        
        for (int posF = 0; posF < notes.length; posF++) {     
            for(int posC = 0; posC <notes[0].length; posC++){
                float numrand = rnm.nextFloat();       
                notes[posF][posC] = numrand*10;
            }
            
        }
        
        for (int posF = 0; posF < notes.length; posF++) {
            
            System.out.print("\nEls valors que hi ha a la fila " + posF + " són: \n\n");
            for (int posC = 0; posC < notes[posF].length; posC++) {
                System.out.print("\n\tEl valor que hi ha a la columna " + posC + " és " + notes[posF][posC]);
            }
        }
        System.out.println("");
    }
    
}
 