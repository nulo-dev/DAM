package exercici1_Empresa;

public class Client extends Persona {

    /**
     * Num compte persona
     */
    private String numCompt;
    /**
     * Total gastat
     */
    private float total;

    /**
     * retorna les dades del client passat totes les seves dades excepte el
     * total gastat
     */
    public Client(String nom, String dni, String adreça, String numCompt) {
        super(nom, dni, adreça);
        this.numCompt = numCompt;
        this.total = 0;
    }

    public String getNumCompt() {
        return numCompt;
    }

    public void setNumCompt(String numCompt) {
        this.numCompt = numCompt;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * Afegir quantitat consumida
     * @param cons quantitat a afegir al total. 
     */
    public void incrementaTotalGastat(float cons) {
        this.total += cons;

    }

    @Override
    public String dades() {
        return "Dades:{" + super.dades() + ",numCompt=" + numCompt + ", Total Gastat: " + total;

    }

}
