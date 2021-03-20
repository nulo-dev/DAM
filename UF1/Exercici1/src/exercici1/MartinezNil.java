/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class MartinezNil {
    
    public static void main(String[] args) {
        
                /// ADICIONAL ///
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("Introdueix el teu nom: ");
        String nom = teclat.nextLine();
        System.out.printf("Introdueix la teva alçada (en metres i amb decimals): ");
        double alçada = teclat.nextDouble();
        System.out.printf("Introdueix el teu pes (en kilos i sense decimals): ");
        int pes = teclat.nextInt();
        double imc = pes/(alçada*alçada);
        System.out.printf("%n%1$s te un IMC de %2$f %n",nom,imc);
        
    }
    
}
