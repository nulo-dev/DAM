/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat1.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Ingresi un numero: ");
        int num;
        num = util.validint();
        
        suma(num);
        
    }
    
    public static void suma(int num){
        int resto;
        int sumado = 0;
        
      while( num > 0 ) {
         resto = num % 10;
         sumado = sumado + resto;
         num = num/10;
      }

      System.out.println( "Número sumado: " + sumado );
        
    }
    
}
