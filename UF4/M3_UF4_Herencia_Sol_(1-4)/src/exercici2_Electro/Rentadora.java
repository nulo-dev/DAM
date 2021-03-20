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
public class Rentadora extends Electrodomestic {

    private static final double MARGE = 1.3;
    private int carrega;

   
    Rentadora(String marca, double consum, double pes, double preuCompra, int carrega) {
        super(marca, consum, pes, preuCompra);
        this.carrega = carrega;
    }

    public int getCarrega() {
        return carrega;
    }

    public void setCarrega(int carrega) {
        this.carrega = carrega;
    }

//    @Override
//    public double preuVenta() {
//        if(carrega>5){
//            return preuCompra* MARGE;
//        } else{
//            
//        return super.preuVenta(); 
//        }
//        
//    }

    @Override
    public double preuVenta() {
        if (carrega > 5) {
            return preuCompra * this.MARGE;
        } else {
            return super.preuVenta();
        }
//        return (carrega >5) ? preuCompra * Rentadora.MARGE : super.preuVenta();
    }

    @Override
    public String dades() {
        return super.dades() + " Carrega:" + carrega;
    }

}
