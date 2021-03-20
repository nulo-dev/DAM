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
public class TrebjornComp extends TreballadorRG{
    
    public TrebjornComp(double souMesConveni, String dni, String nom) {
        super(souMesConveni, dni, nom);
    }
    
    @Override
    double calculSou() {
        
        return this.souMesConveni;
        
    }
    
}
