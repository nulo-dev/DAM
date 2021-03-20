/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3uf2;

import java.util.Scanner;

/**
 *
 * @author nilma
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        System.out.println(nomnatural(num));
        
    }
    
    public static int nomnatural (int num){
        
        if (num > 1) {
            return num + nomnatural (num-1);
        } else {
            return num;
        }
    }
    
}
