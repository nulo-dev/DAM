/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2uf2;

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
        System.out.print("Ingrese un numero: ");
        double a = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = input.nextDouble();
        System.out.println("CALCULADORA");
        System.out.println("1. ¿Cual es el numero mas pequeño?");
        System.out.println("2. ¿Cual es el numero mas grande?");
        System.out.println("3. Elevar un numero");
        System.out.println("4. Redondear un numero decimal");
        System.out.println("5. La raiz cuadrada de un numero");
        System.out.print("Seleccione una opcion: ");
        int respuesta = input.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("El numero mas pequeño es: ");
                System.out.print(Math.min(a, b));
                break;
            case 2:
                System.out.println("El numero mas grande es: ");
                System.out.print(Math.max(a, b));
                break;
            case 3:
                System.out.println("El numero elevado es: ");
                System.out.print(Math.pow(a, b));
                break;
            case 4:
                System.out.println("El numero redondeado es: ");
                System.out.println(Math.round(a));
                System.out.println(Math.round(b));
                break;
            case 5:
                System.out.println("La raiz cuadrada es: ");
                System.out.println(Math.sqrt(a));
                System.out.println(Math.sqrt(b));
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        System.out.println("");
    }
    
}
