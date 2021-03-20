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
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Estudiant est = new Estudiant();
        Estudiant est2 = new Estudiant();
        
        System.out.println("Nombre del Estudiante: ");
        String nom = input.nextLine();
        est.setNom(nom);
        System.out.println("Curso del Estudiante: ");
        String curs = input.nextLine();
        est.setCurs(curs);
        System.out.println("Nota del Estudiante: ");
        Double nota = input.nextDouble();
        est.setNota(nota);
        est.mostrar(true);
        input.nextLine();
        System.out.println("Nombre del Estudiante: ");
        nom = input.nextLine();
        est2.setNom(nom);
        System.out.println("Curso del Estudiante: ");
        curs = input.nextLine();
        est2.setCurs(curs);
        System.out.println("Nota del Estudiante: ");
        nota = input.nextDouble();
        est2.setNota(nota);
        est2.mostrar(true);
        System.out.println(est.contador());
    }
    
}
