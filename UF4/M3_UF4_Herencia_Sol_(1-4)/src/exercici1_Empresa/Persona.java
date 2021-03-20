package exercici1_Empresa;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Persona {

    private String nom;
    protected String dni;
    private String adreça;

    public Persona(String nom, String dni, String adreça) {
        this.nom = nom;
        this.dni = dni;
        this.adreça = adreça;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String dades() {
        return "Persona: {nom=" + nom + ", dni=" + dni + ", adreça=" + adreça + "}";
    }

}
