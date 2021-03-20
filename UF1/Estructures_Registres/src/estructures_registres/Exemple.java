/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructures_registres;


/**
 *
 * @author alfredo
 */
public class Exemple {

    public static void main(String[] args) {
       Persona pers = new Persona();

        pers.nom = "Pepe";
        pers.cognom = "Ruiz";
        pers.dni = "12345678T";
        pers.talla = 40;
        pers.pes = 70.5;

        System.out.printf("Hola %s %s amb dni: %s. Pesas %.2f i la teva talla es la %d\n",
                pers.nom, pers.cognom, pers.dni, pers.pes, pers.talla);

    }
}
