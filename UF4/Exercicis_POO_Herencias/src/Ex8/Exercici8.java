/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

import Ex6.*;
import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */


public class Exercici8 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<I_Dispositiu> lista = new ArrayList<>();
        TempSensor temp = new TempSensor(20, true);
        TempSensor temp2 = new TempSensor(25, false);
        DustSensor dust = new DustSensor(15, true);
        VoltSensor volt = new VoltSensor(130, true);
        
        lista.add(temp);
        lista.add(temp2);
        lista.add(dust);
        lista.add(volt);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).dades());
            System.out.println("");
        }
    }
    
    
}
