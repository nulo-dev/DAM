/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1uf4.nilmartinez;


/**
 *
 * @author nmartinez
 */
public class AlumnesBecats extends Alumnes{
    
    String tipusbeca;
    
    public AlumnesBecats(String dni, String nom, String cognom, String tipusbeca) {
        super(dni, nom, cognom);
        this.tipusbeca = tipusbeca;
    }

    public String getTipusbeca() {
        return tipusbeca;
    }

    public void setTipusbeca(String tipusbeca) {
        this.tipusbeca = tipusbeca;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("\t│Beca: %-68s %s",tipusbeca,"│");
        System.out.println("");
//        return "AlumnesBecats{"+super.toString() + "tipusbeca=" + tipusbeca + '}';
    }
    
    
    
}
