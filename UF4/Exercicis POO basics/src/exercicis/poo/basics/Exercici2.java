/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Llibre llibre = new Llibre("Mark", "Narnia", 245, "21883F", true);
        Llibre llibre2 = new Llibre("Lucia", "Adventure Time", 452, "19457384L", false);
        llibre.mostrar();
        System.out.println("");
        llibre2.mostrar();
        System.out.println("");
        llibre.setAutor("Antonia");
        llibre2.setIsbn("102I");
        System.out.println(llibre.getIsbn());
        System.out.println(llibre2.getTitol());
        System.out.println("");
        llibre.mostrar();
        System.out.println("");
        llibre2.mostrar();
    }
    
}
