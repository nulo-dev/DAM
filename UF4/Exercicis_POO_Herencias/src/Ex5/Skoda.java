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
public class Skoda extends Cotxe{
 
    boolean consumMinim;
    boolean electric;
    double venta;
    public Skoda(double preu, int cilindrada, int places, boolean venut) {
        super(preu, cilindrada, places, venut);
    }

    @Override
    public double calcularPreu(double venta) {
        if (this.electric) {
            venta=venta*(1-20/100);
            return venta;
        } else {
            return venta;
        }
    }

    @Override
    public String toString() {
        return "\nSkoda{"+super.toString() + "consumMinim=" + consumMinim + ", electric=" + electric + ", venta=" + venta + '}';
    }

    public void setVenta(double venta){
        
        venta = calcularPreu(venta);
        this.venta=venta;
    }
    
    public double getVenta(){
        return this.venta;
    }
    
    public boolean isConsumMinim() {
        return consumMinim;
    }

    public void setConsumMinim(boolean consumMinim) {
        this.consumMinim = consumMinim;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electic) {
        this.electric = electic;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public boolean isVenut() {
        return venut;
    }

    public void setVenut(boolean venut) {
        this.venut = venut;
    }
    
    
}
