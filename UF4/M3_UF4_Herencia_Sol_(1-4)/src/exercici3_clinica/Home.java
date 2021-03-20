package exercici3_clinica;

/**
 * Classe que conte la funcionalitat rpincipal d'un home. Es recolza amb la
 * classe Persona
 *
 * @see Persona
 * @author bernat
 */
public class Home extends Pacient {

    /**
     * retorna un objecte dona passades les seves dades
     */
    public Home(String nom, double alcada, double pes, int edat) {
        super(nom, alcada, pes, edat);

    }

    /**
     * Retorna el número de calories que ha de prendre una home
     *
     * @return Retorna el número de calories que ha de prendre una home
     */
    @Override
    public double numCalories() {
        return 50 * this.getAlcada() * this.getEdat() * this.getPes();
    }

    public String metodeHome() {
        return "Home";
    }
 

}
