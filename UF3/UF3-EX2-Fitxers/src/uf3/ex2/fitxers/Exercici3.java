/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3.ex2.fitxers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String nomarchivo = input.nextLine();
        boolean salir = false;
        File archivo = new File(nomarchivo);
        do {
        menu(nomarchivo);
        int opcion = input.nextInt();
            switch(opcion){
                case 1:
                    opcion1(archivo,false); 
                    break;
                case 2:
                    opcion2i3(archivo,false);
                    break;
                case 3:
                    opcion2i3(archivo,true);    
                    break;
                case 4:
                    System.out.println("La media es: "+opcion4(archivo)+" años");
                    break;
                case 5:
                    opcion1(archivo,true); 
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                        System.out.println("Opcion erronea.");
                    break;
            }
        } while (!salir);
    }
        
    public static void menu(String nomarchivo){
        System.out.println("----------------------------MENU----------------------------");
        System.out.println("1. Leer datos del archivo "+nomarchivo);
        System.out.println("2. Escribir datos de alumno en el archivo "+nomarchivo);
        System.out.println("3. Agregar alumno al archivo "+nomarchivo);
        System.out.println("4. Calcular la media de edad.");
        System.out.println("5. Leer datos del archivo "+nomarchivo+" con el codigo del alumno");
        System.out.println("5. Salir.");
        System.out.print("Ingrese una opcion: ");
    }
    
    public static Alumne leerAlumno(Scanner f) {
        Alumne alum = new Alumne();
        alum.nom = f.nextLine();
        alum.edat = f.nextInt();
        alum.mitjananotes = f.nextDouble();
        f.nextInt();
        f.nextLine();
        return alum;
    }
    public static Alumne leerAlumnomasCodi(Scanner f) {
        Alumne alum = new Alumne();
        alum.nom = f.nextLine();
        alum.edat = f.nextInt();
        alum.mitjananotes = f.nextDouble();
        alum.codi = f.nextInt();
        f.nextLine();
        return alum;
    }
    
    public static void mostraAlumnos(Alumne alum) {
        System.out.println("Nom: " + alum.nom);
        System.out.printf("Edat: %d\n", alum.edat);
        System.out.printf("Media Notas: %.2f\n", alum.mitjananotes);
        System.out.printf("Codigo Alumno: %d\n",alum.codi);
    }
    
    private static void opcion1(File archivo, boolean codigo) {
        Alumne alum;
        if (!codigo) {
        try {
            System.out.println("----- Alumnos ------");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                alum = leerAlumno(lector);
                mostraAlumnos(alum);
                System.out.println();
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
        } else {
        try {
            System.out.println("----- Alumnos ------");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                alum = leerAlumnomasCodi(lector);
                mostraAlumnos(alum);
                System.out.println();
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        }

    }

    public static Alumne pedirDatosAlumno() {
        Scanner teclat = new Scanner(System.in);
        Alumne alum = new Alumne();
        System.out.print("Nombre: ");
        alum.nom = teclat.nextLine();
        if (alum.nom.length() > 0) {
            alum.edat = Util.demanaInt("Edat: ");
            alum.mitjananotes = Util.demanaDouble("Media Notas: ");
            alum.codi = Util.demanaInt("Codigo Alumno: ");
        }
        return alum;
    }
    
    public static boolean escribirAlumno(PrintStream f, Alumne alum) {
        Boolean ret = true;
        try {
            f.println(alum.nom);
            f.printf("%d\n", alum.edat);
            f.printf("%.2f\n", alum.mitjananotes);
            f.printf("%d\n", alum.codi);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    
    private static void opcion2i3(File archivo, boolean append) {
        Alumne alum = new Alumne();
        try {
            System.out.println("Escribir datos Alumno: " + append);
            FileOutputStream fos = new FileOutputStream(archivo, append);
            PrintStream wr = new PrintStream(fos);
            do {
                alum = pedirDatosAlumno();
                System.out.println();
                if (alum.nom.length() > 0) {
                    escribirAlumno(wr, alum);
                }
            } while (alum.nom.length() > 0);
            wr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
    
    private static double opcion4(File archivo) {
        Alumne alum;
        double acum = 0;
        int cont = 0;
        try {
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                alum = leerAlumno(lector);
                acum += alum.edat;
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
