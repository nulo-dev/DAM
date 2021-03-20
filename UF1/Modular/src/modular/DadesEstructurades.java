/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;

/**
 *
 * @author alfredo
 */
class Person {

    String nom;
    String cognom;
    String dni;
    int talla;
    double pes;
}

public class DadesEstructurades {

    public static void printNotes(int an[]) {
        for (int i = 0; i < an.length; i++) {
            System.out.printf("%d ", an[i]);
        }
    }

    public static void printPerson(Person pe) {
        System.out.printf("Hola %s %s amb dni: %s. Pesas %.2f i la teva talla es la %d\n",
                pe.nom, pe.cognom, pe.dni, pe.pes, pe.talla);
    }

    public static void main(String[] args) {
        int notes[] = {10, 9, 9, 2, 3, 6, 7, 6};
        printNotes(notes);
        System.out.println("");

        Person pers = new Person();
        pers.nom = "Pepe";
        pers.cognom = "Ruiz";
        pers.dni = "12345678T";
        pers.talla = 40;
        pers.pes = 70.5;

        printPerson(pers);
        System.out.println("");

    }
}
