/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf2_pe1;

import java.util.Random;
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
        
        Scanner input = new Scanner(System.in);
        int horas = 10;
        int dias = 6;
        int[][] array = new int[dias][horas];
        boolean salir = false;
        llenarAleatorio(array,horas,dias);
        do {
        menu();
        int opcion = util.validint("Ingrese una opcion: ");
        switch(opcion){
            case 1:
                opcion1(array,horas,dias);
                break;
            case 2: 
                int diaopcion2 = util.validint("Ingrese el dia que quiere ver: ");
                opcion2(array,horas,diaopcion2-1);
                break;
            case 3:
                int horaopcion3 = util.validint("Ingrese la hora que quiere calcular: ");
                opcion3(array,horaopcion3-1,dias);
                break;
            case 4:
                opcion4(array,horas,dias);
                break;
            case 5:
                salir = true;
                break;
            default:
                System.out.println("No ha introducido una opcion correcta.");
                break;
        }
        } while (!salir);
    }
    
    public static void menu(){
        
        System.out.println("MENU SUPERMERCADO");
        System.out.println("=================");
        System.out.println("1. Mostrar toda la informacion."); // Mostrar les dades de tots els dies per pantalla amb un cert format
        System.out.println("2. Mostrar la informacion de un dia en concreto. "); // Mostrar per pantalla la informacio d'un dia concret un cop intrduïda la seva posicio
        System.out.println("3. Calcular la media de clientes de una hora."); // Calcular la mitjana de clients d'una hora en concret un cop introduïda la seva posició.
        System.out.println("4. Mostrar la hora con la media mas alta de clientes."); // Mostrar per pantalla l'hora amb la mitjana de clients mes alta
        System.out.println("5. Salir.");
    }
    
    public static int[][] llenarAleatorio(int[][] array,int horas, int dias){
        
        Random rnd = new Random();
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
               array[i][j] = rnd.nextInt(201);
            }
        }
               
        return array;
    }
    
    public static void opcion1(int[][] array,int horas, int dias){
        System.out.println("");
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
                if (j==0) {
                    System.out.print("|");
                }
                if (array[i][j] <10) {
                    System.out.print(array[i][j]+"   |");
                } else if (array[i][j] <100) {
                    System.out.print(array[i][j]+"  |");
                } else{
                    System.out.print(array[i][j]+" |");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void opcion2(int[][] array, int horas, int dia){
        System.out.println("");
            for (int j = 0; j < horas; j++) {
                if (j==0) {
                    System.out.print("|");
                }
                if (array[dia][j] <10) {
                    System.out.print(array[dia][j]+"   |");
                } else if (array[dia][j] <100) {
                    System.out.print(array[dia][j]+"  |");
                } else{
                    System.out.print(array[dia][j]+" |");
                }
            }
        System.out.println("");
    }
    
    public static void opcion3(int[][] array, int hora, int dias){
        System.out.println("");
        
            double resultado = 0;
            for (int j = 0; j < dias; j++) {
                resultado = resultado + array[j][hora];
            }
            resultado = resultado/dias;
            System.out.println("El resultado es: "+resultado);
        System.out.println("");
    }
 
    public static void opcion4(int[][] array, int horas, int dias){
        System.out.println("");
        int aux = 0;
        double mayor2 = 0;
        double[] mayor = new double[dias];
        for (int i = 0; i <dias; i++) {
            for (int j = 0; j < horas; j++) {
                mayor[i] = 0;
            }
        }
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
                mayor[i]= mayor[i]+ array[i][j];
            }
        }
        for (int i = 0; i < dias; i++) {
            if(mayor[i]>mayor2){
                mayor2=mayor[i];
                aux = i;
            }
        }
        aux=11+1;
        mayor2=mayor2/dias;
        System.out.println("La hora con le media de clientes mas alta es el dia "+aux+" con un total de: "+mayor2);
        System.out.println("");
    }
}