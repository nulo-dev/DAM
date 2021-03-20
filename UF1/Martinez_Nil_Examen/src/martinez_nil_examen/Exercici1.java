/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinez_nil_examen;

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
        
        System.out.println("1r Plat:");
        System.out.printf("\t 1.-Sopa (4,5€)%n");
        System.out.printf("\t 2.-Macarrons (5,0€)%n");
        System.out.printf("\t 3.-Llenties (6,6€)%n");
        System.out.printf("\t 4.-Amanida (4€)%n");
        System.out.printf("Selecciona el 1r Plat: ");
        int a = input.nextInt();
        double primplato = 0;
        
        switch (a) {
            case 1:
                primplato = 4.5;
                break;
            case 2:
                primplato = 5.0;
                break;
            case 3:
                primplato = 6.6;
                break;
            case 4:
                primplato = 4.0;
                break;
            default:
                break;
        }
        

        System.out.println("2r Plat:");
        System.out.printf("\t 1.-Lluç (6,5€)%n");
        System.out.printf("\t 2.-Vedella (7,0€)%n");
        System.out.printf("\t 3.-Pollastre (5,6€)%n");
        System.out.printf("Selecciona el 2r Plat: ");
        int b = input.nextInt();
        double segplato = 0;
        
        switch (b) {
            case 1:
                segplato = 6.5;
                break;
            case 2:
                segplato = 7.0;
                break;
            case 3:
                segplato = 5.6;
                break;
            default:
                break;
        }

        System.out.printf("Client habitual(s/n)? ");
        String respuesta = input.next();
        
        if ("s".equals(respuesta)) {
            double pago = primplato+segplato;
            double descuento = pago*8/100;
            double pagototal = pago-descuento;
            System.out.printf("Total a pagar: %.1f €%n",pagototal);
        } else if("n".equals(respuesta)){
            double pago = primplato+segplato;
            System.out.printf("Total a pagar: %.1f €%n",pago);
        }
    }
    
}
