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
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner input = new Scanner (System.in);
//       
//        Corredors corredor;
//        Corredors maxtemps = new Corredors();
//        maxtemps.temps = 15;
//        int l = 0;
//        String nombre[] = new String[10];
//        int tiempo[] = new int[10];
//        int j = 0;
//        for (int i = 0; i < 10; i++) {
//            corredor = new Corredors();
//            System.out.println("Nom: ");
//            corredor.nom = input.nextLine();
//            System.out.println("Temps (en minuts)");
//            corredor.temps = input.nextInt();
//            input.nextLine();
//            if (corredor.temps > maxtemps.temps) {
//                nombre[j] = corredor.nom;
//                tiempo[j] = corredor.temps;
//                j++;
//            }
//        }
//        System.out.printf("%nMes de 15 minuts%n");
//        for (int i = 0; i < j; i++) {
//            System.out.println("Nom: "+nombre[i]);
//            System.out.println("Temps: "+tiempo[i]);
//        }
        Scanner input = new Scanner (System.in);
        int cantidad = 3;
        int j = 0;
        Corredors corredor[] = new Corredors[cantidad];
        Corredors corredormax[] = new Corredors[cantidad];
        int maxtemps = 15;;
        for (int i = 0; i <cantidad; i++) {
            corredor[i] = new Corredors();
            System.out.println("Nom: ");
            corredor[i].nom = input.nextLine();
            System.out.println("Temps (en minuts)");
            corredor[i].temps = input.nextInt();
            input.nextLine();
            if (corredor[i].temps > maxtemps) {
                corredormax[j] = new Corredors();
                corredormax[j].nom = corredor[i].nom;
                corredormax[j].temps = corredor[i].temps;
                j++;
            }
        }
        System.out.printf("%nMes de 15 minuts%n");
        for (int i = 0; i < j; i++) {
            System.out.println("Nom: "+corredormax[i].nom);
            System.out.println("Temps: "+corredormax[i].temps);
        }
    }
    
}
