/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularitzacio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author alfredo
 */
public class Modularitzacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fi = new File("cotxes.txt");
        escriureFitxerCotxes(fi, false);
        escriureFitxerCotxes(fi, true);
        mostrarFitxerCotxes(fi);
        double mitjaPreu = preuMigCotxes(fi);
        System.out.printf("Mitja preu: %.2f\n", mitjaPreu);
    }

    public static Cotxe demanaCotxe() {
        Scanner teclat = new Scanner(System.in);
        Cotxe cot = new Cotxe();
        System.out.print("Marca: ");
        cot.marca = teclat.nextLine();
        if (cot.marca.length() > 0) {
            cot.cilindrada = Util.demanaInt("Cilindrada: ");
            cot.preu = Util.demanaDouble("Preu: ");
        }
        return cot;
    }

    public static boolean escriuCotxe(PrintStream f, Cotxe c) {
        Boolean ret = true;
        try {
            f.println(c.marca);
            f.printf("%d\n", c.cilindrada);
            f.printf("%.2f\n", c.preu);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }

    public static Cotxe llegeixCotxe(Scanner f) {
        Cotxe cot = new Cotxe();
        cot.marca = f.nextLine();
        cot.cilindrada = f.nextInt();
        cot.preu = f.nextDouble();
        f.nextLine();
        return cot;
    }

    public static void mostraCotxe(Cotxe cot) {
        System.out.println("Marca: " + cot.marca);
        System.out.printf("Cilindrada: %d\n", cot.cilindrada);
        System.out.printf("Preu: %.2f\n", cot.preu);
    }

    private static void escriureFitxerCotxes(File fi, boolean append) {
        Cotxe cot = new Cotxe();
        try {
            System.out.println("Escriure Cotxes- Append: " + append);
            FileOutputStream fos = new FileOutputStream(fi, append);
            PrintStream wr = new PrintStream(fos);
            do {
                cot = demanaCotxe();
                System.out.println();
                if (cot.marca.length() > 0) {
                    escriuCotxe(wr, cot);
                }
            } while (cot.marca.length() > 0);
            wr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    private static void mostrarFitxerCotxes(File fi) {
        Cotxe cot;
        try {
            System.out.println("----- Cotxes------");
            Scanner lector = new Scanner(fi);
            while (lector.hasNext()) {
                cot = llegeixCotxe(lector);
                mostraCotxe(cot);
                System.out.println();
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private static double preuMigCotxes(File fi) {
        Cotxe cot;
        double acum = 0;
        int cont = 0;
        try {
            Scanner lector = new Scanner(fi);
            while (lector.hasNext()) {
                cot = llegeixCotxe(lector);
                acum += cot.preu;
                cont++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if (cont > 0) {
            return acum / cont;
        }
        return 0;
    }
}
