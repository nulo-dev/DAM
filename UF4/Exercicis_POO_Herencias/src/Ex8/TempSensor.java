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
public class TempSensor implements I_Dispositiu{

    double temperatura;
    boolean actiu;

    public TempSensor(double temperatura, boolean actiu) {
        this.temperatura = temperatura;
        this.actiu = actiu;
    }   
    
    @Override
    public void Activar() {
        this.actiu = true;
    }

    @Override
    public double Valor() {
        return this.temperatura;
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
        return "TempSensor{" + "temperatura=" + temperatura + ", actiu=" + actiu + '}';
    }
    
}
