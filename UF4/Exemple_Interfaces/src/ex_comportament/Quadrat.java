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
public class Quadrat extends Figura {
    double costat;
    Quadrat (double costat){
        this.costat = costat;
    }
    
    @Override
    public double perimetre (){
        return costat*4;
    }
    
    @Override
    public double area(){
        return Math.pow(costat, 2);
    }
}
