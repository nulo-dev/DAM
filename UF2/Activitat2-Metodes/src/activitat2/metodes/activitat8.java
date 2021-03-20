/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat2.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class activitat8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad = util.validint("Cantidad de trabajadores: ");
        int aumento = util.validint("Cantidad de aumento: ");
        Trabajador trabajador[] = new Trabajador[cantidad];
        int j = 1;
        for (int i = 0; i < cantidad; i++) {
            trabajador[i] = new Trabajador();
            System.out.println("Ingrese el DNI del trabajador "+j+": ");
            trabajador[i].dni = input.next();
            System.out.println("Ingrese el Nombre del trabajador "+j+": ");
            trabajador[i].nom = input.next();
            System.out.println("Ingrese el Sueldo del trabajador "+j+": ");
            trabajador[i].sueldo = input.nextDouble();
            input.nextLine();
            j++;
        }
        souAumentat(trabajador,cantidad,aumento);
    }
    
    public static void souAumentat(Trabajador trabajador[], int cantidad, int aumento){
        
        System.out.printf("SUELDOS CON EL INCREMENTO DEL %d%% %n",aumento);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("DNI: "+trabajador[i].dni);
            System.out.println("Nombre: "+trabajador[i].nom);
            trabajador[i].sueldo = trabajador[i].sueldo + trabajador[i].sueldo*aumento/100;
            System.out.println("Sueldo: "+trabajador[i].sueldo);
        }
        
    }
    
}
