/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionals1;

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
        
        System.out.printf("Ingresi el primer nombre: ");
        int a = input.nextInt();
        System.out.printf("Ingresi el segon nombre: ");
        int b = input.nextInt();
        System.out.printf("Ingresi el tercer nombre: ");
        int c = input.nextInt();
        
        if(a>b && a>c && b<a && b<c && c>b) {
            System.out.printf("%d es el numero major, %d el numero mitja i %d el numero petit%n",a,b,c);
        } else if (b>a && b>c && a<b && a<c && c>a){
            System.out.printf("%d es el numero major, %d el numero mitja i %d el numero petit%n",b,c,a);
        } else if (c>a && c>b && b<a && b<c && a>b){
            System.out.printf("%d es el numero major, %d el numero mitja i %d el numero petit%n",c,a,b);
        }
    }
    
}
