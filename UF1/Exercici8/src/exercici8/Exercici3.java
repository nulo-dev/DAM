/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici8;

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
        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Ingresi la quantitat de alumnes que te: ");
//        int cant = input.nextInt();
//        input.nextLine();
//        alumne alumno[] = new alumne[cant];
//        for (int i = 0; i < cant; i++) {
//         alumno[i] = new alumne();
//         System.out.printf("Ingresi el nom del alumne %d : ",i);   
//         alumno[i].nom = input.nextLine();
//         System.out.printf("Ingresi la nota del alumne %d : ",i);
//         alumno[i].nota = input.nextInt();
//         input.nextLine();
//         System.out.println("");
//        }
//        for (int i = 0; i < cant; i++) { 
//            boolean encontrado = false;
//            System.out.println("Ingresi la nota que vol buscar: ");
//            int busc = input.nextInt();
//            for (int j = 0; j < cant; j++) {
//                if (busc == alumno[j].nota) {
//                    System.out.printf("La nota es del alumne %s%n",alumno[j].nom);
//                    encontrado = true;
//                    break;
//                }
//            }
//            if (!encontrado) {
//                System.out.println("No he trobat la nota indicada.");
//            }
//        }

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresi la quantitat de alumnes que te: ");
        int cant = input.nextInt();
        input.nextLine();
        alumne alumno[] = new alumne[cant];
        for (int i = 0; i < cant; i++) {
         alumno[i] = new alumne();
         System.out.printf("Ingresi el nom del alumne %d : ",i);   
         alumno[i].nom = input.nextLine();
         System.out.printf("Ingresi la nota del alumne %d : ",i);
         alumno[i].nota = input.nextInt();
         input.nextLine();
         System.out.println("");
        } 
        
        
        int esquerra, dreta, centre;
        esquerra = 0;
        dreta = alumno.length - 1;
        centre = (dreta + esquerra) / 2;
        boolean salir = true;
        boolean encontrado = false;

        while (esquerra < dreta && salir) {
        System.out.print("Introdueix el número a buscar: ");
        int numABuscar = input.nextInt();
            if (numABuscar == -1) {
                salir = false;
            }
            if (alumno[centre].nota > numABuscar) {
                dreta = centre - 1;
            } else {
                esquerra = centre + 1;
            }
            centre = (esquerra + dreta) / 2;
            
            if (alumno[centre].nota == numABuscar) {
            System.out.printf("S'ha trobat el %d a la posició %d.%n", numABuscar, centre);
                esquerra = 0;
                dreta = alumno.length - 1;
        }
        }
    }
    
}
