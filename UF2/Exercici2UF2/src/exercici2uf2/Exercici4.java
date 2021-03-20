/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2uf2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Date data1 = new Date(2014-1900, 5, 21);
        Date data2 = new Date(2015-1900, 1, 21);
        datainferior(data1,data2);
        
    }
    
    public static void datainferior(Date data1, Date data2){
        
      int mayor = data1.compareTo(data2);
      int mayor2 = data2.compareTo(data1);
        if (mayor < mayor2) {
         System.out.println(data1);   
        } else {
         System.out.println(data2);
        }
        
    }
    
}
