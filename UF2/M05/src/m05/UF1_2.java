/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class UF1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double resultado;
        System.out.println("CALCULADORA");
        System.out.println("===========");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Division");
        System.out.println("Selecciona la operacion que quieres hacer: ");
        int selec = input.nextInt();
        if (selec >=1 && selec <=3) {
            System.out.println("Ingrese el primer valor a calcular: ");
            num1 = input.nextDouble();
            System.out.println("Ingrese el segundo valor a calcular: ");
            num2 = input.nextDouble();   
        } else {
            
        }
        switch (selec){
            
            case 1:
                   resultado = num1+num2;
                   System.out.printf("El resultado de la suma es: %.2f%n",resultado);
                break;
                
            case 2:
                   resultado = num1-num2;
                   System.out.printf("El resultado de la resta es: %.2f%n",resultado);
                break;
                
            case 3:
                   resultado = num1/num2;
                   System.out.printf("El resultado de la division es: %.2f%n",resultado);
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        
        
    }
    
}
