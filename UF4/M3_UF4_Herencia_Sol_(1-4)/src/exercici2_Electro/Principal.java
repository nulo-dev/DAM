/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2_Electro;

/**
 *
 * @author alfredo
 */
public class Principal {
    public static void main(String[] args) {

        Tenda tenda = new Tenda("ElectroVenta");
        Electrodomestic elec = new Electrodomestic("Forn Fagor", 100, 100, 100);
        tenda.afegir(elec);
        Rentadora rent = new Rentadora("Rentaplus", 100, 100, 100, 6);
        tenda.afegir(rent);
        elec = new Televisio("TeleFagor", 200, 200, 200, 50);
        tenda.afegir(elec);
        elec = new TeleTDT("TeleTDT", 300, 300, 300, 30, 40);
        tenda.afegir(elec);
        elec = new Rentadora("Fagor", 400, 400, 400, 6);
        tenda.afegir(elec);
        Rentadora ren = new Rentadora("Fagor", 100, 100, 100, 6);
        tenda.afegir(rent);
        System.out.println();
        tenda.llistat();
        System.out.println("Total Compra :" + tenda.totalCompra());
        System.out.println("Total Tenda  :" + tenda.totalVenda());
//        
//        tenda.llistatAmbClass();
//        tenda.llistaEspecial();
    }
}
