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
public abstract class Alumne extends Persona {

    protected String curs;
    protected double nota1;
    protected double nota2;
    protected double nota3;

    public Alumne(String nom, String dni, String curs) {
        super(nom, dni, curs);
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public abstract boolean passarCurs();

    @Override
    public String toString() {
        return "Alumne{" + super.toString() + "curs=" + curs + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    

}
