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
public class Audi extends Cotxe{
    boolean superSport;
    double venta;
    
    public Audi(double preu, int cilindrada, int places, boolean venut) {
        super(preu, cilindrada, places, venut);
    }

    @Override
    public double calcularPreu(double venta) {
        if (this.cilindrada<1800) {
            venta=venta*(1-10/100);
            return venta;
        } else {
            return venta;
        }
    }

    @Override
    public String toString() {
        return "\nAudi{"+super.toString() + "superSport=" + superSport + ", venta=" + venta + '}';
    }


    public void setVenta(double venta){
        
        venta = calcularPreu(venta);
        this.venta=venta;
    }
    
    public double getVenta(){
        return this.venta;
    }
    
    public boolean isSuperSport() {
        return superSport;
    }

    public void setSuperSport(boolean superSport) {
        this.superSport = superSport;
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
