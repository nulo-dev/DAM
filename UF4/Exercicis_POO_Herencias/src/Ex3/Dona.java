/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author nmartinez
 */
public class Dona extends Client{
    
    int mult = 1000;



    public Dona(String dni, String nom, String any_naixement, int edat, double alçada, double pes) {
        super(dni, nom, any_naixement, edat, alçada, pes);
    }
    
    @Override
    public double Calorias() {
       return pes*alçada*mult;
    }
}
