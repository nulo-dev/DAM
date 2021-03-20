/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_comportament;

/**
 *
 * @author alfredo
 */
public class Cercle extends Figura {

    double radi;

    Cercle(double radi) {
        this.radi = radi;
    }

    @Override
    public double perimetre() {
        return 2* Math.PI *radi;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radi, 2);
    }


}
