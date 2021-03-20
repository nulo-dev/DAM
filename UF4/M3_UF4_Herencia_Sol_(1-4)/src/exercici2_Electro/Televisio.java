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
public class Televisio extends Electrodomestic {
    private static final double MARGE = 1.3;

    private int polsades;

    Televisio(String marca, double consum, double pes, double preuCompra, int polsades) {
        super(marca, consum, pes, preuCompra);
        this.polsades = polsades;
    }

    public int getPolsades() {
        return polsades;
    }

    public void setPolsades(int polsades) {
        this.polsades = polsades;
    }

    @Override
    public double preuVenta() {
        if (polsades > 40) {
            return preuCompra * this.MARGE;
        } else {
            return super.preuVenta();
        }
    }
    @Override
    public String dades() {
        return super.dades() + " Polsades:" + polsades;
    }
}
