/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat2.metodes;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class activitat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String genero = pedirGenero();
        int edad = pedirEdat();
        double altura = pedirAltura();
        double tiempo = pedirTiempo();
        
        boolean apto = aptos(genero,edad,altura,tiempo);
        if (apto) {
            System.out.println("Es apto");
        } else {
            System.out.println("No es apto");
        }
        
    }
    
    public static String pedirGenero (){
        
        String genero = "";
        Scanner input = new Scanner (System.in);
        boolean correcto = false;
        while(!correcto){
        System.out.println("Selecciona tu genero (h/m): ");
        genero = input.nextLine();
        if (genero.equals("h")) {
            correcto = true;
        } else if (genero.equals("m")) {
            correcto = true;
        } else {
            correcto = false;
        }
       }
        return genero;
    }
    public static int pedirEdat(){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        return edad;
}
    public static double pedirAltura (){
        double altura;
        Scanner input = new Scanner (System.in);
        System.out.println("Escriba su altura: ");
        altura = input.nextDouble();
        return altura;
    }
    public static double pedirTiempo (){
        double tiempo;
        Scanner input = new Scanner (System.in);
        System.out.println("Tiempo de finalizacion del maraton: ");
        tiempo = input.nextDouble(); 
        return tiempo;
    }
    public static boolean aptos (String genero,int edad,double altura, double tiempo){
        boolean apto = false;
        if (genero.equals("h")) {
            if (edad < 40) {
                if (tiempo <= 150) {
                   apto = true; 
                }   
            } else {
                if (tiempo <= 175) {
                    apto = true;
                }
            }
        } else {
            if (tiempo <= 180) {
                apto = true;
            }
        }

        return apto;
    }
    
    
}
