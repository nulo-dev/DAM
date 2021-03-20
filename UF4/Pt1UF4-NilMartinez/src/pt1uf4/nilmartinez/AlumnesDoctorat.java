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
public class AlumnesDoctorat extends Alumnes implements I_Docencia{
    
    ArrayList<Assignaturas> listasigimp;
    String tutor;
    
    public AlumnesDoctorat(String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        listasigimp = new ArrayList<>();
    }

    public ArrayList<Assignaturas> getListasigimp() {
        return listasigimp;
    }

    @Override
    public void impartirAssignatura(Assignaturas listasigimp) {
        this.listasigimp.add(listasigimp);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("\t│Assignatures Imparteix: %-50s %s",listasigimp.toString(),"│");
        System.out.println("");
//        return "AlumnesDoctorat{"+super.toString() + "listasigimp=" + listasigimp.toString() + '}';
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
   
    
    
}
