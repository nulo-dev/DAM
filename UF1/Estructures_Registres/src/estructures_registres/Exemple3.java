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
public class Exemple3 {
     public static void main(String[] args) {

         Registre reg = new Registre();
         reg.uno = 4;
         reg.dos = 33;
         reg.tres = "Hola";
         
         System.out.printf("%d %d %s|\n", reg.uno,reg.dos,reg.tres);
         
     }
}
