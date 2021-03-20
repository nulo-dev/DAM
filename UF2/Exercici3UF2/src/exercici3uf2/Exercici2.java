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
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("La salida es: ");
        metodo(11156);
        System.out.println();
    }
    
    public static void metodo(int numero){
        if (numero > 0) {
            int d = numero % 10;
            boolean senar = (numero / 10) % 2 == 1;
            metodo(numero / 10);
            if (senar) {
                System.out.println(d / 2 + 5);
                
            } else {
                System.out.println(d / 2);
            }
        }
    }
}
