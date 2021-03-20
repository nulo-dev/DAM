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
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Llibre llibre = new Llibre("Mark", "Narnia", 245, "21883F", true);
        Llibre llibre2 = new Llibre("Lucia", "Adventure Time", 452, "19457384L", false);
        Soci soc1 = new Soci("49588293L","Juan");
        Soci soc2 = new Soci("58737475J","Pedro");
        Biblioteca bib = new Biblioteca("85867473F","Laura");
        System.out.println("-------------------------LLIBRES-------------------------");
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
        System.out.println("");
        System.out.println("---------------------------------------------------------\n\n");
        bib.setLlibre(llibre, soc2);
        System.out.println("-------------------------SOCIS---------------------------");
//        System.out.println(soc1);
        System.out.print(soc1.getnom()+" ");
        soc1.mostrarTitol();
        System.out.print(soc2.getnom()+", ");
        soc2.mostrarTitol();
        System.out.println("---------------------------------------------------------");
        
        
    }
    
}
