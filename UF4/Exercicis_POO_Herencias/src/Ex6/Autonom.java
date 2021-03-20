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
public class Autonom extends Personal{

    double preuHora;
    int horesMes;
    
    public Autonom(double preuHora,int horesMes,String dni, String nom) {
        super(dni, nom);
        this.preuHora = preuHora;
        this.horesMes = horesMes;
    }

    @Override
    double calculSou() {
        
        double sou = this.preuHora*(this.horesMes*30);
        return sou;
        
    }
    
}
