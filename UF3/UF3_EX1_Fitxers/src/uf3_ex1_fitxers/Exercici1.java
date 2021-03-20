/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_ex1_fitxers;

import java.io.File;
import java.util.Date;
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
        
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el nombre del archivo o directorio: ");
            String resparchivo = input.next();
            File archivo = new File(resparchivo);
            boolean salir = false;
        do {
            System.out.println("----------------------------");
            System.out.println("1.Atributos Archivo");
            System.out.println("2.Borrar Archivo");
            System.out.println("3.Comparar y eliminar");
            System.out.println("4.Ver directorio");
            System.out.println("5.Salir");
            System.out.println("----------------------------");
            int resp = util.validint("Ingrese una opcion: ");
            switch (resp){
                case 1:
                    opcion1(archivo);
                    break;
                case 2:
                    opcion2(archivo);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del segundo archivo: ");
                    String resparchivo2 = input.next();
                    File archivo2 = new File(resparchivo2);
                    opcion3(archivo,archivo2);
                    break;
                case 4:
                    opcion4(archivo);
                    break;
                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
        
    }
    
    public static void opcion1(File archivo){
        if (archivo.isFile()) {
            if (archivo.exists()) {
                System.out.println("Permisos de lectura: "+archivo.canRead());
                System.out.println("Permisos de escritura: "+archivo.canWrite());
                System.out.println("Permisos de ejecucion: "+archivo.canExecute());
                System.out.println("Tamaño: "+archivo.length()+" bytes");
                long ultmod=archivo.lastModified();
                Date modificacion = new Date(); 
                modificacion.setTime(ultmod);
                System.out.println("Fecha de modifiacion: "+modificacion.toString()+"\n");
            }
        } else if (archivo.isDirectory()) {
            System.out.println("Es un directorio.\n");
        } else {
            System.out.println("No existe el archivo o el directorio.\n");
        }
    {
        }
    }
    public static void opcion2(File archivo){
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        if (archivo.isFile()) {
                System.out.println("Esta seguro que quiere eliminar el archivo "+"'"+archivo+"' ? (si/no)");
                String respeliminar = input.next();
                if (respeliminar.charAt(0)=='s') {
                    archivo.delete();   
                } else {
                    System.out.println("Ha cancelado la eliminacion del archivo.\n");
                    salir = true;
                }
                if (archivo.exists() && !salir) {
                    System.out.println("El archivo no se ha eliminado correctamente.\n");
                } else if(!archivo.exists() && !salir){
                    System.out.println(archivo.getAbsolutePath());
                    System.out.println("Archivo eliminado satisfactoriamente.\n");
                }
            } else if (archivo.isDirectory()&& !salir) {
                System.out.println("Esta intentando eliminar un directorio.");
            } else if(!archivo.isDirectory() && !salir) {
                System.out.println("Esta intentando eliminar algo que no existe.");
            }
    }
    public static void opcion3 (File archivo, File archivo2){
        Scanner input = new Scanner(System.in);
                    if (archivo.exists()) {
                        if (archivo.isFile()) {
                            if (archivo2.isFile()) {
                                long modf1=archivo.lastModified();
                                Date modificacion1 = new Date(); 
                                modificacion1.setTime(modf1);
                                long modf2=archivo2.lastModified();
                                Date modificacion2 = new Date(); 
                                modificacion2.setTime(modf2);
                                
                                if (modf1==modf2) {
                                    System.out.println("Tienen la misma fecha.");
                                } else if (modf1>modf2) {
                                        System.out.println("El archivo "+archivo2+" es mas antiguo, quiere eliminarlo? (si/no)");
                                        String respeliminar = input.next();
                                    if (respeliminar.charAt(0)=='s') {
                                        System.out.println("Borrando "+archivo2+" por tener fecha de modificacion mas antigua");
                                        archivo2.delete();   
                                        System.out.println(archivo2+" borrado satisfactoriamente.");
                                    } else {
                                        System.out.println("Eliminacion cancelada");
                                    }
                                } else{
                                        System.out.println("El archivo "+archivo+" es mas antiguo, quiere eliminarlo? (si/no)");
                                        String respeliminar = input.next();
                                    if (respeliminar.charAt(0)=='s') {
                                        System.out.println("Borrando "+archivo+" por tener fecha de modificacion mas antigua");
                                        archivo.delete();
                                        System.out.println(archivo+" borrado satisfactoriamente.");   
                                    } else {
                                       System.out.println("Eliminacion cancelada"); 
                                    }
                                }
                                
                            } else  if (archivo2.isDirectory()) {
                                 System.out.println("Esta intentando comparar un directorio.");
                            } else {
                                System.out.println("No existe el archivo o directorio "+"'"+archivo2+"'");
                            }
                        } else if (archivo.isDirectory() || archivo2.isDirectory()) {
                            System.out.println("Esta intentando comparar un directorio.");
                        }   
                    } else {
                            System.out.println("No existe el archivo o directorio "+"'"+archivo+"'");
                        }
        
    }
    public static void opcion4(File archivo){
        
        File[] archivos = archivo.listFiles();
        if (archivo.exists()) {
            if (archivo.isDirectory()) {
                for (int i = 0; i < archivos.length; i++) {
                    System.out.print("Nombre: "+archivos[i].getName()+"   ");
                    System.out.print("Tamaño: "+archivos[i].length());
                    System.out.println("");
                }
                System.out.println();
            }
        }
        
    }
}
