/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici6;

/**
 *
 * @author nmartinez
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriu = new  int [5][8];
        
        for (int fila = 0; fila <matriu.length; fila++) {
            for (int colum = 0; colum <matriu[fila].length; colum++) {
                int suma = fila+colum;
                System.out.printf("%d ",suma);
            }
            System.out.println("");
        }
    }
    
}
