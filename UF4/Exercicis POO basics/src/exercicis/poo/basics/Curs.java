/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Curs {
    
    String curs;
    ArrayList<Estudiant> llista;

    
    public Curs(){
        llista = new ArrayList<>();
    }

    public Curs(String curs){
        this.curs = curs;
        llista = new ArrayList<>();
    }
    
    public void setCurs(String curs){
        this.curs = curs;
    }
    
    public String getCurs(){
        return this.curs;
    }
    
    public void setAlumne(Estudiant alumne){
        llista.add(alumne);
    }
    
    public int getAlumne(String alumne, String curso){
        int pos= -1;
        for (int i = 0; i < llista.size(); i++) {
            if (llista.get(i).getNom().equals(alumne)) {
                if (llista.get(i).getCurs().equals(curso)) {
                    pos = i;
                }
            }
        }
        return pos;
    }
    
    public void buscarAlumne(String alumne, String curso){
        int pos = getAlumne(alumne, curso);
        if (pos!=-1) {
            System.out.print("\nAlumne encontrado en la posicio: "+pos+"\n----------Info Alumne----------");
            llista.get(pos).mostrar(true);
        } else {
            System.out.println("Alumno no encontrado");
        }
        
    }
    
    public void eliminarAlumne(String alumne, String curso){
        int pos = getAlumne(alumne, curso);
        
        if (pos!=-1) {
            System.out.print("\nAlumno encontrado en la posicio: "+pos+"\n----------Eliminando Alumno----------");
            llista.remove(pos);
        } else {
            System.out.println("Alumno no encontrado");
        }
        
    }

    public void mostrar(){
        System.out.println("\n\n-----------Lista Alumnos-----------");
        for (int i = 0; i < llista.size(); i++) {
            llista.get(i).mostrar(true);
        }
    }

    
    
    
}
