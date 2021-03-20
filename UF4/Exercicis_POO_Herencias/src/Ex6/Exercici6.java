/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

/**
 *
 * @author nmartinez
 */


//Una empresa vol calcular la despesa que té de personal. El personal es pot dividir en personal 
//amb jornada completa, personal a temps parcial i autònoms. Crea les classes i els atributs adients 
//perquè des de un "main" es pugui aconseguir la despesa de personal d'un mes qualsevol.
public class Exercici6 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Empresa emp = new Empresa("INFOJOBS");
        Personal trecom = new TrebjornComp(1500, "593828F", "Pedro");
        Personal trebpar = new TrebjornPar(12, 1700, "6948832J", "Laura");
        Personal auton = new Autonom(3, 11, "2919394I", "Maria"); 
            
        System.out.println(trecom.calculSou());
        System.out.println(trebpar.calculSou());
        System.out.println(auton.calculSou());
        emp.afegirPersonal(auton);
        emp.afegirPersonal(trecom);
        System.out.println("");
        emp.afegirPersonal(trebpar);
        System.out.println("Despesa Mes Empresa");
        System.out.println(emp.calculDespesaMes());

    }
    
    
}
