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
public class Exercici4 {

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
                    int cobuscar = Util.demanaInt("Ingrese el codigo que quiere buscar: ");
                    opcion5(archivo,cobuscar); 
                    break;
                case 6:
                    int suelsuperior = Util.demanaInt("Ingrese el sueldo: ");
                    opcion6(archivo,suelsuperior);
                    break;
                case 7:
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
        System.out.println("2. Escribir datos de trabajador en el archivo "+nomarchivo);
        System.out.println("3. Agregar trabajador al archivo "+nomarchivo);
        System.out.println("4. Calcular la media de sueldos.");
        System.out.println("5. Buscar trabajador mediante codigo");
        System.out.println("6. Listar los trabajadores que tienen un sueldo superior al solicitado");
        System.out.println("7. Salir.");
        System.out.print("Ingrese una opcion: ");
    }
    
    public static Treballadors leerTreballadors(Scanner f) {
        Treballadors treb = new Treballadors();
        treb.codi = f.nextInt();
        treb.nom = f.next();
        f.nextLine();
        treb.edat = f.nextInt();
        treb.sou = f.nextDouble();
        f.nextLine();
        return treb;
    }
    
    public static void mostraTreballadors(Treballadors treb) {
        System.out.printf("Codigo Trabajador: %d\n", treb.codi);
        System.out.println("Nom: " + treb.nom);
        System.out.printf("Edat: %d\n", treb.edat);
        System.out.printf("Sueldo: %.2f\n", treb.sou);
    }
    
    private static void opcion1(File archivo, boolean codigo) {
        Treballadors treb;
        try {
            System.out.println("------- Trabajadores ------");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                treb = leerTreballadors(lector);
                mostraTreballadors(treb);
                System.out.println();
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }   

    }

    public static Treballadors pedirDatosTreballadors() {
        Scanner teclat = new Scanner(System.in);
        Treballadors treb = new Treballadors();
        treb.codi = Util.demanaInt("Codigo: ");
        if (treb.codi > 0) {
            System.out.println("Nombre: ");
            treb.nom = teclat.nextLine();
            treb.edat = Util.demanaInt("Edad: ");
            treb.sou = Util.demanaDouble("Sueldo: ");
        }
        return treb;
    }
    
    public static boolean escribirTreballadors(PrintStream f, Treballadors treb) {
        Boolean ret = true;
        try {
            f.printf("%d\n", treb.codi);
            f.println(treb.nom);
            f.printf("%d\n", treb.edat);
            f.printf("%.2f\n", treb.sou);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    
    private static void opcion2i3(File archivo, boolean append) {
        Treballadors treb = new Treballadors();
        try {
            System.out.println("Escribir datos Trabajador: " + append);
            FileOutputStream fos = new FileOutputStream(archivo, append);
            PrintStream wr = new PrintStream(fos);
            do {
                treb = pedirDatosTreballadors();
                System.out.println();
                if (treb.codi > 0) {
                    escribirTreballadors(wr, treb);
                }
            } while (treb.codi > 0);
            wr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
    
    private static double opcion4(File archivo) {
        Treballadors treb;
        double acum = 0;
        int cont = 0;
        try {
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                treb = leerTreballadors(lector);
                acum += treb.sou;
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

    public static boolean mostraTreballadorsCodigo(Treballadors treb, int cobuscar) {
        boolean encontrado = false;
        if (treb.codi == cobuscar) {
            System.out.printf("Codigo Trabajador: %d\n",treb.codi);
            System.out.println("Nom: " + treb.nom);
            System.out.printf("Edat: %d\n", treb.edat);
            System.out.printf("Sueldo: %.2f\n", treb.sou);   
            encontrado = true;
        }
        return encontrado;
    }
    
    public static void opcion5 (File archivo,int cobuscar){
        boolean encontrado = false;
        Treballadors treb;
        try {
            System.out.println("------- Trabajadores ------");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                treb = leerTreballadors(lector);
                encontrado = mostraTreballadorsCodigo(treb,cobuscar);
                System.out.println();
            }
            if (!encontrado) {
                System.out.println("Trabajador no encontrado, el codigo no existe.");
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        } 
        
    }
   
    public static boolean mostraTreballadorsSou(Treballadors treb, int suelsuperior) {
        boolean encontrado = false;
        if (treb.sou == suelsuperior) {
            System.out.printf("Codigo Trabajador: %d\n",treb.codi);
            System.out.println("Nom: " + treb.nom);
            System.out.printf("Edat: %d\n", treb.edat);
            System.out.printf("Sueldo: %.2f\n", treb.sou);   
            encontrado = true;
        }
        return encontrado;
    }
    
    
    public static void opcion6 (File archivo, int suelsuperior){
        
        boolean encontrado = false;
        Treballadors treb;
        try {
            System.out.println("------- Trabajadores ------");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                treb = leerTreballadors(lector);
                encontrado = mostraTreballadorsCodigo(treb,suelsuperior);
                System.out.println();
            }
            if (!encontrado) {
                System.out.println("Trabajador no encontrado, el sueldo no existe.");
            }
            lector.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }  
        
    }
    
}
