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
public interface I_InstEsportiva {
    // Els atributs son sempre static final
    int PD = 1;
    int SD = 2;
    
    public String getTipus();

    public int getAforament();
        
    public String dades();

}
