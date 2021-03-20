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
public class TeleTDT extends Televisio {

    private double potencia;

    TeleTDT(String marca, double consum, double pes, double preuCompra, int polsades, double potencia) {
        super(marca, consum, pes, preuCompra, polsades);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
        public String dades() {
        return super.dades() + " Potència:" + potencia;
    }
}
