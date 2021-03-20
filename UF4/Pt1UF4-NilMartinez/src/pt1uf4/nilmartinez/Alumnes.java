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
public class Alumnes extends Persona{ 
    
    ArrayList<Assignaturas> listasigmatr;
    
    public Alumnes(String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        listasigmatr = new ArrayList<>();
    }

    public ArrayList<Assignaturas> getListasigmatr() {
        return listasigmatr;
    }

    public void setListasigmatr(Assignaturas listasigmatr) {
        this.listasigmatr.add(listasigmatr);
    }

    
    public void titol(){
        
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("\n\t│Assignatures matriculades: %-47s %s",listasigmatr.toString(),"│");
        System.out.println("");
//        return super.toString() + "Assignatures matriculades: " + listasigmatr.toString();
    }
    
    
    
}
