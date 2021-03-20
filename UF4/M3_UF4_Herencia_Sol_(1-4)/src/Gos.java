/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class Gos extends Mamifer {

    private String raça;

    public Gos(String nom, int edat, int tempsGes, String raça) {
        super(nom, edat, tempsGes);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "Gos{" + super.toString() + "raça=" + raça + '}';
    }
}
