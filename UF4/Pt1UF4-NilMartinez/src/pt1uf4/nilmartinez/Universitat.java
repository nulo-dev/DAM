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
public class Universitat {
 
    String nom;
    ArrayList<Persona> llistapersonas;
    ArrayList<Assignaturas> llistAssignatures;

    public Universitat(String nom) {
        this.nom = nom;
        this.llistapersonas = new ArrayList<>();
        this.llistAssignatures = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Persona> getLlista() {
        return llistapersonas;
    }

    public void setLlista(Persona p) {
        this.llistapersonas.add(p);
    }
    
    public void mostrarLlista(){
        System.out.println("\n\n");
        mostrarProfessors();
        mostrarAlumnes();
        System.out.println("\n\n\n\n\n");
    }
    
    public void separador(){
        System.out.println("\t├───────────────────────────────────────────────────────────────────────────┤");
    }
    public void separadorfinal(){
        System.out.println("\t└───────────────────────────────────────────────────────────────────────────┘");
    }
    public void mostrarProfessors(){
        System.out.println("\t┌─────────────────────────────── PROFESSORS ────────────────────────────────┐");
        separador();
        for (Persona p : llistapersonas) {
            if (p instanceof Professor) {
                System.out.printf("\t│ %-73s %s",(((Professor) p).nom+" "+((Professor) p).cognom),"│" );
                System.out.println("");
            }
        }
        separador();
        separadorfinal();
    }
    
    public void mostrarAlumnes(){
        System.out.println("\t┌──────────────────────────────── ALUMNES ──────────────────────────────────┐");
        separador();
        for (Persona p : llistapersonas) {
            if (p instanceof Alumnes) {
                System.out.printf("\t│ %-73s %s",(((Alumnes) p).nom+" "+((Alumnes) p).cognom),"│" );
                System.out.println("");
            }
        }
        separador();
        separadorfinal();
    }
    
    public void buscarPersona(String dni){
        boolean encontrado = false;
        System.out.println("\n\n");
        for (Persona p : llistapersonas) {
            if (p.dni.equals(dni)) {
                encontrado = true;
                if (p instanceof Alumnes) {
                    System.out.println("\t┌───────────────────────────────── ALUMNE ──────────────────────────────────┐");
                    separador();
                    p.mostrar();
                } else if (p instanceof Professor) {
                    System.out.println("\t┌─────────────────────────────── PROFESSOR ─────────────────────────────────┐");
                    separador();
                    p.mostrar();
                }
            }
        }
        if (!encontrado) {
            System.out.println("\u001B[31mNo s'ha trobat cap persona amb aquest DNI.\u001B[0m\n\n");
        } else {
            separador();
            separadorfinal();
            System.out.println("\n\n\n\n\n");   
        }
    }
    
    public void eliminarPersona(String dni){
        boolean encontrado = false;
        for (int i = 0; i < llistapersonas.size(); i++) {
            if (llistapersonas.get(i).dni.equals(dni)) {
                encontrado = true;
                System.out.println("\n"+llistapersonas.get(i).getNom()+" "+llistapersonas.get(i).getCognom()+" \u001B[32mse ha eliminar satisfactoriament.\u001B[0m\n");
                llistapersonas.remove(i);
            }
        }
        if (!encontrado) {
            System.out.println("\u001B[31mNo s'ha trobat cap persona amb aquest DNI.\u001B[0m\n\n");
        }
    }
    
    public void afegirAsignatures(Assignaturas a){
        this.llistAssignatures.add(a);
    }
    
    public void llistarAsignatures(){

        boolean profencont = false;
        boolean alumencont = false;
        for (int i = 0; i < llistAssignatures.size(); i++) {
            Assignaturas a = llistAssignatures.get(i);
            System.out.printf("\t┌────────────────────────────────── %s ────────────────────────────────────┐\n",a.nom);
            separador();
            for (int j = 0; j < llistapersonas.size(); j++) {
                Persona p = llistapersonas.get(j);
                if (p instanceof Professor) {
                   Professor prof = (Professor)p;
                    for (int k = 0; k <prof.listasigimp.size(); k++) {
                        if (a.nom.equals(prof.listasigimp.get(k).nom)) {
                            if (!profencont) {
                                profencont = true;
                                System.out.println("\t├─────────────────────────────── PROFESSORS ────────────────────────────────┤");  
                            }
                            System.out.printf("\t│%-74s %s\n",prof.getNom(),"│");
                        }
                    }
                }            
            }
            if (!profencont) {
                System.out.println("\t├─────────────────────────────── PROFESSORS ────────────────────────────────┤");  
                System.out.printf("\t│\u001B[31mNo te cap professor!\u001B[0m%56s\n","│");
            } else {
                profencont = false;
            }
            for (int j = 0; j < llistapersonas.size(); j++) {
                Persona p = llistapersonas.get(j);
                if (p instanceof Alumnes) {
                    Alumnes alum = (Alumnes) p;
                     for (int k = 0; k < alum.listasigmatr.size(); k++) {
                         if (a.nom.equals(alum.listasigmatr.get(k).nom)) {
                             if (!alumencont) {
                                 alumencont = true;
                                 System.out.println("\t├──────────────────────────────── ALUMNES ──────────────────────────────────┤");  
                             }
                             System.out.printf("\t│%-74s %s\n",alum.getNom(),"│");
                         }
                    }
                }
            }
            if (!alumencont) {
                System.out.println("\t├──────────────────────────────── ALUMNES ──────────────────────────────────┤"); 
                System.out.printf("\t│\u001B[31mNo te cap alumne!\u001B[0m%59s\n","│");
            } else {
                alumencont = false;
            }
           separadorfinal(); 
            System.out.println("\n\n");
        }
            
    }
    
}
