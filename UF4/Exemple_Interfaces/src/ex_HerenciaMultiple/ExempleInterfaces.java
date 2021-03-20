/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_HerenciaMultiple;

import java.util.ArrayList;

/**
 *
 * @author alfredo
 */
public class ExempleInterfaces {

    /**
     * @param args the command line arguments
     */
    
    public static int sumaAforament(ArrayList<I_InstEsportiva> aie){
        int suma =0;
        for (I_InstEsportiva ie: aie) {
            System.out.println(ie.dades());
            suma += ie.getAforament();            
        }
        return suma;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        EdificiOficines ed1 = new EdificiOficines (4, 2, 10);
        System.out.println(ed1.dades());
        CampFutbol cf1 = new CampFutbol("Camp de Futbol", 500, I_InstEsportiva.PD);
        System.out.println(cf1.dades());
        
        Poliesportiu pol1 = new Poliesportiu(3,1,"MultiSport", 100);
        System.out.println(pol1.dades());
        ArrayList<I_InstEsportiva> aie = new ArrayList<I_InstEsportiva>();
        aie.add(cf1);
        aie.add(pol1);
        System.out.println("--------------------");
        int aforo = sumaAforament (aie);
        System.out.printf("Total Aforament: %d\n", aforo);
        
        
               
    }
    
}
