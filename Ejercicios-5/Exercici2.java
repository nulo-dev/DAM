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
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int matriu[][] = {{1,2,3}, {4,5,6}};
        
        for (int filas = 0; filas < matriu.length; filas++) {
            
            for (int columnas = 0; columnas < matriu[filas].length; columnas++) {
                
                System.out.printf("%d",matriu[filas][columnas]);
                
            }
            
            System.out.println(" ");
        }
        
    }
    
}
