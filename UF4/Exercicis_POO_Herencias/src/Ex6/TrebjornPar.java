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
public class TrebjornPar extends TreballadorRG{

    int horesSet;
    
    public TrebjornPar(int horesSet,double souMesConveni, String dni, String nom) {
        super(souMesConveni, dni, nom);
        this.horesSet=horesSet;
    }
    
    @Override
    double calculSou() {
        double preciohora = (this.souMesConveni/30)/24;
        double resultado = (preciohora*this.getHoresSet())*30; // 4.3 son las semanas que trabaja
        return resultado;
    }

    public int getHoresSet() {
        return horesSet;
    }

    public void setHoresSet(int horesSet) {
        this.horesSet = horesSet;
    }

    @Override
    public String toString() {
        return "TrebjornPar{"+super.toString() + "horesSet=" + horesSet + '}';
    }
    
    
    
}
