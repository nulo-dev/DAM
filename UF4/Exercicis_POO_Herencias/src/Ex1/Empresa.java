/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Empresa {
    
    String nom;
    String nif;
    
    ArrayList<Treballador> treballadors;
    ArrayList<Client> clients;

    public Empresa(String nom, String nif) {
        this.nom = nom;
        this.nif = nif;
        this.treballadors = new ArrayList<Treballador>();
        this.clients = new ArrayList<Client>();
    }
    public Empresa(){
        
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public String getnom(){
        return this.nom;
    }
    public void setnif(String nif){
        this.nif=nif;
    }
    public String getnif(){
        return this.nif;
    }
    public void setSou(String nom, double sou){
        for (int i = 0; i < treballadors.size(); i++) {
            if (treballadors.get(i).getnom().equals(nom)) {
                treballadors.get(i).setsou(sou);
                i=treballadors.size();
            }
        } 
    }
    public void agregartreballador(Treballador tre){
        treballadors.add(tre);
    }
    public void agregarclient(Client cli){
        clients.add(cli);
    }
    public int buscarTreballador(String nom){
        int aux = -1;
        for (int i = 0; i < treballadors.size(); i++) {
            if (treballadors.get(i).getnom().equals(nom)) {
                aux=i;
                i=treballadors.size();
            }
        }
        return aux;
    }
    public void mostrarTreballador(String nom){
        int aux = buscarTreballador(nom);
        if (aux!=-1) {
            System.out.println(treballadors.get(aux).toString());
        } else {
            System.out.println("Treballador no trovat");
        }
    
    }
    @Override
    public String toString() {
        return "Empresa{" + "nom=" + nom + ", nif=" + nif + ", treballadors=" + treballadors + ", clients=" + clients + '}';
    }


    
    
}
