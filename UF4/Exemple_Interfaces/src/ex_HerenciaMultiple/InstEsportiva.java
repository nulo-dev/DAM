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
public class InstEsportiva implements I_InstEsportiva {
    String tipus;
    int aforament;

    public InstEsportiva(String tipus, int aforament) {
        this.tipus = tipus;
        this.aforament = aforament;
    }
    
    @Override
    public String getTipus(){
        return tipus;
    }

    @Override
    public int getAforament() {
        return aforament;
    }
  
    @Override
    public String dades(){
        return String.format("Esportiva{tipus:%s, aforament:%d}", tipus, aforament);
    }   
    
}
