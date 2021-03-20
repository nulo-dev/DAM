/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionals1;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Ingrese las horas que a trabajado: ");
        int horas = input.nextInt();
        System.out.printf("Ingrese el precio de la hora: ");
        int precio = input.nextInt();
        
        int ph = precio*horas;
        int phs = ph*30;
        double phsimp = phs*0.20;
        double cobro = phs-phsimp;
        
        System.out.printf("El salari net del treballador es: %.2f€%n",cobro);
    }
    
}
