/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;


/**
 *
 * @author nmartinez
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consulta co = new Consulta();
        Home hom = new Home("4837273F","Nil","2002",19,170,55);
        Dona don = new Dona("5943772J","Lucia","1998",22,150,45);
        
        co.alta(don);
        co.alta(hom);
        System.out.println(co.nPacients());
        co.major65();
        System.out.println(don.toString()+"\n");
        System.out.println("Calorias: " + don.Calorias());
        System.out.println(co.toString());
        System.out.println("");
        co.baixa("5943772J");
        System.out.println(co.toString());
    }
}
