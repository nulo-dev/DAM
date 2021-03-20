/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularitzacio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfredo & jordi
 */
public class ModularitzacioBIN {
    // fem servir 1 int (4byte) 1 double (8byte) i una String (2bytes per char)

    final static int INTLEN = 4;
    final static int DOUBLELEN = 8;
    final static int STRLEN = 30;
    final static int REGLEN = 2 * STRLEN + INTLEN + DOUBLELEN;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File fi = new File("cotxes.bin");
        try {
            RandomAccessFile raf = new RandomAccessFile(fi, "rw");

            System.out.println("Logitud arxiu: " + raf.length());
            System.out.println("Total Registres: " + raf.length() / REGLEN);
            System.out.println();
//            escriureFitxerRegistres(raf, false);
            escriureFitxerCotxes(raf, true);
            mostrarFitxerCotxes(raf);
            double mitjaPreu = preuMigCotxes(raf);
            System.out.printf("Mitja preu: %.2f\n", mitjaPreu);
            System.out.println("");
            mostraRegistrePos(raf, Util.demanaInt("Numero de Registre? "));
            raf.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static void escriureFitxerCotxes(RandomAccessFile raf, boolean append) {
        Cotxe cot = new Cotxe();
        try {
            if (append) {
                raf.seek(raf.length()); // Es possiciona al final.
            } else {
                raf.setLength(0); // Buida el fitxer.
            }
            do {
                cot = demanaCotxe();
                if (cot.marca.length() > 0) {
                    escriuCotxe(raf, cot);
                }
                System.out.println();
            } while (cot.marca.length() > 0);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    private static void mostrarFitxerCotxes(RandomAccessFile raf) {
        Cotxe cot;
        try {
            raf.seek(0);
            System.out.println("----- Cotxes------");

            int cont = 0;
            while (raf.getFilePointer() < raf.length()) {
                cot = llegeixCotxe(raf);
                mostraCotxe(cot);
                System.out.println();
                cont++;
            }

        } catch (Exception e) {
            System.out.println("Error! " + e.toString());
        }

    }

    public static void mostraRegistrePos(RandomAccessFile raf, int numRegistre) {
        Cotxe cot;

        try {
            long pos = numRegistre * REGLEN;
            if (pos < raf.length()) {
                raf.seek(pos);
                cot = llegeixCotxe(raf);
                mostraCotxe(cot);
            } else {
                System.out.println("No existeix  el Registre");
                System.out.println("El registre no pot ser més gran que " + ((raf.length() / REGLEN) - 1));
            }

        } catch (Exception e) {
            System.out.println("Error! " + e.toString());
        }
    }

    private static double preuMigCotxes(RandomAccessFile raf) {
        Cotxe cot;
        double acum = 0;
        int cont = 0;
        try {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                cot = llegeixCotxe(raf);
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

    public static void mostraCotxe(Cotxe cot) {
        System.out.println("Marca: " + cot.marca);
        System.out.printf("Cilindrada: %d\n", cot.cilindrada);
        System.out.printf("Preu: %.2f\n", cot.preu);
    }

    public static boolean escriuCotxe(RandomAccessFile raf, Cotxe c) {
        boolean ret = true;
        try {
            escriuString(raf, c.marca, STRLEN);
            raf.writeInt(c.cilindrada);
            raf.writeDouble(c.preu);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }

    public static Cotxe llegeixCotxe(RandomAccessFile raf) {
        Cotxe cot = new Cotxe();
        try {
            cot.marca = llegirString(raf, STRLEN);
            cot.cilindrada = raf.readInt();
            cot.preu = raf.readDouble();
        } catch (Exception ex) {
            System.out.println("Error lecturaBinaria: " + ex.toString());
        }

        return cot;
    }

    /**
     * Mètode que escriu una String a un RandomAccessFile amb una longitud
     * màxima, Si la String és més llarga es retalla i si es més curta s'omple
     * de null per assegurar una longitud fixe del registre
     *
     * @param raf - RandomAccessFile
     * @param str - String que es vol escriure
     * @param maxlength - Màxima longitud de la String
     * @return
     */
    public static boolean escriuString(RandomAccessFile raf, String str, int maxlength) {
        try {
            int numChars = str.length();
            if (numChars > maxlength) { //verifiquem que la longitud de la String no sigui més gran que reservada que la maxima reservada
                numChars = maxlength;
            }
            for (int i = 0; i < numChars; i++) {
                raf.writeChar(str.charAt(i));
            }
            char zeros = 0;// caracter NUL
            for (int i = 0; i < (maxlength - numChars); i++) {
                raf.writeChar(zeros);
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * Donat un fitxer relatiu orientat a byte, correctament posicionat, llegeix
     * un String
     *
     * @param raf Fitxer a tractar
     * @param maxlen longitud màxima de l'string
     * @return String llegit, o null si hi ha error
     */
    public static String llegirString(RandomAccessFile raf, int maxlength) {
        try {
            String str = "";
            for (int i = 0; i < maxlength; i++) {
                char c = raf.readChar();
                if (c != 0) { // caracter NUL
                    str += c;
                }
            }
            return str;
        } catch (Exception e) {
            return null;
        }
    }

}
