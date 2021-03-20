/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3uf2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nilma
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(20);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println(sumaarray(array,0));

        
    }
    
    public static int sumaarray(int[] array, int num) {
        if (num >= array.length) {
            return 0;
        } else {
            return array[num] + sumaarray(array, num+1);
        }
    } 
    
}
