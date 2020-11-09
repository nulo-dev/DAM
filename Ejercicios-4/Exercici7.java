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
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num[];
        num = new int[5];
        
        for(int i=0; i<5; i++){
            System.out.printf("Ingresi un numero: ");
            num[i]= input.nextInt();
        }
        for(int i=4; i>=0; i--){
            System.out.printf("%d ",num[i]);
        }
    }
    
}
