/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat1.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingrese el radio del cilindro: ");
        int radio;
        radio = util.validint();
        System.out.println("Ingrese la altura del cilindro: ");
        int altura;
        altura = util.validint();
        
        double resultado = cilindro(radio,altura);
        System.out.printf("%.3f",resultado);
        System.out.println("");
    }

    public static double cilindro(int radio, int altura){
        double calculo = 0;        
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que quiere calcular?");
        System.out.println("A. Area");
        System.out.println("V. Volumen");
        String respuesta = input.next();
        switch(respuesta){
            case "a":
                System.out.print("El area del cilindro es: ");
                calculo = 2 * 3.1416 * radio * (radio+altura);
                break;
            case "v":
                System.out.print("El volumen del cilindro es: ");
                double radioelevado = radio*radio;
                calculo = 3.1416 * radioelevado * altura;
        }
        return calculo;
}    

    
}
