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
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [][] marc = new int [8][6];

        
        for (int f = 0; f <marc.length; f++) {
            
            for (int c = 0; c <marc[f].length; c++) {
           
                if (c == 0) {
                    marc[f][c] = 1;
                }else if (c == marc[c].length-1){
                    marc[f][c] = 1;
                }else if (f == 0) {
                    marc[f][c] = 1;
                } else if (f == marc.length-1) {
                    marc[f][c] = 1;
                }
            }
        }
        
        for (int f = 0; f <marc.length; f++) {
            for (int c = 0; c <marc[f].length; c++) {
                System.out.printf("%d ",marc[f][c]);
            }
            System.out.println("");
        }
        
        
    }
    
}
