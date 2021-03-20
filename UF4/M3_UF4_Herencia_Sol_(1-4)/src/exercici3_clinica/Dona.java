/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3_clinica;

/**
 * Classe que conte la funcionalitat principal d'una dona.
 * Es recolza amb la classe Persona
 * @see Persona
 * @author bernat
 */
public class Dona extends Pacient {

    public Dona(String nom, double alcada, double pes, int edat) {
        super(nom, alcada, pes, edat);
        
    }
    
    /** retorna un objecte dona passades les seves dades */
//    public Dona(String nom, double alcada, double pes, int edat)
//    {
//        super(nom, alcada, pes, edat);
//    }
    /**
     * Retorna el número de calories que ha de prendre una dona
     * @return Retorna el número de calories que ha de prendre una dona
     */
    @Override
    public double numCalories()
    {
        return 100*this.getAlcada()*this.getPes();
    }
    
    public String metodeDona(){
        return "Dona";
    }
}

