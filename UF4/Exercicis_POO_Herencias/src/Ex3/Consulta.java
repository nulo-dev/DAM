/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Consulta {
    ArrayList<Client> clients = new ArrayList<>();
    
    public void alta(Client cli){
        clients.add(cli);
    }
    
    public void baixa(String dni){
        Scanner input = new Scanner(System.in);
        boolean enc = false;
        String res;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).dni.equals(dni)) {
                enc=true;
                System.out.println(clients.get(i).toString());
                System.out.println("¿Esta seguro que quiere dar debaja a este/a cliente/a?");
                res = input.nextLine();
                if (res.trim().toLowerCase().startsWith("s")) {
                    clients.remove(i);
                    System.out.println("Cliente dado de baja satisfactoriamente.");
                } else if (res.trim().toLowerCase().startsWith("n")) {
                    System.out.println("Ha cancelado la baja del cliente.");
                }
            }
        }
        if (!enc) {
            System.out.println("Cliente no encontrado.");
        }
    }

    public String nPacients(){
        return "Pacients: "+clients.size();
    }
    
    public void major65(){
        boolean enc = false;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).edat>=65) {
                clients.get(i).toString();
                enc = true;
            }
        }
        if (!enc) {
            System.out.println("No hay clientes mayores a 65");
        }
    }
    
    @Override
    public String toString() {
        return "Consulta{" + "clients=" + clients + '}';
    }
    
    
}
