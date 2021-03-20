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
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner input = new Scanner (System.in);
//        int cantidad = 3;
//        int max = 20;
//        int j = 0;
//        String discos[] = new String [cantidad];
//        RegistreCD cd;
//        for (int i = 0; i < cantidad; i++) {
//            cd = new RegistreCD();
//            System.out.println("Titul: ");
//            cd.titul = input.nextLine();
//            System.out.println("Autor: ");
//            cd.autor = input.nextLine();
//            System.out.println("Duracio: ");
//            cd.duracio = input.nextInt();
//            System.out.println("Quantitat Cançons: ");
//            cd.quantitat = input.nextInt();
//            input.nextLine();
//            if (cd.quantitat > max) {
//                discos[j] = cd.titul;
//                j++;
//            }
//        }
//        System.out.println("DISCOS CON MAS DE 20 DISCOS");
//        for (int i = 0; i <j; i++) {
//            System.out.println(discos[i]);
//        }

        Scanner input = new Scanner(System.in);
        
        int cantidad = 100;
        int max = 20;
        int j=0;
        RegistreCD cd;
        RegistreCD maxcan[] = new RegistreCD[cantidad];
        
        for (int i = 0; i <maxcan.length; i++) {
            cd = new RegistreCD();
            System.out.println("Titul: ");
            cd.titul = input.nextLine();
            System.out.println("Autor: ");
            cd.autor = input.nextLine();
            System.out.println("Duracio: ");
            cd.duracio = input.nextInt();
            System.out.println("Quantitat Cançons: ");
            cd.quantitat = input.nextInt();
            input.nextLine(); 
            if (cd.quantitat > max) {
                maxcan[j] = new RegistreCD();
                maxcan[j].titul = cd.titul;
                maxcan[j].autor = cd.autor;
                maxcan[j].duracio = cd.duracio;
                maxcan[j].quantitat = cd.quantitat;
                j++;
            }
        }
        System.out.printf("ELS CD'S AMB MES DE %d CANÇONS%n",max);
        for (int i = 0; i <j; i++) {
            System.out.printf("Titul: %s \tAutor: %s \tDuracio: %s \tQuantitat: %s \t\n"
            ,maxcan[i].titul,maxcan[i].autor,maxcan[i].duracio,maxcan[i].quantitat);
            System.out.println("----------------------------------------------------------------------------------");
        }
    }
    
}
