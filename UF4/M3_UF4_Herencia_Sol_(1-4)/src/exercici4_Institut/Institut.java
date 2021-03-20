/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici4_Institut;

import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class Institut {
    private String nom;
    private ArrayList<Professor> llistatP;
    private ArrayList<Alumne> llistatA;
    
    
    public Institut(String nom) {
        this.nom = nom;
        this.setLlistatP(new ArrayList<Professor>());
        this.setLlistatA(new ArrayList<Alumne>());
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Professor> getLlistatP() {
        return llistatP;
    }

    public void setLlistatP(ArrayList<Professor> llistatP) {
        this.llistatP = llistatP;
    }

    public ArrayList<Alumne> getLlistatA() {
        return llistatA;
    }

    public void setLlistatA(ArrayList<Alumne> llistatA) {
        this.llistatA = llistatA;
    }

    public void afegirAlumneESO(String nom, String dni, String curs) {
        AlumneESO al = new AlumneESO(nom, dni, curs);
        this.llistatA.add(al);
    }
    public void afegirAlumneBatx(String nom, String dni, String curs) {
        AlumneBatx al = new AlumneBatx(nom, dni, curs);
        this.llistatA.add(al);
    }
    public void afegirProfessor(String numCompte, String nom, String dni, String curs) {
        Professor pr = new Professor(numCompte, nom, dni, curs);
        this.llistatP.add(pr);
    }
    public void baixaAlumne(String dni) {
        Alumne al = cercarAlumne(dni);
        if (al != null) {
            this.llistatA.remove(al);
        }
    }
    public void baixaProfessor(String dni) {
        Professor prof = cercarProf(dni);
        if (prof != null) {
            this.llistatP.remove(prof);
        }
    }
    
    public Alumne cercarAlumne(String dni) {
        
        Alumne alu = null;
        boolean trobat = false;
        int i = 0;
        while ((!trobat) && (i < this.getLlistatA().size())) {
            
            if (this.getLlistatA().get(i).getDni().equals(dni)) {
                alu = this.getLlistatA().get(i);
                trobat = true;
            }
            i++;
        }
        return alu;
    }
    public Professor cercarProf(String dni) {
        
        Professor prof = null;
        boolean trobat = false;
        int i = 0;
        while ((!trobat) && (i < this.getLlistatP().size())) {
            
            if (this.getLlistatA().get(i).getDni().equals(dni)) {
                prof = this.getLlistatP().get(i);
                trobat = true;
            }
            i++;
        }
        return prof;
    }
    
    

    public String infoAlumnes(String dni) {
        return this.llistatA.toString();
    }
    public String infoProfessors(String dni) {
        return this.llistatP.toString();
    }
    public void profPosarNotaAlum(String dniProf, String dniAlum, double nota) {
        Professor prof = cercarProf(dniProf);
        Alumne al = cercarAlumne(dniAlum);
        
        prof.posarNota1r(al, nota);
        
    }
    
    public int numAlumAprovats(String dni) {
        int cont = 0;
        for (Alumne al: this.llistatA) {
            if (al.passarCurs() == true) cont++;
        }
        return cont;
    }
        
    @Override
    public String toString() {
        return "Institut{" + "nom=" + nom + "\n llistatP=" + llistatP + "\n llistatA=" + llistatA + '}';
    }

    
    
}
