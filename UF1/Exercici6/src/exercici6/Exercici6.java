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
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [][] matriu = new int [4][4];
        
        Random rand = new Random();
        boolean simetric = true;
       
        
        for (int fila = 0; fila <matriu.length; fila++) {
            
            for (int colum = 0; colum < matriu[fila].length; colum++) {
                
                matriu[fila][colum] = rand.nextInt(2);
                System.out.printf("%d ",matriu[fila][colum]);
            }
            System.out.println("");
        }
                    
        for (int fila = 0; fila <matriu.length; fila++) {

            for (int colum = 0; colum <matriu[fila].length; colum++) {
                if (matriu[fila][colum] != matriu[colum][fila]) {
                    simetric = false;
                }
            }

        }
        
        if(simetric == true){
            System.out.println("La matriu es simetrica");
        } else {
            System.out.println("La matriu no es simetrica");
        }
    }
    
}
