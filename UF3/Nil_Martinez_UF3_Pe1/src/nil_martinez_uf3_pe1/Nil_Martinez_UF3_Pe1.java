/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nil_martinez_uf3_pe1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Nil_Martinez_UF3_Pe1 {


    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Ingrese el nombre del archivo:");
        String nomarchivo = input.nextLine();
        do {
            menu();
            System.out.print("Ingrese una opcion: "+"\n> ");
            int opcion = input.nextInt();
            switch(opcion){
                case 1:
                    IngresarDatos(nomarchivo,true);
                    break;
                case 2:
                    IngresarDatos(nomarchivo,false);
                    break;
                case 3:
                    mostrarArchivoPeliculas(nomarchivo,true);
                    break;
                case 4:
                    mostrarArchivoPeliculas(nomarchivo,false);
                    break;
                case 5:
                    mostrarMedianteValoracion(nomarchivo);
                    break;
                case 6:
                    salir = true;
                    break;
                    
            }
        
        } while (!salir);
    }
     /**
     * Menu con las opciones que puede escoger el usuario
     */
    public static void menu(){
        
        System.out.println("1. Crear y agregar informacion al archivo.");
        System.out.println("2. Agregar un registro al archivo (Necesario que el archivo exista).");
        System.out.println("3. Listar las peliculas en formato linea.");
        System.out.println("4. Mostrar informacion de una pelicula mediante ID.");
        System.out.println("5. Listar peliculas con una valoracion superior a la ingresada.");
        System.out.println("6. Salir.");
        
    }
    
    
    /**
     * El usuario introduce los datos, el programa le pondra que tipo de dato debe ingresar y el usuario los introducira.
     * @return pel devolvemos la pelicula
     */
    public static Peliculas pedirDatosPelicula() {
        Scanner input = new Scanner(System.in);
        Peliculas pel = new Peliculas();
        pel.id = Util.demanaInt("ID: ");
        if (pel.id != 0) {
            System.out.print("Titulo: ");
            pel.titulo = input.nextLine();
            pel.año = Util.demanaInt("Año: ");
            pel.valoracion = Util.demanaDouble("Valoracion: ");
        }
        return pel;
    }
    
    /**
     * Este metodo es el que llamamos en el main, sacamos la interfaz para que el usuario introduzca correctamente los datos, 
     * desde este metodo llamamos al metodo escribirPeliculas que se encargara de ingresar los datos en el archivo 
     * @param opcion para indicar que queremos ingresar muchos datos o solo un dato
     */
    private static void IngresarDatos(String nomarchivo, boolean opcion) {
        Peliculas pel = new Peliculas();
        Peliculas pelrep = new Peliculas();
        boolean encontrado = false;
        if (opcion) {
            File eliminar = new File(nomarchivo);
            eliminar.delete();   
        }
        File archivo = new File(nomarchivo);
        try {
            System.out.println("======= Ingresar Peliculas =======");
            FileOutputStream fos = new FileOutputStream(archivo, true);
            PrintStream wr = new PrintStream(fos);
            do {
                Scanner lector = new Scanner(archivo);
                if (opcion) {
                 pel = pedirDatosPelicula();   
                } else {
                    if (archivo.exists()) {
                        pel = pedirDatosPelicula();   
                    } else {
                        System.out.println("El archivo no existe");
                    }
                }
                System.out.println();
                if (pel.id != 0) {
                    while (lector.hasNext()){
                        pelrep = leerPeliculas(lector);
                        if (pelrep.id==pel.id) {
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                         escribirPelicula(wr, pel);   
                    } else {
                        System.out.println("\u001B[31mHa ingresado un codigo repetido\u001B[0m");
                        encontrado = false;
                    }
                }
            } while (pel.id != 0 && opcion);
            wr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    
    /**
     * Leemos el contenido del archivo que le hemos pasado en el scanner
     * @param f contiene la ubicacion del archivo que tiene que leer
     * @return 
     */
    public static Peliculas leerPeliculas(Scanner f) {
        Peliculas pel = new Peliculas();
        pel.id= f.nextInt();
        f.nextLine();
        pel.titulo = f.nextLine();
        pel.año = f.nextInt();
        f.nextLine();
        pel.valoracion = f.nextDouble();
        return pel;
    }
    
    /**
     * Escribimos los datos que le pasamos al metodo en un Archivo que le habremos indicado previamente.
     * @param f le pasamos el lecto que indica donde esta el archivo
     * @param pel devolvemos la pelicula
     * @return ret devolvemos un boolean para hacer comprobaciones con el
     */
    public static boolean escribirPelicula(PrintStream f, Peliculas pel) {
        Boolean ret = true;
        try {
            f.printf("%d\n", pel.id);
            f.println(pel.titulo);
            f.printf("%d\n", pel.año);
            f.printf("%.2f\n", pel.valoracion);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    
    /**
     * Le llamamos des de el main y es un metodo que se reutiliza dos veces para que haga distintas cosas, si ponemos la "opcion" en "true" y la "opcion2" en "true" mostramos el contenido
     * del archivo de distinta manera, 
     * si ponemos la "opcion" en false y la "opcion2" en false mostramos la pelicula en formato ficha y buscaremos la pelicula
     * @param nomarchivo
     * @param opcion
     * @param opcion2 
     */
    public static void mostrarArchivoPeliculas(String nomarchivo,boolean opcion) {
        File archivo = new File(nomarchivo);
        Peliculas pel;
        boolean encontrado = false;
        if (opcion) {    
            try {
                cartel();
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    pel = leerPeliculas(lector);
                    mostraPeliculas(pel,opcion);
                    System.out.println();
                }
                System.out.printf( "\t│%81s\n","│");
                System.out.println("\t└────────────────────────────────────────────────────────────────────────────────┘");
                System.out.println("");
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());

            }
        } else {
            int buscar = Util.demanaInt("Ingrese el codigo de la Pelicula a buscar: ");
            System.out.println();
            try {
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    pel = leerPeliculas(lector);
                    if (pel.id == buscar) {
                        mostraPeliculas(pel,opcion);
                        System.out.println();
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("\u001B[31mPelicula no encontrado.\u001B[0m\n");
                }
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
    
    /**
     * Mostramos las peliculas por pantalla, mediante la opcion y opcion2 podemos hacer que se printe de 3 formas distintas
     * @param pel Pelicula que le hemos pasado cuando llamamos al metodo
     * @param opcion Esta primera opcion es para indicar que queremos printear la pelicula con un formato especifico
     */
    public static void mostraPeliculas(Peliculas pel, boolean opcion) {
        if (opcion) {
            System.out.printf("\t│%-11d", pel.id);
            System.out.printf("%-40s ", pel.titulo);
            System.out.printf("%5d\t", pel.año);   
            System.out.printf("%15.2f\t │", pel.valoracion);   
        } else {
            System.out.printf("ID: %d\n", pel.id);
            System.out.printf("Titulo: %s\n", pel.titulo);
            System.out.printf("Año: %d\n",pel.año);
            System.out.printf("Valoracion: %.2f\n", pel.valoracion);
        }
    }
    
    /**
     * Un metodo que contiene un cartel 
     */
    public static void cartel(){
        System.out.println("\t┌────────────────────────────────── Peliculas ───────────────────────────────────┐");
        System.out.println("\t├────────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf( "\t│%-10s %-16s %28s %22s │\n","ID","Titulo","Año","Valoracion");
        System.out.println("\t├────────────────────────────────────────────────────────────────────────────────┤");
        
    }
        
    /**
     * Mostraremos las peliculas que cumplan con la condicion de busqueda que le escribiremos, mostrara las peliculas que sean superiores a la cantidad introducida.
     * @param nomarchivo Contiene el nombre del archivo que le hemos indicado en el main
     */
    public static void mostrarMedianteValoracion(String nomarchivo){
        File archivo = new File(nomarchivo);
        Peliculas pel;
        PrintStream wr = null;
        boolean encontrado = false;
            double buscar = Util.demanaDouble("Ingrese la valoracion a buscar: ");
            System.out.println("");
            try {
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    pel = leerPeliculas(lector);
                    if (pel.valoracion >= buscar) {
                        encontrado = true;
                        mostraPeliculas(pel,false);
                        System.out.println();
                    }
                }
                if (!encontrado) {
                    System.out.printf("\n\u001B[31mNo he podido encontrar una pelicula con una valoracion igual o mayor a la cantidad indicada '%.2f'.\u001B[0m\n",buscar);
                }
                System.out.println();
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        
    }
    
    }
    
