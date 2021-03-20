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
public class EdificiOficines extends Edifici{
    int sales;
    
    public EdificiOficines(int plantes, int ascensors, int sales) {
        super(plantes, ascensors);
        this.sales = sales;
    }        
    
}
