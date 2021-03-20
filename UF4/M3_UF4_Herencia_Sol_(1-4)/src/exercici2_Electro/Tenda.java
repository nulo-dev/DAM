/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2_Electro;

import java.util.ArrayList;

/**
 *
 * @author alfredo
 */
public class Tenda {

    private String nom;
    private ArrayList<Electrodomestic> llista = new ArrayList<>();

    public Tenda(String nom) {
        this.nom = nom;
    }

    public void afegir(Electrodomestic aparell) {
        llista.add(aparell);
    }

    public double totalCompra() {
        double total = 0;
        for (int i = 0; i < llista.size(); i++) {
            total += llista.get(i).getPreuCompra();
        }
        return total;
    }

    public double totalVenda() {
        double total = 0;
        for (int i = 0; i < llista.size(); i++) {
            total += llista.get(i).preuVenta();
        }
        return total;
    }

    public void llistat() {
        System.out.println("Llista de: " + this.nom);
        for (int i = 0; i < llista.size(); i++) {
            Electrodomestic el = llista.get(i);
            System.out.println(el.dades());
        }
    }

    public void llistatAmbClass() {
        System.out.println("Llista de: " + this.nom);
        for (int i = 0; i < llista.size(); i++) {
            Electrodomestic el = llista.get(i);
            String classe = el.getClass().getSimpleName();
            System.out.println(classe + " " + el.dades());            
        }
    }

    public void llistaEspecial() {
        for (Electrodomestic el : llista) {
            System.out.println(el.dades());            
            if (el instanceof TeleTDT) {
                TeleTDT tdt = (TeleTDT) el; 
                System.out.println("Potencia:" + tdt.getPotencia());
            }
        }
    }
}
