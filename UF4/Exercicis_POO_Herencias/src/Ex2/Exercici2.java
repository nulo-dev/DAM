/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;



/**
 *
 * @author nmartinez
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Electrodomestic ele = new Electrodomestic();
        Electrodomestic rent = new Rentadora(32,"BASH",2,4,400,400);
        Electrodomestic tel = new Televisor(30,"TDT","Samsung",20,30,200,200);
        
        ele.setElec(rent);
        ele.setElec(tel);
        
        System.out.println(ele.toString());
    }
    
}
