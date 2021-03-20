/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vol vol1 = new Vol();
        Passatger pas = new Passatger();
        Agent ag = new Agent();
        vol1.setDesti("Barcelona");
        vol1.setOrigen("Madrid");
        vol1.setVolid("AF-1934");
        
        pas.setDNI("43827812D");
        pas.setNom("Nil");
        
        ag.setDni("43024229L");
        ag.setNom("Pedro");
        ag.setVol(pas, vol1);
        
        pas.mostrar();
    }
    
}
