/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1uf4.nilmartinez;

import java.util.Scanner;
import java.util.Random;

/**
 * Classe d'utilitats varies
 *
 * @author juditma
 */
public class Util {

    /**
     * Llegir un integer amb control d'errors
     *
     * @param text Missatge que posarà en pantalla
     * @return integer llegit
     */
    public static int demanaInt(String text) {
        Scanner teclat = new Scanner(System.in);
        boolean esNum = false;
        int num = 0;
        do {
            System.out.print(text);
            if (teclat.hasNextInt()) {
                num = teclat.nextInt();
                teclat.nextLine();
                esNum = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();                
            }

        } while (!esNum);
        return num;
    }

    /**
     * Llegir un double amb control d'errors
     *
     * @param text Missatge que posarà en pantalla
     * @return double llegit
     */
    public static double demanaDouble(String text) {
        Scanner teclat = new Scanner(System.in);
        boolean esNum = false;
        double num = 0;
        do {
            System.out.print(text);
            if (teclat.hasNextDouble()) {
                num = teclat.nextDouble();
                teclat.nextLine();
                esNum = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
                esNum = false;
            }

        } while (!esNum);
        return num;
    }

    /**
     *Llegir un char amb control d'errors
     * @param text Missatge que posar en pantalla
     * @param charsValid 
     * @return char llegit
     */
    public static char demanaChar(String text, String charsValid) {
        Scanner teclat = new Scanner(System.in);
        char lletra = ' ';
        String lect = "";
        while (lect.length() == 0) {
            System.out.print(text + " (" + charsValid + "): ");
            lect = teclat.nextLine().toLowerCase();
            if (lect.length() != 1) {
                System.out.println("Error-- una lletra ");
                lect = "";
            } else {
                lletra = lect.charAt(0);
                if (charsValid.indexOf(lletra) == -1) {
                    System.out.println("Error-- opció errònia ");
                    lect = "";
                }
            }
        }
        return lletra;
    }
    
    /**
     * Demana una String
     * @param frase Missatge que se li envia al mètode per demanar el String
     * @return Es torna la String
     */
    public static String demanarString(String frase) {
        Scanner teclat = new Scanner(System.in);
        String paraula;

        do {
            System.out.print(frase);
            paraula = teclat.nextLine();
        } while (paraula.length() == 0);

        return paraula;
    }

}
