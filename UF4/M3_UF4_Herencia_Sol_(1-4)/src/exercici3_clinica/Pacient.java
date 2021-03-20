package exercici3_clinica;

/**
 * classe que conté les dades principals d'un pacient
 */

public abstract class Pacient {

    /**
     * nom del pacient
     */
    protected String nom;
    /**
     * alçada del pacient
     */
    protected double alcada;
    /**
     * pes del pacient
     */
    private double pes;
    /**
     * edat del pacient
     */
    protected int edat;

    /* retorna un objecte Pacient */
    public Pacient(String nom, double alcada, double pes, int edat) {
        this.setNom(nom);
//        this.nom=nom;
        this.setAlcada(alcada);
        this.setPes(pes);
        this.setEdat(edat);

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAlcada() {
        return alcada;
    }

    public void setAlcada(double alcada) {
        this.alcada = alcada;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    /**
     * calcula el número de calories que ha de consumir
     *
     * @return un pacient
     */
    public abstract double numCalories();
    
    public double caloriesMes(){
        return this.numCalories() * 30;
    }

    // @Override
    /**
     * mostra les dades del client
     *
     * @return mostra les dades del client
     */
        public String toString() {
            return "Pacient:" + "nom=" + nom + ", al\u00e7ada=" + alcada + ", pes=" + pes + ", edat=" + edat;
        }
//    @Override
//    public String toString() {
//        return "Pacient: " + "nom=" + this.getNom() + ", al\u00e7ada=" + this.getAlcada() +
//                ", pes=" + this.getPes() + ", edat=" + this.getEdat() + ", Calories=" + this.numCalories()+'}';
//    }

}
