/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

/**
 *
 * @author nmartinez
 */
public abstract class Cotxe {
    double preu;
    int cilindrada;
    int places;
    boolean venut;

    public Cotxe(double preu, int cilindrada, int places, boolean venut) {
        this.preu = preu;
        this.cilindrada = cilindrada;
        this.places = places;
        this.venut = venut;
    }
    
    abstract double calcularPreu(double venta);

    @Override
    public String toString() {
        return "Cotxe{" + "preu=" + preu + ", cilindrada=" + cilindrada + ", places=" + places + ", venut=" + venut + '}';
    }
    
}
