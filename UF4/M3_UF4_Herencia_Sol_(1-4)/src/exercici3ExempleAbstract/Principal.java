/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3ExempleAbstract;

import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class Principal {

    public static void main(String[] args) {
//        Treballador tr1 = new Treballador(1000.0f, "Treb1", "11111111S", "C/asdf");
//        Treballador tr2 = new Treballador(1000.0f, "Treb2", "22222222D", "C/asdf");
//        Client cl1 = new Client(1000.0f, "Client1", "33333333F", "C/asdf");
//        Client cl2 = new Client(1000.0f, "Client2", "44444444G", "C/asdf");
//
        ArrayList<Persona> arr = new ArrayList<Persona>();
//        arr.add(tr1);
//        arr.add(tr2);
//        arr.add(cl1);
//        arr.add(cl2);
//        for(Persona p: arr) System.out.println(p);
//        System.out.println(tr1.toString());

        ClientNormal cn1 = new ClientNormal(1000.0f, "Client1", "33333333F", "C/asdf");
        ClientVIP cv1 = new ClientVIP(1000.0f, "Client2", "2341341", "C/asdf");
        ArrayList<Client> ac = new ArrayList<Client>();
        ac.add(cn1);
        ac.add(cv1);
        float compraTot = 0;
        for (Client c : ac) {
            compraTot = compraTot + c.importCompra(1000);
            System.out.println(c);
            System.out.println(c.importCompra(1000));
        }
        System.out.println("COMPRA TOTAL");
        System.out.println(compraTot);

    }
}
