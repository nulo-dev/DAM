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
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriu = {{23,45,11,2},{67,2},{1,2,3,4,5,6}};
        System.out.println("Aquests són els valor que conté la matriu: ");
        
        for (int i = 0; i < matriu.length; i++) {
            System.out.println("\n\n\tEls valors que hi ha a la fila "+ i + " són: ");
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("\n\t\tEn la columna "+ j + ": " + matriu[i][j]);
            }
        }
        
    }
    
}
