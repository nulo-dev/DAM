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
public class VoltSensor implements I_Dispositiu{
    
    double voltatge;
    boolean actiu;

    public VoltSensor(double voltatge, boolean actiu) {
        this.voltatge = voltatge;
        this.actiu = actiu;
    }
    
    @Override
    public void Activar() {
        this.actiu = true;
    }

    @Override
    public double Valor() {
        return this.voltatge;
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
        return "VoltSensor{" + "voltatge=" + voltatge + ", actiu=" + actiu + '}';
    }
    
}
