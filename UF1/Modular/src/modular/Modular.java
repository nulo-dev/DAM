/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;

/**
 *
 * @author alfredo
 */
public class Modular {

    /**
     * @param args the command line arguments
     */
    public static void imprimirDades() {
        System.out.println("Perico Pérez");
        System.out.println("Professor 1 ASIX");
        System.out.println("Carles Vallbona");
        System.out.println("Granollers");
        System.out.println("");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           imprimirDades();
        }
        System.out.println("Primer programa");
    }

}
