/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1uf4.nilmartinez;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Professor extends Persona implements I_Docencia{
    
    int anyinici;
    ArrayList<Assignaturas> listasigimp;
    public Professor(String dni, String nom, String cognom, int anyinici) {
        super(dni, nom, cognom);
        this.anyinici = anyinici;
        listasigimp = new ArrayList<>();
    }

    public int getAnyinici() {
        return anyinici;
    }

    public void setAnyinici(int anyinici) {
        this.anyinici = anyinici;
    }

    @Override
    public void impartirAssignatura(Assignaturas listasigimp) {
        this.listasigimp.add(listasigimp);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("\n\t│Any inici: %-63s %s",anyinici,"│");
        System.out.printf("\n\t│Assignatures Imparteix: %-50s %s",listasigimp.toString(),"│"); 
        System.out.println("");
//        return "Professor{"+super.toString() + "anyinici=" + anyinici + ", listasigimp=" + listasigimp.toString() + '}';
    }
    
    
    
    
}
