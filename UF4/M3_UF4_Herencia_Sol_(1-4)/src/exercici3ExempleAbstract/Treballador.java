/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3ExempleAbstract;

/**
 *
 * @author Alfredo
 */
public class Treballador extends Persona{
    
    /**sou del treballador*/
    private float sou; 

    public Treballador(float sou, String nom, String dni, String adreca) {
        super(nom, dni, adreca);
        this.sou = sou;
    }

    public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Treballador{" + super.toString() + "sou=" + sou + '}';
    }
    
    
}
