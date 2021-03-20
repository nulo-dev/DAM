/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martineznil;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class MartinezNil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un numero: ");
        int num = teclat.nextInt();
        
        if (num>-3 && num<27) {
            System.out.printf("El numero %d esta entre el -3 y el 27 %n", num);
        } else {
            System.out.printf("El numero %d no esta entre el -3 y 27 %n", num);
        }   
    }
    
}
