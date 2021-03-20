/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_HerenciaMultiple;

/**
 *
 * @author alfredo
 */
public class Poliesportiu extends Edifici implements I_InstEsportiva {

    String tipus;
    int aforament;

    public Poliesportiu(int plantes, int ascensors, String tipus, int aforament) {
        super(plantes, ascensors);
        this.tipus = tipus;
        this.aforament = aforament;
    }

    public String getTipus() {
        return tipus;
    }

    public int getAforament() {
        return aforament;
    }
    
    public String dades(){
        return super.dades() + String.format("{IID: %s, aforament: %d}",  tipus, aforament);
    }

}
