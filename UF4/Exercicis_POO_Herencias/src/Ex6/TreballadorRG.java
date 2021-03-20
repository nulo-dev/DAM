/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

/**
 *
 * @author nmartinez
 */
public abstract class TreballadorRG extends Personal{

    double souMesConveni;
    
    public TreballadorRG(double souMesConveni,String dni, String nom) {
        super(dni, nom);
        this.souMesConveni=souMesConveni;
    }  

    public double getSouMesConveni() {
        return souMesConveni;
    }

    public void setSouMesConveni(double souMesConveni) {
        this.souMesConveni = souMesConveni;
    }

    @Override
    public String toString() {
        return "TreballadorRG{"+super.toString() + "souMesConveni=" + souMesConveni + '}';
    }
    
    
}
