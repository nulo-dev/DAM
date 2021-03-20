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
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Llibre llibre = new Llibre("Mark", "Narnia", 245, "21883F", true);
        Llibre llibre2 = new Llibre("Lucia", "Adventure Time", 452, "19457384L", false);
        Llibre llibre3 = new Llibre("Jose", "American Dad", 103, "584383I", false);
        Soci soc = new Soci("59847238F","Juan",llibre);
        Soci soc2 = new Soci("58473727L","Pedro",llibre2);
        Soci soc3 = new Soci("96473727J","Laura",llibre);
        Biblioteca bib = new Biblioteca();
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
        bib.setSoci(soc);
        bib.setSoci(soc2);
        bib.setSoci(soc3);
        bib.setLlibre(llibre);
        bib.setLlibre(llibre2);
        bib.setLlibre(llibre3);
        System.out.println("Nombre del socio a buscar: ");
        String nomsocbusc = input.nextLine();
        bib.buscarSoci(nomsocbusc);
        bib.mostrarSocios();
        
        System.out.println("Nombre del socio a eliminar:");
        String nomsocelm = input.nextLine();
        bib.eliminarSoci(nomsocelm);
        
        bib.mostrarSocios();
        
        System.out.println("");
        System.out.println("ISBN del libro a buscar: ");
        String isbnlibusc = input.nextLine();
        bib.buscarLibro(isbnlibusc);
        bib.mostrarLibros();
        
        System.out.println("ISBN del libro a eliminar");
        String isbnlibelim = input.nextLine();
        bib.eliminarLibro(isbnlibelim);
        
        bib.mostrarLibros();
    }
    
}
