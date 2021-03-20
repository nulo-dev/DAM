/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_m3_uf2_pe1;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double resultado = 0;
        double moneda = 0;
        do {
            
            menu();
            int opcion = util.validint("Ingrese una opcion: ");
            switch(opcion){
                case 1:
                    moneda = util.validdouble("Ingrese la cantidad de euros que quiere convertir a libras: ");
                    resultado = conversion(moneda,opcion);
                    System.out.println("El resultado es: "+resultado +" libras");
                    break;
                case 2:
                    moneda = util.validdouble("Ingrese la cantidad de libras que quiere convertir a euros: ");
                    resultado = conversion(moneda,opcion);
                    System.out.println("El resultado es: "+resultado +" euros");
                    break;
                default:
                    System.out.println("No ha ingresado una opcion correcta.");
                    break;
            }
        } while (moneda!=0);
        
        
        
    }
    public static void menu(){
        System.out.println("CONVERSOR DE MONEDAS (EURO/LIBRA)");
        System.out.println("=================================");
        System.out.println("1. Convertir Euros a Libras");
        System.out.println("2. Convertir Libras a Euros");
    }
    
    /**
     * Ingresas la cantidad de monedas y la opcion seleccionada y mediante un if comprobamos que opcion a escogido el usuario
     * en caso de ser 1 convertimos EUROS a LIBRAS y en caso de ser 2 convertimos LIBRAS A EUROS
     * @param moneda
     * @param opcion
     * @return resultado
     */
    public static double conversion(double moneda, int opcion){
        double resultado = 0;    
        
        if (opcion == 1) {
            resultado = moneda/1.13;
        } else if (opcion == 2) {
            resultado = 1.13*moneda;            
        }
       return resultado; 
    }
}
