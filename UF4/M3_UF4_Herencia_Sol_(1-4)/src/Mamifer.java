/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class Mamifer extends Animal {

    private int tempsGestacio;

    public Mamifer(String nom, int edat, int tempGest) {
        super(nom, edat);
        this.tempsGestacio = tempGest;
    }

    public int getTempsGestacio() {
        return tempsGestacio;
    }

    public void setTempsGestacio(int tempsGestacio) {
        this.tempsGestacio = tempsGestacio;
    }

    @Override
    public String toString() {
        return "Mamifer{" + super.toString() + ", tempsGestacio=" + tempsGestacio + '}';
    }

    
 }
