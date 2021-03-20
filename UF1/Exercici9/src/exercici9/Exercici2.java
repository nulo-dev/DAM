/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici9;

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
        
        Scanner input = new Scanner (System.in);
       
        Cotxe cotx;
        Cotxe maxcilindrada = new Cotxe();
        maxcilindrada.cilindrada = 0;
        Cotxe maxpotencia = new Cotxe();
        maxpotencia.potencia = 0;
        do{
        cotx = new Cotxe();
            System.out.println("Marca: ");
            cotx.marca = input.nextLine();
            System.out.println("Model: ");
            cotx.model = input.nextLine();
            System.out.println("Matricula: ");
            cotx.matricula = input.nextLine();
            System.out.println("Cilindrada");
            cotx.cilindrada = input.nextInt();
            System.out.println("Potencia");
            cotx.potencia = input.nextInt();
            input.nextLine();
            if (cotx.cilindrada > maxcilindrada.cilindrada) {
                maxcilindrada = cotx;
            }
            if (cotx.potencia > maxpotencia.potencia) {
                maxpotencia = cotx;
            }
        }while(cotx.cilindrada != 0);
        
        System.out.println("CILINDRADA MAXIMA");
        System.out.println("Marca: "+maxcilindrada.marca);
        System.out.println("Model: "+maxcilindrada.model);
        System.out.println("Matricula: "+maxcilindrada.matricula);
        System.out.println("Cilindrada: "+maxcilindrada.cilindrada);
        System.out.println("Potencia: "+maxcilindrada.potencia);
        System.out.println("POTENCIA MAXIMA");
        System.out.println("Marca: "+maxpotencia.marca);
        System.out.println("Model: "+maxpotencia.model);
        System.out.println("Matricula: "+maxpotencia.matricula);
        System.out.println("Cilindrada: "+maxpotencia.cilindrada);
        System.out.println("Potencia: "+maxpotencia.potencia);
    }
    
}
