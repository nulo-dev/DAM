/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3uf2;

/**
 *
 * @author nilma
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("La salida es: ");
        metodo(23);
        System.out.println();
    }
    
    public static void metodo(int numero){
        if (numero > 0) {
            metodo(numero/2);
            System.out.println(numero % 2);
        }
    }
}
