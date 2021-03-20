/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num[];
        num = new int[10];
        int i;
        boolean error = true;
        for (i = 0; i < 10; i++) {
            System.out.print("Ingressi un nombre: ");
            num[i] = input.nextInt();
        }
        
        System.out.println("Ingressi el nombre que vol buscar: ");
            int busc = input.nextInt();
         for(i = 0; i< 10; i++)   {
             
            if(num[i] == busc){
                System.out.printf("El numero %d es troba a la posicio %d%n",busc,i);
                error = false;
            }
            }
            if(error == true) {
             System.out.printf("No se ha trobat el numero%n");
            }
    }
    
}
