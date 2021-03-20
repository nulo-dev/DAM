/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

/**
 *
 * @author nmartinez
 */
public class DustSensor implements I_Dispositiu{

    double contaminacio;
    boolean actiu;

    public DustSensor(double contaminacio, boolean actiu) {
        this.contaminacio = contaminacio;
        this.actiu = actiu;
    }

    
    @Override
    public void Activar() {
        this.actiu = true;
    }

    @Override
    public double Valor() {
        return this.contaminacio;
    }

    @Override
    public void Desactivar() {
        this.actiu = false;
    }

    @Override
    public boolean isActiu() {
        return actiu;
    }

    @Override
    public String dades() {
        return "DustSensor{" + "contaminacio=" + contaminacio + ", actiu=" + actiu + '}';
    }
    
}
