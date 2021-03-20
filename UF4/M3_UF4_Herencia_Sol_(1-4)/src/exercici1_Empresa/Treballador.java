/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1_Empresa;

/**
 * Classe Treballador que afegeix el sou a una classe Persona
 * @see Persona
 */
public class Treballador extends Persona{
    
    /** sou del treballador */
    private float sou;// sou del treballador
    
    
    /* retorna un objecte Treballador passat els seus atributs */
    public Treballador(float sou, String nom, String dni, String adreça) {
        super(nom, dni, adreça);
        this.sou = sou;
    }

   public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }

    
    @Override
    public String dades() {
        return "Treballador: {" + super.dades() + ",sou=" + sou+ "}";
    }
}
