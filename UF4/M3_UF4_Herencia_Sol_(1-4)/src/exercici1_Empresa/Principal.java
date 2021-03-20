/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1_Empresa;

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

        Treballador tr1 = new Treballador(22, "carlos", "ff", "tt");
        Treballador tr2 = new Treballador(33, "anna", "f2", "tt");
        
        Client cl1 = new Client("Cli1", "dni1", "adre1", "compte 1");
        Client cl2 = new Client("Cli2", "dni2", "adre2", "compte 2");
        
        Empresa emp = new Empresa("nova", "123e");
        emp.afegir(tr2);
        emp.afegir(tr1);
        emp.afegir(cl1);
        emp.afegir(cl2);

        Treballador tr = emp.getTreballador("ff");
        if (tr == null) {
            System.out.println("No Existeix");
        } else {
            System.out.println(tr.dades());
        }
        
        emp.assignarSou("ff", 100);
        emp.getClient("dni1").incrementaTotalGastat(123);
        emp.dades();

    }
}
