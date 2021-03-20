/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1_Empresa;

import java.util.*;

public class Empresa {

    /**
     * nom de l'empresa
     */
    private String nom;
    /**
     * NIF de l'empresa
     */
    private String nif;
    /**
     * llista de treballadors de l'empresa
     */
    private ArrayList<Treballador> treballadors;

    /**
     * llista de clients de l'empresa
     */
    private ArrayList<Client> clients;

    public Empresa(String nom, String nif) {
        this.nom = nom;
        this.nif = nif;
        this.treballadors = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNIF() {
        return nif;
    }

    public void setNIF(String NIF) {
        this.nif = NIF;
    }

    /**
     * Retorna la posició del treballador a l'ArrayList donat el seu dni.
     *
     * @param dni del treballador a cercar
     * @return la posició o -1 si no hi és.
     */
    private int cercar(String dni) {
        int posicio = -1;
        boolean trobat = false;
        int i = 0;

        while ((trobat == false) && (i < treballadors.size())) {
            if (treballadors.get(i).getDni().equals(dni)) {
                trobat = true;
                posicio = i;
            }
            i++;
        }
        //System.out.println("Posicio " + posicio);
        return posicio;
    }

    /**
     * Retorna el treballador de l'empresa per cercant dni
     *
     * @param dni del treballador
     * @return el treballador o null si no el troba.
     */
    public Treballador getTreballador(String dni) {
        Treballador tr = null;
        int pos = this.cercar(dni);
        if (pos != -1) {
            tr = this.treballadors.get(pos);
        }
        return tr;

    }

    /**
     * Afegir un treballador al llistat passant un objecte treballador
     *
     * @param tr treballador a afegir.
     */
    public void afegir(Treballador tr) {

        this.treballadors.add(tr);
    }

    /**
     * Eliminar un treballador al llistat passant un objecte treballador
     *
     * @param tr treballador a eliminar que previament ha sigut cercat
     */
    public void eliminar(Treballador tr) {
        this.treballadors.remove(tr);
    }

    /**
     * eliminar un trebalaldor al llistat passant el seu dni
     *
     * @param dni del treballador a eliminar.
     */
    public void eliminar(String dni) {
        int pos = this.cercar(dni);
        if (pos != -1) {
            this.treballadors.remove(pos);
        }
    }

    /**
     * mètode que retorna el número de treballadors de l'empresa
     *
     * @return num de treballadors
     */
    public int numTreb() {
        return treballadors.size();
    }

    /**
     * mètode que assigna un sou a un treballador
     *
     * @param dni del treballador a assignar el sou
     * @param sou a assignar al treballador
     */
    public void assignarSou(String dni, float sou) {
        int pos = this.cercar(dni);
        if (pos != -1) {
            Treballador tr = treballadors.get(pos);
            tr.setSou(sou);
        }
    }

    /**
     * Despese mensuals de l'empresa en sous
     *
     * @return total de despeses en nòmines mensuals
     */
    public float despesesEnNomines() {
        float despeses = 0;

        for (Treballador tr : treballadors) {
            despeses = despeses + tr.getSou();
        }
        return despeses;
    }
    
    /**
     * Retorna la posició del client a l'ArrayList donat el seu dni.
     *
     * @param dni del client a cercar
     * @return la posició o -1 si no hi és.
     */
    private int cercarCli(String dni) {
        int posicio = -1;
        boolean trobat = false;
        int i = 0;

        while ((trobat == false) && (i < clients.size())) {
            if (clients.get(i).getDni().equals(dni)) {
                trobat = true;
                posicio = i;
            }
            i++;
        }
        //System.out.println("Posicio " + posicio);
        return posicio;
    }

    /**
     * Retorna el client de l'empresa per cercant dni
     * @param dni del treballador
     * @return el client o null si no el troba.
     */
    public Client getClient(String dni) {
        Client cl = null;
        int pos = this.cercarCli(dni);
        if (pos != -1) {
            cl = this.clients.get(pos);
        }
        return cl;

    }

    /**
     * Afegir un client a la llista passant un objecte treballador
     *
     * @param cl client a afegir.
     */
    public void afegir(Client cl) {

        this.clients.add(cl);
    }

    /**
     * Eliminar un client al llistat passant un objecte Client
     *
     * @param cl treballador a eliminar que previament ha sigut cercat
     */
    public void eliminarCli(Client cl) {
        this.clients.remove(cl);
    }

    /**
     * eliminar un client de la llista passant el seu dni
     *
     * @param dni del client a eliminar.
     */
    public void eliminarCli(String dni) {
        int pos = this.cercarCli(dni);
        if (pos != -1) {
            this.clients.remove(pos);
        }
    }

    /**
     * mètode que retorna el número de client de l'empresa
     *
     * @return num de clients
     */
    public int numCli() {
        return clients.size();
    }



    /**
     * Llista per consola les dades de l'empresa
     */
    public void dades() {
        System.out.println("Empresa:" + this.getNom());
        System.out.println("Lista treballadors:");
        for (Treballador tr : treballadors) {
            System.out.println(tr.dades());
        }
        System.out.println("Lista clients:");
        for (Client cl : clients) {
            System.out.println(cl.dades());
        }
        System.out.println("------------");

    }

}
