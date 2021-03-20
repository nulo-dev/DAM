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
public class CampFutbol extends InstEsportiva {
    int categoria;
    public CampFutbol(String tipus, int aforament, int categoria) {
        super(tipus, aforament);
        this.categoria = categoria;
    }

    
}
