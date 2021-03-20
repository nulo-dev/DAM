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
public class Principal {
    public static void main(String[] args) {
        Institut ins = new Institut("Vallbona");
        ins.afegirProfessor("12341234", "Prof1", "1234", "1er");
        ins.afegirAlumneESO("eso1", "1111", "1er");
        ins.afegirAlumneESO("eso2", "2222", "2on");
        System.out.println(ins.toString());
        
    }
}
