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
public class Electrodomestic {
    private static final double MARGE = 1.2;
    
    private String marca;
    private double consum;
    private double pes;
    protected double preuCompra;
    
    Electrodomestic(String marca, double consum, double pes, double preuCompra){
        this.marca = marca;
        this.consum = consum;
        this.pes = pes;
        this.preuCompra = preuCompra;        
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

    public double getPreuCompra() {
        return preuCompra;
    }

    public void setPreuCompra(double preuCompra) {
        this.preuCompra = preuCompra;
    }
    
    public double preuVenta (){
        return preuCompra * this.MARGE;
    }
    
    public String dades(){
        return "Marca: "+ marca+ " Consum: " + consum + " Pes: " + pes + " Preu Compra:" +
                preuCompra + " Preu Venta: "+ this.preuVenta();
    }
    
}
