/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nmartinez
 */
public class M_Categoria {
    String nom;

    public M_Categoria(String nom) {
        this.nom = nom;
    }

    public M_Categoria(){
        
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
