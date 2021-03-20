package ex_comportament;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Persona senzilla amb un nom, un dni i una adreça
 * @author bernat
 */
public class Persona implements I_Moure{
    private int px;
    private int py;
    /** nom del treballador */
    protected String nom;
    /** dni del treballador */
    protected String dni;
    /** adreça del treballador */
    protected String adreça;

    /** crea un objecte Persona passant-li els atributs */
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

 /**
  * Retorna les dades d'una persona
  * @return Retorna les dades d'una persona
  */

    public String dades() {
        return "Dades: nom=" + nom + ", dni=" + dni + ", adre\u00e7a=" + adreça;
    }
    
     @Override
    public void mou(int x, int y) {
        this.px = x;
        this.py = y;
    }

    @Override
    public String showPosicio() {
        return String.format("Posicio: %d %d", px, py);
    }

    
    
        
        

    
    
    
    
   
    
}
