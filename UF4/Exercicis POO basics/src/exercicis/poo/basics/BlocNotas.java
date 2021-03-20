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
public class BlocNotas {
    
    ArrayList<String> notas;

    public BlocNotas() {
        this.notas = new ArrayList<>();
    }
    
    public void setNota(String nota){
        this.notas.add(nota);
    }
    
    public ArrayList getNota(){
        return notas;
    }
    
    public void numNotas(){
        System.out.println("Q Notas: "+notas.size());
    }
    
    public void llistatNotas(){
        
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(i+1+": "+notas.get(i));
        }
        
    }
    
    
    
}
