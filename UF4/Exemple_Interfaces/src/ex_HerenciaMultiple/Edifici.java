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
public class Edifici {
    int plantes;
    int ascensors;
    
    Edifici (int plantes, int ascensors){
        this.plantes = plantes;
        this.ascensors = ascensors;
    }
    
    public String dades(){
        return String.format("Edifici{plantes:%d, ascensors:%d}", plantes, ascensors);
    }
}
