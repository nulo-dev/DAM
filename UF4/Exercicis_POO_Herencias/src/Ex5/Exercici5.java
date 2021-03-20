/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

import Ex3.*;


/**
 *
 * @author nmartinez
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Concessionario cons = new Concessionario("CONCESSIONARIO");
       
        cons.afegirAudi(12500, 1100, 5, true, true, 15000);
        cons.afegirAudi(11500, 1000, 4, false, true, 13000);
        cons.afegirSkoda(5500, 1050, 6, true, true, true, 7000);
        cons.afegirSkoda(5400, 1050, 7, true, false, true, 7000);
        cons.afegirSkoda(5300, 1050, 7, true, false, false, 7000);
        cons.afegirVolkswagen(9000, 1900, 7, true, 11000);
        cons.afegirVolkswagen(7000, 1900, 3, true, 9000);
        
        System.out.println(cons.toString());
        System.out.println("Num cotxes venuts: ");
        cons.numcotxvenuts();
        System.out.println("Info cotxes venuts: ");
        cons.infocotxvenuts();
        System.out.println("Gast cotxes venuts: ");
        cons.gastcotxvenuts();
        System.out.println("Num audis venuts: ");
        System.out.println(cons.numAudisvenuts());
        System.out.println("Num skodas venuts: ");
        System.out.println(cons.numSkodavenuts());
    }
}
