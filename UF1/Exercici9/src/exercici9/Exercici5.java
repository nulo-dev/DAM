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
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        InfoPersona persona = new InfoPersona();
        final int MAX = 20;
        int empleats = 0;
        int clients = 0;
        InfoPersona persones[] = new InfoPersona[2 * MAX];
        int entrades;

        System.out.println("Quantes persones introduireu? ");
        entrades = teclat.nextInt();
        teclat.nextLine();
        if (entrades <= persones.length) {
            int cont = 0;
            while (cont < entrades) {
                persones[cont] = new InfoPersona();
                System.out.println("Introdueixi el tipus de persona: 1 empleat, 2 client");
                persones[cont].tipus = teclat.nextInt();
                teclat.nextLine();
                boolean bueno = (persones[cont].tipus ==1 && empleats < MAX) || (persones[cont].tipus ==2 && clients < MAX);
                if (bueno) {
                    if (persones[cont].tipus == 1) {
                        empleats++;
                    } else {
                        clients++;
                    }
                    System.out.println("Introdueixi el nom: ");
                    persones[cont].nom = teclat.nextLine();
                    System.out.println("Introdueixi el cognom: ");
                    persones[cont].cognom = teclat.nextLine();
                    System.out.println("Introdueixi l'adreça: ");
                    persones[cont].adreça = teclat.nextLine();
                    cont++;
                }
            }
            System.out.println("Empleats");
            for (int j = 0; j < entrades; j++) {
                if (persones[j].tipus == 1) {
                    System.out.printf("Nom: %s Cognom: %s Adreça %s\n", persones[j].nom, persones[j].cognom, persones[j].adreça);
                }
            }
            System.out.println("Clients");
            for (int j = 0; j < entrades; j++) {
                if (persones[j].tipus == 2) {
                    System.out.printf("Nom: %s Cognom: %s Adreça %s\n", persones[j].nom, persones[j].cognom, persones[j].adreça);
                }
            }
        } else {
            System.out.println("Ho sento el màxim número d'entrades és." + 2 * MAX);
        }   
        
    }
    
}
