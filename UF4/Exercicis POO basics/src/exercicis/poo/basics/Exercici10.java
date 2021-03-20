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
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Estudiant est = new Estudiant();
        Estudiant est2 = new Estudiant("Lopez","3",4);
        Estudiant est3 = new Estudiant("Jorge","5",8);
        Estudiant est4 = new Estudiant("Lucia","6",7);
        Curs lista = new Curs();
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
        
        lista.setAlumne(est);
        lista.setAlumne(est2);
        lista.setAlumne(est3);
        lista.setAlumne(est4);
        
        lista.setCurs(curs);
        input.nextLine();
        System.out.println("Alumno a buscar: ");
        String nombrebusc = input.nextLine();
        System.out.println("Curso del alumno: ");
        String cursobusc = input.nextLine();
        lista.buscarAlumne(nombrebusc,cursobusc);
        lista.mostrar();
        System.out.println("Alumno a eliminar");
        String nombrebor = input.nextLine();
        System.out.println("Curso del alumno: ");
        String cursobor = input.nextLine();
        lista.eliminarAlumne(nombrebor,cursobor);
        lista.mostrar();
        
    }
    
}
