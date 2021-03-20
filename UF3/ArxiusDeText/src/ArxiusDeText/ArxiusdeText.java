/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArxiusDeText;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alfredo
 */
public class ArxiusdeText {

    public static void main(String[] args) {

        llegirArxiuDeInt("enters.txt");
        llegirArxiuDeLineas("enters.txt");
        escriureArxiuDeText("text.txt");
        afegirArxiuDeText("text.txt");
        llegirArxiuDeLineas("text.txt");
    }

    static void procesa(int v) {
        System.out.println("Valor llegit: " + v);

    }

    static void llegirArxiuDeInt(String fnom) {
        File fi = new File(fnom);
        Scanner lector = null;

        System.out.println("Arxiu: " + fi.getAbsolutePath());
        try {
            //S’intenta obrir el fitxer
            lector = new Scanner(fi);
            //Si s’executa aquesta instrucció, s’ha obert el fitxer
            while (lector.hasNext()) {
                int valor = lector.nextInt();
                procesa(valor);
            }
        } catch (Exception e) {
            //Excepció!
            System.out.println("Error: " + e.toString());
        }
        //Cal tancar el fitxer
        if (lector != null) {
            lector.close();
        }
    }

    static void llegirArxiuDeLineas(String fnom) {
        File fi = new File(fnom);
        Scanner lector = null;

        System.out.println("Arxiu: " + fi.getAbsolutePath());
        try {
            //S’intenta obrir el fitxer
            lector = new Scanner(fi);
            //Si s’executa aquesta instrucció, s’ha obert el fitxer
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                System.out.println(linea);

            }
        } catch (Exception e) {
            //Excepció!
            System.out.println("Error: " + e.toString());
        }
        //Cal tancar el fitxer
        if (lector != null) {
            lector.close();
        }
    }

    static void escriureArxiuDeText(String fnom) {
        PrintStream escr = null;

        try {
            File fo = new File(fnom);
            //FileOutputStream fos = new FileOutputStream (fo, true);
            escr = new PrintStream(fo);
            for (int h = 0; h <= 10; h++) {
                escr.print(h + " ");
            }
            escr.println();
            escr.printf("%.2f\n", 50.33456);
            escr.println("En un lugar de la mancha no creible");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());

        }
        if (escr != null) {
            escr.close();
        }
    }

    static void afegirArxiuDeText(String fnom) {
        PrintStream escr = null;

        try {
            File fo = new File(fnom);
            // Obrim un FOS per append
            FileOutputStream fos = new FileOutputStream(fo, true);
            // Creem un PrintStream basat en el FOS
            escr = new PrintStream(fos);
            for (int h = 50; h <= 60; h++) {
                escr.print(h + " ");
            }
            escr.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());

        }
        if (escr != null) {
            escr.close();
        }
    }

}
