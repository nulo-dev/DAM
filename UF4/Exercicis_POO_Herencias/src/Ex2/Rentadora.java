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
public class Rentadora extends Electrodomestic{

    final double increment2 = 1.30;
    double carrega;

    public Rentadora() {
    }

    public Rentadora(double carrega, String marca, double consum, double pes, double preucompra, double preuvenda) {
        super(marca, consum, pes, preucompra, preuvenda);
        this.carrega = carrega;
    }


    public double getCarrega() {
        return carrega;
    }

    public void setCarrega(double carrega) {
        this.carrega = carrega;
    }

    public double Calcularpreu(){
        if (carrega>5) {
            return this.preucompra*increment2;
        } else {
            return this.preucompra*increment;
        }
    }
    
    @Override
    public String toString() {
        return "\nRentadora{"+super.toString() + " carrega=" + carrega + '}';
    }


    
    
    
    
}
