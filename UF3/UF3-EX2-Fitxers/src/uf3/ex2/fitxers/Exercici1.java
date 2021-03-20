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
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String nomarchivo = input.nextLine();
        boolean salir = false;
        do {
        menu();
        int opcion = input.nextInt();
            switch(opcion){
                case 1:
                        leerArchivo(nomarchivo);
                    break;
                case 2:
                        ingresarArchivo(nomarchivo);
                    break;
                case 3:
                        ingresarArchivoExistente(nomarchivo);
                    break;
                case 4:
                        salir = true;
                    break;
                default:
                        System.out.println("Opcion erronea.");
                    break;
            }
        } while (!salir);
    }
    
    public static void leerArchivo(String nomarchivo){
        File archivo = new File(nomarchivo);
        Scanner lector = null;
        if (archivo.exists()) {
            System.out.println("Leiendo archivo: "+archivo.getAbsolutePath());

            try{
                lector = new Scanner(archivo);

                while(lector.hasNext()){
                    System.out.println("> "+lector.nextLine());
                }

            } catch(Exception e) {
                System.out.println(e.toString());
            }

            if (lector != null) {
                lector.close();
            }   
        } else {
            System.out.println("El archivo no existe.");
        }
        
    }
    
    public static void ingresarArchivo(String nomarchivo){
        
        Scanner input = new Scanner(System.in);
        File archivo = new File(nomarchivo);
        PrintStream escribir = null;
        Scanner lector = null;
        String frase;
        if (archivo.exists()) {
            System.out.println("El archivo ya existe, este metodo crea archivos nuevos y agrega contenido en ellos.");
        } else {
            do {
            System.out.println("Ingrese una frase: ");
            frase = input.nextLine();   
            
            try{
                FileOutputStream fos = new FileOutputStream(archivo, true);
                escribir = new PrintStream(fos);
                lector = new Scanner(archivo);
                escribir.print(frase);
                escribir.println();                
            } catch(Exception e){
                System.out.println(e.toString());
            }
            } while (!frase.isEmpty());

            System.out.println("CONTENIDO DEL ARCHIVO");
            while(lector.hasNext()){
                System.out.println(">> "+lector.nextLine());
            }
        }
        
        
    }
    
    public static void ingresarArchivoExistente(String nomarchivo){
        
        Scanner input = new Scanner(System.in);
        File archivo = new File(nomarchivo);
        PrintStream escribir = null;
        Scanner lector = null;
        if (archivo.exists()) {
            try{
                FileOutputStream fos = new FileOutputStream(archivo, true);
                escribir = new PrintStream(fos);
                lector = new Scanner(archivo);
                System.out.println("Ingrese una frase: ");
                String frase = input.nextLine();
                System.out.println("");
                escribir.println();
                escribir.print(frase);
                
                System.out.println("-----------------CONTENIDO DEL ARCHIVO-----------------");
                while(lector.hasNext()){
                    System.out.println(lector.nextLine());
                }
                System.out.println("");
                System.out.println("--------------------FIN DEL ARCHIVO--------------------");
            } catch(Exception e){
                System.out.println(e.toString());
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
    
    public static void menu(){
        System.out.println("---------------------MENU---------------------");
        System.out.println("1. Leer archivo y mostrarlo por pantalla.");
        System.out.println("2. Ingresar datos a un nuevo archivo.");
        System.out.println("3. Agregar datos a un archivo existente.");
        System.out.println("4. Salir.");
        System.out.print("Ingrese una opcion: ");
    }
    
}
