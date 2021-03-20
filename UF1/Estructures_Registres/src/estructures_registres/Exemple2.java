/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructures_registres;

import java.util.Scanner;

/**
 *
 * @author alfredo
 */

public class Exemple2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        Persona pers;

        pers = new Persona();

        pers.nom = "Alfredo";
        pers.cognom = "Ruiz";
        pers.dni = "12345678T";
        pers.talla = 40;
        pers.pes = 70.5;

        System.out.printf("Hola %s %s amb dni: %s. Pesas %.2f i la teva talla es la %d\n",
                pers.nom, pers.cognom, pers.dni, pers.pes, pers.talla);

        Persona alumnes[] = new Persona[3];
        //Persona alumne;
        for (int i = 0; i < alumnes.length; i++) {
            alumnes[i] = new Persona();
            System.out.printf("Alumne %d: \n", i + 1);
            System.out.print("Nom: ");
            alumnes[i].nom = teclat.nextLine();
            System.out.print("Cognom: ");
            alumnes[i].cognom = teclat.nextLine();
            System.out.print("Dni: ");
            alumnes[i].dni = teclat.nextLine();
            System.out.print("Talla: ");
            alumnes[i].talla = teclat.nextInt();
            System.out.print("Pes: ");
            alumnes[i].pes = teclat.nextDouble();
            teclat.nextLine();
            System.out.println();
            //alumnes[i] = alumne;
        }

        System.out.println("Llistat d'alumnes\n");
        System.out.printf("%-20s %-20s %-10s %5s %6s\n",
                "Nom", "Cognom", "Dni", "Talla", "Pes");
        for (int i = 0; i < alumnes.length; i++) {
            System.out.printf("%-20s %-20s %-10s %5d %6.2f\n",
                    alumnes[i].nom, alumnes[i].cognom, alumnes[i].dni,
                    alumnes[i].talla, alumnes[i].pes);
        }
        Persona pp = new Persona();
        for (int i = 0; i < alumnes.length; i++) {
            pp = alumnes[i];
            System.out.printf("%-20s %-20s %-10s %5d %6.2f\n",
                    pp.nom, pp.cognom, pp.dni,
                    pp.talla, pp.pes);
        }
    }

}
