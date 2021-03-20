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
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(Calculadora.suma(10, 5));
        System.out.println(Calculadora.resta(10, 5));
        System.out.println(Calculadora.multiplicacion(10, 5));
        System.out.println(Calculadora.division(10, 5));
        System.out.println(Calculadora.pi);
        
    }
    
}
