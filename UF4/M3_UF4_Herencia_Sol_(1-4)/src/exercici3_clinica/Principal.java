/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3_clinica;

import java.util.ArrayList;

/**
 *
 * @author bernat
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Consulta c = new Consulta("Dr x");
        Pacient h1 = new Home("Pere", 2.3, 4.5, 7);
        Home h2 = new Home("Albert", 6.3, 8.5, 19);
        Dona d = new Dona("Anna", 2.3, 4.5, 88);
        c.donarAltaPacient(d);
        c.donarAltaPacient(h1);
        c.donarAltaPacient(h2);

        System.out.println(h2.metodeHome());

        System.out.println("Numero pacients: " + c.numPacientActuals());
        System.out.println("Majors 65: " + c.majors65());
        System.out.println("Dades Pere: " + c.dadesPacient("Pere"));
        System.out.println("Baixa Pere");
        c.donarBaixaPacient("Pere");
        System.out.println("Dades Pere: " + c.dadesPacient("Pere"));

        System.out.println("Numero pacients: " + c.numPacientActuals());

        System.out.println("Calories Pere: " + c.numCaloriesPacient("Pere"));
        System.out.println("Calories Anna: " + c.numCaloriesPacient("Anna"));

        System.out.println("Alta Pere i Maria");
        h2 = new Home("Pere", 6.3, 8.5, 29);
        d = new Dona("Maria", 2.3, 4.5, 28);
        c.donarAltaPacient(d);
        c.donarAltaPacient(h2);
        System.out.println("Dades Pere: " + c.dadesPacient("Pere"));

        System.out.println("Majors 65: " + c.majors65());
        System.out.println("Numero pacients: " + c.numPacientActuals());

        c.llistador();

    }
}
