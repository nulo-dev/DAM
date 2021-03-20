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
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        Ambient amb;
        Ambient max = new Ambient();
        max.temperatura = 0;
        do{
            amb = new Ambient();
            System.out.print("Ingresi la temperatura: ");
            amb.temperatura = input.nextFloat();
            System.out.print("Ingresi la humitat: ");
            amb.humitat = input.nextInt();
            System.out.print("Ingresi la pressió: ");
            amb.pressió = input.nextInt();    
            
            if (amb.temperatura > max.temperatura) {
                max = amb;
            }
            
        }while(amb.temperatura > 0);
  
        System.out.println("MAXIMS");
        System.out.println("Maxima temperatura: "+ max.temperatura);
        System.out.println("Maxima humitat: "+ max.humitat);
        System.out.println("Maxima pressió: "+ max.pressió);
    }
    
}
