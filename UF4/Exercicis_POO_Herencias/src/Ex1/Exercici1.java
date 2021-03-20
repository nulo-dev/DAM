/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author nmartinez
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Treballador tre1 = new Treballador(); 
       Treballador tre2 = new Treballador(5300,"4837278F","Nil",1989);
       Client cli1 = new Client();
       Client cli2 = new Client("C/Cantabria","49207882W","Juan",2000);
       Empresa emp = new Empresa("Soluciones IHT","493827IHT");
       tre1.setnom("Pedro");
       tre1.setdni("49323747L");
       tre1.setsou(2300);
       tre1.setnaixement(1999);
       cli1.setnom("Laura");
       cli1.setdni("83847857H");
       cli1.setnaixement(2001);
       cli1.setcarrer("C/Barcelona");
       
       emp.agregarclient(cli2);
       emp.agregarclient(cli1);
       emp.agregartreballador(tre2);
       emp.agregartreballador(tre1);
       System.out.println(emp.toString());
       System.out.println("");
       emp.mostrarTreballador("Pedro");
       emp.setSou("Pedro", 10);
       emp.mostrarTreballador("Pedro");
    }
    
}
