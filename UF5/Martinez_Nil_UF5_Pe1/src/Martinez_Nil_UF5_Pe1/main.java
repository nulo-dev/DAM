/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martinez_Nil_UF5_Pe1;

/**
 *
 * @author nmartinez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp = new Empresa("Grifols");
        Treballadors tr1 = new Treballadors("9019394Y", "Pedro Fernandez", "Administracion de redes sociales", 1400);
        Treballadors tr2 = new Treballadors("5837271U", "Juan Ramon", "Informatica", 2800);
        Treballadors tr3 = new Treballadors("2817738Y", "Joel Morera", "Marqueting", 1800);
        Treballadors tr4 = new Treballadors("4937271P", "Nil Martinez", "Informatica", 3200);
        Treballadors tr5 = new Treballadors("5837271U", "Lucas Hamilton", "UHC", 1900);
        
        emp.afegirTreballador(tr1);
        emp.afegirTreballador(tr2);
        emp.afegirTreballador(tr3);
        emp.afegirTreballador(tr4);
        emp.afegirTreballador(tr5);
        System.out.println("");
        emp.esborrarTreballador("2817738Y");
        emp.esborrarTreballador("90408945");
        System.out.println("");
        emp.mostrarTreballadors();
        System.out.println("");
        try {
            emp.augmentarSou("9019394Y", 2500);
            emp.augmentarSou("4937271P", 3500);   
        } catch (ExceptionCatA eca) {
            System.out.println(eca);
        }
        System.out.println("");
        emp.mostrarTreballadors();
        System.out.println("");
        System.out.println("Emmagatzemant Treballadors");
        System.out.println("-------------------------");
        emp.emmagatzemarTreballadors();
        emp.esborrarTreballador("9019394Y");
        emp.esborrarTreballador("4937271P");
        emp.mostrarTreballadors();
        System.out.println("");
        System.out.println("Recuperant Treballadors");
        emp.recuperarTreballadors();
        emp.mostrarTreballadors();
    }
    
}
