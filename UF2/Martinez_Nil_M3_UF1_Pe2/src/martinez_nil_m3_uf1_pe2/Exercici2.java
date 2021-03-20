/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf1_pe2;

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
        boolean correcto = true;
        String duplicado = "";
        while(correcto){
        System.out.println("Ingrese una palabra: ");
        String palabra = input.nextLine();
        
            if (palabra.isEmpty()) {
                correcto = false;
            } else {
                String palabra2 = palabra.toLowerCase();

                    for (int j = 1; j <palabra2.length(); j++) {
                        char pletra = palabra2.charAt(0);
                        char comparador = palabra2.charAt(j);
                        
                        if (pletra == comparador) {
                            duplicado = palabra+" "+duplicado;
                        }
                    }
                }
            }
            System.out.println("Las palabras repetidas son: ");
            System.out.print(duplicado);
            System.out.println("");
        }
        
    }
