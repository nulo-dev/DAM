/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Empresa {
    String nom;
    ArrayList<Personal> per;

    public Empresa(String nom) {
        this.nom = nom;
        per = new ArrayList<>();
    }
    
    public void afegirPersonal(Personal p){
        per.add(p);
    }
    
    public void eliminarPersonal(Personal p){
        per.remove(p);
    }
    
    public double calculDespesaMes(){
        
        double resultado = 0;
            
        for (Personal personal : per) {
            resultado += personal.calculSou();
        }
        
        return resultado;
    }
    
}
