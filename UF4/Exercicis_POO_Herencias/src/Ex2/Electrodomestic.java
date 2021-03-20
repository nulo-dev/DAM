/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Electrodomestic {
    
    final double increment = 1.20;
    final double increment2 = 1.30;
    String marca;
    double consum;
    double pes;
    double preucompra;
    double preuventa;
    ArrayList<Electrodomestic> elec;

    public Electrodomestic(){
        elec = new ArrayList<>();
    }

    public Electrodomestic(String marca, double consum, double pes, double preucompra, double preuvenda) {
        this.marca = marca;
        this.consum = consum;
        this.pes = pes;
        this.preucompra = preucompra;
        this.preuventa = preuvenda;
        elec = new ArrayList<>();
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getPreucompra() {
        return preucompra;
    }

    public void setPreucompra(double preucompra) {
        this.preucompra = preucompra;
    }

    public double getPreuventa() {
        return preuventa;
    }

    public void setPreuventa(double preuventa) {
        this.preuventa = preuventa;
    }

    public ArrayList<Electrodomestic> getElec() {
        return elec;
    }

    public void setElec(Electrodomestic elec) {
         this.elec.add(elec);
    }
    
    @Override
    public String toString() {
        return "Electrodomestic{" + "increment=" + increment + ", marca=" + marca + ", consum=" + consum + ", pes=" + pes + ", preucompra=" + preucompra + ", preuventa=" + preuventa + ", elec=" + elec + '}';
    }
    
    
}
    