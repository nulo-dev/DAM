/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3.ex3.fitxers;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici1 {

    final static int INTLEN = 4;
    final static int DOUBLELEN = 8;
    final static int STRLEN = 30;
    final static int REGLEN = 2 * STRLEN + INTLEN + INTLEN + DOUBLELEN;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Ingrese el nombre del archivo: ");
        String narchivo = input.nextLine();
        menu(narchivo);
        File fi = new File(narchivo);
        try{
            RandomAccessFile raf = new RandomAccessFile(fi, "rw"); 
            int opcion = Util.demanaInt("Ingrese una opcion: ");
            do {
                switch (opcion){
                    case 1:
                            mostrarFitxerAlumne(raf);
                        break;
                    case 2:
                            escriureFitxerAlumne(raf,true);
                        break;
                    case 3:
                            
                        break;
                    case 4:
                            notaMigaAlumne(raf);
                        break;
                    case 5:
                        salir = true;
                        break;
                }
            } while (salir);
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public static void menu(String narchivo){
        
        System.out.println("1. Llegir dades del fitxer "+narchivo);
        System.out.println("2. Escriure les dades de alumnes al fitxer "+narchivo);
        System.out.println("3. Visualitzar un alumne per posició "+narchivo);
        System.out.println("4. Calcular mitjana d'edat");
        System.out.println("5. Sortir");
        
    }
    
    private static void escriureFitxerAlumne(RandomAccessFile raf, boolean append) {
        Alumne alum = new Alumne();
        try {
            if (append) {
                raf.seek(raf.length()); // Es possiciona al final.
            } else {
                raf.setLength(0); // Buida el fitxer.
            }
            do {
                alum = demanaAlumne();
                if (alum.nom.length() > 0) {
                    escriuAlumne(raf, alum);
                }
                System.out.println();
            } while (alum.nom.length() > 0);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    private static void mostrarFitxerAlumne(RandomAccessFile raf) {
        Alumne alum;
        try {
            raf.seek(0);
            System.out.println("----- Alumnes ------");

            int cont = 0;
            while (raf.getFilePointer() < raf.length()) {
                alum = llegeixAlumne(raf);
                mostraAlumne(alum);
                System.out.println();
                cont++;
            }

        } catch (Exception e) {
            System.out.println("Error! " + e.toString());
        }

    }

    public static void mostraRegistrePos(RandomAccessFile raf, int numRegistre) {
        Alumne alum;

        try {
            long pos = numRegistre * REGLEN;
            if (pos < raf.length()) {
                raf.seek(pos);
                alum = llegeixAlumne(raf);
                mostraAlumne(alum);
            } else {
                System.out.println("No existeix  el Registre");
                System.out.println("El registre no pot ser més gran que " + ((raf.length() / REGLEN) - 1));
            }

        } catch (Exception e) {
            System.out.println("Error! " + e.toString());
        }
    }

    private static double notaMigaAlumne(RandomAccessFile raf) {
        Alumne alum;
        double acum = 0;
        int cont = 0;
        try {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                alum = llegeixAlumne(raf);
                acum += alum.media;
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

    public static Alumne demanaAlumne() {
        Scanner teclat = new Scanner(System.in);
        Alumne alum = new Alumne();
        System.out.print("Marca: ");
        alum.nom = teclat.nextLine();
        if (alum.nom.length() > 0) {
            alum.codi = Util.demanaInt("Codi: ");
            alum.edad = Util.demanaInt("Edat: ");
            alum.media = Util.demanaDouble("Preu: ");
        }
        return alum;
    }

    public static void mostraAlumne(Alumne alum) {
        
        System.out.println("Nom: "+ alum.nom);
        System.out.printf("Codi: ", alum.codi);
        System.out.printf("Edat: \n", alum.edad);
        System.out.printf("Nota: %.2f\n", alum.media);
    }

    public static boolean escriuAlumne(RandomAccessFile raf, Alumne c) {
        boolean ret = true;
        try {
            escriuString(raf, c.nom, STRLEN);
            raf.writeInt(c.codi);
            raf.writeInt(c.edad);
            raf.writeDouble(c.media);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }

    public static Alumne llegeixAlumne(RandomAccessFile raf) {
        Alumne alum = new Alumne();
        try {
            alum.nom = llegirString(raf, STRLEN);
            alum.codi = raf.readInt();
            alum.edad = raf.readInt();
            alum.media = raf.readDouble();
        } catch (Exception ex) {
            System.out.println("Error lecturaBinaria: " + ex.toString());
        }

        return alum;
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
