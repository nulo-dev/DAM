/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici4_Institut;

/**
 *
 * @author Alfredo
 */
public class Professor extends Persona{
    private String numCompte;

    public Professor(String numCompte, String nom, String dni, String curs) {
        super(nom, dni, curs);
        this.numCompte = numCompte;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + "numCompte=" + numCompte + '}';
    }
    
    public void posarNotes(Alumne a1, double nota1, double nota2, double nota3) {
        a1.setNota1(nota1);
        a1.setNota2(nota2);
        a1.setNota3(nota3);
    }

    public void posarNota1r(Alumne a1, double nota1) {
        a1.setNota1(nota1);
    }
    public void posarNota2r(Alumne a2, double nota2) {
        a2.setNota1(nota2);
    }
    public void posarNota3r(Alumne a3, double nota3) {
        a3.setNota1(nota3);
    }
    
}
