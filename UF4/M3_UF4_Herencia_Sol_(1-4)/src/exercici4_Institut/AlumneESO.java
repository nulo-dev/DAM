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
public class AlumneESO extends Alumne {

    public AlumneESO(String nom, String dni, String curs) {
        super(nom, dni, curs);

    }

    @Override
    public boolean passarCurs() {
        boolean aux = true;
        if(this.getNota3() < 5) aux = false;
        return aux;
    }

    @Override
    public String toString() {
        return "AlumneESO{" + super.toString() + '}';
    }
    
}
