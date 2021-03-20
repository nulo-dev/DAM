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
public class Televisor extends Electrodomestic{
    
    int polsades;
    String tipos;

    public Televisor() {
    }

    public Televisor(int polsades, String tipos, String marca, double consum, double pes, double preucompra, double preuvenda) {
        super(marca, consum, pes, preucompra, preuvenda);
        this.polsades = polsades;
        this.tipos = tipos;
    }

    public int getPolsades() {
        return polsades;
    }

    public void setPolsades(int polsades) {
        this.polsades = polsades;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "\nTelevisor{" +super.toString() + " polsades=" + polsades + ", tipos=" + tipos + '}';
    }
    
    
    
}
