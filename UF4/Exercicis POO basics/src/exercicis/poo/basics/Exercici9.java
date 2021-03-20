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
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BlocNotas not1 = new BlocNotas();
        BlocNotas not2 = new BlocNotas();
        
        not1.setNota("Comprar pan");
        not1.setNota("Vender pan");
        
        not2.setNota("Llevar coche taller");
        not2.setNota("Comprar ventana coche");
        not2.setNota("Llevar perro vet");
        
        not1.numNotas();
        not1.llistatNotas();
        System.out.println("---------------------------------------");
        not2.numNotas();
        not2.llistatNotas();
        
    }
    
}
