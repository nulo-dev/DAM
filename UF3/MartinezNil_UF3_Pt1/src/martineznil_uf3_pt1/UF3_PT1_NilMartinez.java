/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martineznil_uf3_pt1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class UF3_PT1_NilMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        System.out.print("Ingrese el nombre del archivo: "+"\n> ");
        String nomarchivo = input.nextLine();
        File archivo = new File(nomarchivo);
        do {
            menu();
            int opcion = Util.demanaInt("\nIngrese una opcion: "+"\n> ");
            switch(opcion){
                case 1:
                    IngresarDatos(archivo,true);
                    break;
                case 2:
                    mostrarArchivoProductos(archivo,true,true);
                    break;
                case 3:
                    mostrarArchivoProductos(archivo,false,false);
                    break;
                case 4:
                    mostrarCantidadProductos(archivo,true,false);
                    break;
                case 5:
                    eliminarProducto(archivo);
                    break;
                case 6:
                    mostrarMedianteStock(archivo);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("\u001B[31mOpcion incorrecta.\u001B[0m");
                    break;
            }
        } while (!salir);
        
        
    }
    /**
     * Menu con las opciones que puede escoger el usuario
     */
    public static void menu(){
        
        System.out.println("1. Agregar productos al archivo.");
        System.out.println("2. Mostrar productos del archivo.");
        System.out.println("3. Mostrar producto mediante codigo.");
        System.out.println("4. Mostrar la cantidad de articulos que hay en el almacen i calcular el importe del estoc.");
        System.out.println("5. Eliminar un producto mediante codigo.");
        System.out.println("6. Mostrar productos mediante stock.");
        System.out.println("7. Salir");
        
        
    }
    
    /**
     * El usuario introduce los datos, el programa le pondra que tipo de dato debe ingresar y el usuario los introducira.
     * @return prod devolvemos el producto
     */
    public static Productos pedirDatosProducto() {
        Scanner input = new Scanner(System.in);
        Productos prod = new Productos();
        prod.codigo = Util.demanaInt("Codigo: ");
        if (prod.codigo != 0) {
            System.out.print("Descripcion: ");
            prod.descripcion = input.nextLine();
            prod.precio = Util.demanaDouble("Precio: ");
            prod.cantidad = Util.demanaInt("Cantidad: ");
        }
        return prod;
    }
    
    /**
     * Escribimos los datos que le pasamos al metodo en un Archivo que le habremos indicado previamente.
     * @param f le pasamos el lecto que indica donde esta el archivo
     * @param prod devolvemos el producto
     * @return ret devolvemos un boolean para hacer comprobaciones con el
     */
    public static boolean escribirProducto(PrintStream f, Productos prod) {
        Boolean ret = true;
        try {
            f.printf("%d\n", prod.codigo);
            f.println(prod.descripcion);
            f.printf("%.2f\n", prod.precio);
            f.printf("%d\n", prod.cantidad);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    
    /**
     * Este mnetodo es el que llamamos en el main, sacamos la interfaz para que el usuario introduzca correctamente los datos, 
     * desde este metodo llamamos al metodo escribirProducto que se encargara de ingresar los datos en el archivo
     * @param archivo 
     * @param append Este parametro es para indicar que queremos ingresar los datos sin remplazar el contenido del archivo
     */
    private static void IngresarDatos(File archivo, boolean append) {
        Productos prod = new Productos();
        Productos prodrep = new Productos();
        boolean encontrado = false;
        try {
            System.out.println("======= Ingresar productos =======");
            FileOutputStream fos = new FileOutputStream(archivo, append);
            PrintStream wr = new PrintStream(fos);
            do {
                Scanner lector = new Scanner(archivo);
                prod = pedirDatosProducto();
                System.out.println();
                if (prod.codigo != 0) {
                    while (lector.hasNext()){
                        prodrep = leerProductos(lector);
                        if (prodrep.codigo==prod.codigo) {
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                       escribirProducto(wr, prod);
                    } else {
                        System.out.println("\u001B[31mHa ingresado un codigo repetido\u001B[0m");
                        encontrado = false;
                    }
                }
            } while (prod.codigo != 0);
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
    public static Productos leerProductos(Scanner f) {
        Productos prod = new Productos();
        prod.codigo = f.nextInt();
        f.nextLine();
        prod.descripcion = f.nextLine();
        prod.precio = f.nextDouble();
        f.nextLine();
        prod.cantidad = f.nextInt();
        return prod;
    }
    
    /**
     * Mostramos los productos por pantalla, mediante la opcion y opcion2 podemos hacer que se printe de 3 formas distintas
     * @param prod Producto que le hemos pasado cuando llamamos al metodo
     * @param opcion Esta primera opcion es para indicar que queremos printear el producto con un formato especifico
     * @param opcion2 Esta segunda opcion es para indicar que queremos printearlo con otro formato
     */
    public static void mostraProductos(Productos prod, boolean opcion, boolean opcion2) {
        if (opcion) {
            System.out.printf("\t│%-11d", prod.codigo);
            System.out.printf("%-18s ", prod.descripcion);
            if (opcion2) {
                System.out.printf("%-9.2f\t", prod.precio);   
            } else{
                System.out.printf("%-9.2f\t", prod.precio*prod.cantidad);
            }
            System.out.printf("%d\t │", prod.cantidad);   
        } else {
            System.out.printf("Codigo: %d\n", prod.codigo);
            System.out.printf("Descripcion: %s\n", prod.descripcion);
            System.out.printf("Precio: %.2f\n", prod.precio);
            System.out.printf("Cantidad: %d\n",prod.cantidad);
        }
    }
    
    /**
     * Calculamos la cantidad de Productos que hay en el almacen, el stock total y el precio final de todos los productos.
     * @param archivo Le pasamos el archivo que tiene que leer
     * @param opcion Con esta opcion indicamos si queremos que calcule el precio total de todos los productos o la cantidad de productos que hay
     * @param opcion2 Con esta segunda opcion indicamos que queremos calcular el stock total del almacen
     * @return resultado || resultado2
     */
    public static double calcularTotalPrecioyProductos(File archivo,boolean opcion, boolean opcion2){
        Productos prod = null;
        double resultado = 0;
        double resultado2 = 0;
        try {
        Scanner lector = new Scanner(archivo);
        while(lector.hasNext()){
            prod = leerProductos(lector);
            if (opcion) {
             resultado += prod.cantidad*prod.precio;   
            } else {
             resultado++;
            }
            if (opcion2) {
             resultado2 += prod.cantidad;
            }
        }
        } catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        if (!opcion2) {
         return resultado;   
        } else {
         return resultado2;
        }
    }
    
    /**
     * Un metodo que contiene un cartel que puede printearse de dos formas distintas.
     * @param opcion2 Indicamos la forma que queremos printear el cartel
     */
    public static void cartel(boolean opcion2){
        String precio;
        if (opcion2) {
            precio = "Precio/U";
        } else {
            precio = "Precio/T";
        }
        System.out.println("\t┌────────────────────── Productos ───────────────────────┐");
        System.out.println("\t├────────────────────────────────────────────────────────┤");
        System.out.printf( "\t│%-10s %-16s %10s %16s │\n","Codigo","Descripcion",precio,"Cantidad");
        System.out.println("\t├────────────────────────────────────────────────────────┤");
        
    }
    
    /**
     * Le llamamos desde el main y es un metodo que se reutiliza dos veces para que haga distintas cosas, si ponemos la "opcion" en "true" y la "opcion2" en "true" mostramos el cartel
     * con el codigo del producto, descripcion, precio/u (formato tabla) y la cantidad de stock que tiene es producto, 
     * si ponemos la "opcion" en false y la "opcion2" en false mostramos el producto en formato ficha y buscaremos el producto
     * @param archivo
     * @param opcion
     * @param opcion2 
     */
    public static void mostrarArchivoProductos(File archivo,boolean opcion,boolean opcion2) {
        Productos prod;
        boolean encontrado = false;
        if (opcion) {    
            try {
                cartel(opcion2);
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    prod = leerProductos(lector);
                    mostraProductos(prod,opcion,opcion2);
                    System.out.println();
                }
                System.out.printf( "\t│%57s\n","│");
                System.out.printf( "\t│Total: %45.2f%5s\n",calcularTotalPrecioyProductos(archivo,true,false),"│");
                System.out.println("\t└────────────────────────────────────────────────────────┘");
                System.out.println("");
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());

            }
        } else {
            int buscar = Util.demanaInt("Ingrese el codigo del Producto a buscar: ");
            System.out.println();
            try {
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    prod = leerProductos(lector);
                    if (prod.codigo == buscar) {
                        mostraProductos(prod,opcion,opcion2);
                        System.out.println();
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("\u001B[31mProducto no encontrado.\u001B[0m\n");
                }
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
        
    /**
     * Mostramos la tabla con su cartel pero mostraremos el stock total, productos totales y el precio total dependiendo de las opciones que le pasemos 
     * al metodo calcularTotalPrecioyProductos como ya se indica en el javadoc de ese metodo
     * @param archivo Le pasamos el archivo que tiene que leer
     * @param opcion Esta opcion es para indicarle al metodo mostraProductos y cartel que queremos mostrar los productos/cartel de una manera u otra
     * @param opcion2 Esta opcion es para indicarle al metodo mostraProductos y cartel que queremos mostrar los productos/cartel de una manera u otra
     */
    public static void mostrarCantidadProductos(File archivo, boolean opcion, boolean opcion2){
        Productos prod;
            try {
                cartel(opcion2);
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    prod = leerProductos(lector);
                    mostraProductos(prod,opcion,opcion2);
                    System.out.println();
                }
                System.out.printf( "\t│%57s\n","│");
                System.out.printf( "\t│Stock Total: %39.0f%5s\n",calcularTotalPrecioyProductos(archivo,false,true),"│");
                System.out.printf( "\t│Productos Totales: %33.0f%5s\n",calcularTotalPrecioyProductos(archivo,false,false),"│");
                System.out.printf( "\t│Precio Total: %38.2f%5s\n",calcularTotalPrecioyProductos(archivo,true,false),"│");
                System.out.println("\t└────────────────────────────────────────────────────────┘");
                System.out.println("");
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());

            }
        
    }
    
    /**
     * Con este metodo eliminamos los productos del archivo, lo que hacemos leer el producto con el metodo "leerProductos" y escribirlo en un fichero nuevo, en el momento que
     * encuentre la id que queremos eliminar saltara ese producto y seguira escirbiendo todo los productos en el nuevo archivo consiguiendo que el producto que se queria eliminar
     * no se copie, despues borraremos el archivo y renombraremos el nuevo archivo al nombre del archivo borrado.
     * @param archivo 
     */
    public static void eliminarProducto(File archivo){
        Productos prod;
        boolean correcto = false;
        boolean encontrado = false;
        String resp;
        Scanner input = new Scanner(System.in);
            int eliminar = Util.demanaInt("Ingrese el codigo del Producto que quiere eliminar: ");
            System.out.println("");
            try {
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    prod = leerProductos(lector);
                        if (prod.codigo == eliminar) {
                            mostraProductos(prod,false,false);
                            encontrado = true;
                        }
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            if (encontrado) {
                System.out.println("\n¿Esta seguro que quiere eliminar este producto?(Si/No)");
                resp = input.nextLine();
            } else {
                System.out.println("\n");
                System.out.println("\u001B[31mProducto no encontrado.\u001B[0m");
                System.out.println("\n\n");
                correcto = true;
                resp = "";
            }
        do {
            if (resp.startsWith("s") || resp.startsWith("S") && encontrado) {
                correcto = true;
                try {
                    File nuevoarchivo = new File(archivo+".new");
                    FileOutputStream fos = new FileOutputStream(nuevoarchivo, true);
                    PrintStream wr = new PrintStream(fos);
                    Scanner lector = new Scanner(archivo);
                    while (lector.hasNext()) {
                        prod = leerProductos(lector);
                        if (prod.codigo != eliminar) {
                            escribirProducto(wr,prod);
                        }
                    }
                    if (encontrado) {
                        System.out.printf("\n");
                        System.out.println("\u001B[32mEliminacion del producto satisfactoria.\u001B[0m");
                        System.out.printf("\n\n");   
                    } else {
                        System.out.printf("\n");
                        System.out.println("\u001B[31mLa eliminacion no ha sido satisfactoria, producto no encontrado.\u001B[0m");
                        System.out.printf("\n\n"); 
                    }
                    archivo.delete();
                    nuevoarchivo.renameTo(archivo);
                    lector.close();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (resp.startsWith("n") || resp.startsWith("N") && encontrado) {
                correcto = true;
                System.out.printf("\n");
                System.out.println("\u001B[36mHa cancelado la eliminacion del producto.\u001B[0m");
                System.out.printf("\n\n");
              }else if (encontrado) {
                System.out.println("\u001B[31mOpcion incorrecta.\u001B[0m");
                System.out.println("¿Si/No?");
                resp = input.nextLine();
                correcto = false;
            }
        } while (!correcto);
        
    }
    
    /**
     * Mostraremos los productos que cumplan con la condicion de busqueda que le escribiremos, mostrara los productos que sean inferior a la cantidad introducida.
     * @param archivo Lee el archivo que le hemos pasado desde el main
     */
    public static void mostrarMedianteStock(File archivo){
        Productos prod;
        PrintStream wr = null;
        File nuevoarchivo = new File(archivo+"_listaStock");
        boolean encontrado = false;
        boolean correcto = false;
        String respuesta;
        Scanner input = new Scanner(System.in);
            int buscar = Util.demanaInt("Ingrese el stock a buscar: ");
            System.out.println("");
            System.out.println("¿Quiere generar un archivo nuevo con la lista?");
            respuesta = input.nextLine();
            respuesta = respuesta.toLowerCase();
            do {
                if (respuesta.startsWith("s") || respuesta.startsWith("n")) {
                    correcto = true;
                } else {
                    System.out.println("\u001B[31mOpcion incorrecta.\u001B[0m");
                    System.out.println("¿Si/No?");
                    respuesta = input.nextLine();
                    respuesta = respuesta.toLowerCase();
                    correcto = false;
                }
            } while (!correcto);
            try {
                if (respuesta.startsWith("s")) {
                    FileOutputStream fos = new FileOutputStream(nuevoarchivo, true);
                    wr = new PrintStream(fos);
                }
                Scanner lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    prod = leerProductos(lector);
                    if (prod.cantidad <= buscar) {
                        encontrado = true;
                        mostraProductos(prod,false,false);
                        if (respuesta.startsWith("s")) {
                            escribirProducto(wr,prod);
                        }
                        System.out.println();
                    }
                }
                if (!encontrado) {
                    System.out.printf("\n\u001B[31mNo he podido encontrar un stock igual o menor a la cantidad indicada '%d'.\u001B[0m\n",buscar);
                    nuevoarchivo.delete();
                } else if (respuesta.startsWith("n")) {
                    nuevoarchivo.delete();
                }
                System.out.println();
                lector.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        
    }
    
}
