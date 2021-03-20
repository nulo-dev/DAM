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
public class activitat6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("CALCULADORA");
        System.out.println("===========");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. Division");
        System.out.println("5. Exponenciacion");
        int respuesta = util.validint("Ingrese la opcion: ");
        int num1 = util.validint("Ingrese el primer valor: ");
        int num2 = util.validint("Ingrese el segundo valor: ");
        switch(respuesta){
            case 1:
                System.out.println("El resultado de la suma es: "+suma(num1,num2));
                break;
            case 2:
                System.out.println("El resultado de la suma es: "+resta(num1,num2));
                break;
            case 3:
                System.out.println("El resultado de la suma es: "+producto(num1,num2));
                break;
            case 4:
                System.out.println("El resultado de la suma es: "+division(num1,num2));
                break;
            case 5:
                System.out.println("El resultado de la suma es: "+exponenciacion(num1,num2));
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
    }
    
    public static double suma(int num1, int num2){
        double resultado = num1+num2;
        return resultado;
    }
    public static double resta(int num1, int num2){
        double resultado = num1-num2;
        return resultado;
    }
    public static double producto(int num1, int num2){
        double resultado = num1%num2;
        return resultado;
    }
    public static double division(int num1, int num2){
        double resultado = num1/num2;
        return resultado;
    }
    public static double exponenciacion(int num1, int num2){
        double resultado = Math.pow(num1, num2);
        return resultado;
    }
    
}
