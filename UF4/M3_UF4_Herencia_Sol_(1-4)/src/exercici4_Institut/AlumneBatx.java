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
public class AlumneBatx extends Alumne {

    //private ArrayList<Notes> notes;
    public AlumneBatx(String nom, String dni, String curs) {
        super(nom, dni, curs);

    }

    public boolean passarCurs() {
        boolean aux = true;
        if(((this.nota1 + this.nota2 + this.nota3)/3) < 5) aux = false;
        return aux;
    }

    @Override
    public String toString() {
        return "AlumneBatx{" + super.toString() + '}';
    }
    
}
