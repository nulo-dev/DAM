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
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Estudiant est = new Estudiant();
        Professor prof = new Professor();
        Professor prof1 = new Professor("Juan",10,1998);
        prof1.mostrar();
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
        System.out.println("Nom del professor:");
        String nomprof = input.nextLine();
        prof.setNom(nomprof);
        System.out.println("Edat del professor:");
        int edat= input.nextInt();
        prof.setEdat(edat);
        System.out.println("Any contractacte:");
        int anycont = input.nextInt();
        prof.setAnycontracte(anycont);
        System.out.println("Nota del Estudiant 1:");
        double nota1 = input.nextDouble();
        prof.setNota(est, nota1);
        prof.mostrar();
        est.mostrar(true);
        
    }
    
}
