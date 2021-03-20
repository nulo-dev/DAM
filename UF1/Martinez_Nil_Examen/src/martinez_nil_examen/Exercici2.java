/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_examen;

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
        System.out.printf("Introdueix 1ª part: ");
        String entrada1 = input.nextLine();
        char caracter1 = entrada1.charAt(0);
        System.out.printf("Introdueix 2ª part: ");
        int entrada2 = input.nextInt();
        System.out.printf("Introdueix 3ª part: ");
        int entrada3 = input.nextInt();
        
        if(caracter1 >= 65 && caracter1 <= 90 && entrada2 >=10 && entrada2 <=99 && entrada3 >=1000 && entrada3 <=9999){
            System.out.printf("El teu codi és correcte.%n");
        } else {
            System.out.printf("El teu codi es incorrecte.%n");
        }

    }
    
}
