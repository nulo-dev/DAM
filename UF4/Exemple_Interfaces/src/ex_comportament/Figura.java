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
public abstract class Figura implements I_Moure {

    int posX = 0;
    int posY = 0;

    public abstract double area();

    public abstract double perimetre();

    @Override
    public void mou(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    @Override
    public String showPosicio() {
        return String.format("Posicio: %d %d", posX, posY);
    }
}
