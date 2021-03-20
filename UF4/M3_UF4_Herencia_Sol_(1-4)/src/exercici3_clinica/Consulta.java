package exercici3_clinica;

import java.util.ArrayList;

public class Consulta {

    /**
     * nom consulta
     */
    private String nom;//nom consulta
    /**
     * pacients de pacients
     */
    private ArrayList<Pacient> pacients;

    /**
     * retorna un objecte consulta passat el seu nom
     */
    public Consulta(String nom) {
        this.setNom(nom);
        this.pacients = new ArrayList<Pacient>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * retorna el número de pacients actuals
     *
     * @return número de pacients actuals
     */
    public int numPacientActuals() {
        return this.pacients.size();
    }

    /**
     * retorna el número de pacients actuals majors de 65 anys
     *
     * @return número de pacients actuals majors de 65 anys
     */
    public int majors65() {
        int num = 0;
        for (int i = 0; i < this.pacients.size(); i++) {
            if (this.pacients.get(i).getEdat() > 65) {
                num++;
            }
        }

        return num;
    }

    /**
     * Retorna el número de calories d'un pacient passat un pacient
     *
     * @param nom - nom del pacient
     * @return número calories
     */
    public double numCaloriesPacient(String nom) {
        double numC = -1;
        Pacient p = this.cercarPerNom(nom);
        if (p != null) {
            numC = p.numCalories();
        }
        return numC;
    }

    /**
     * Retorna les dades del pacient passat el nom
     *
     * @param nom del pacient
     * @return dades del pacient
     */
    public String dadesPacient(String nom) {
        String text = null;
        Pacient p = this.cercarPerNom(nom);
        if (p != null) {
            text = p.toString();
        }
        return text;
    }

    /**
     * Mètode que dona d'alta un pacient passat un objecte pacient
     *
     * @param p pacient que es vol donar d'alta
     */
    public void donarAltaPacient(Pacient p) {
        this.pacients.add(p);
    }

    /**
     * Cerca un pacient donat el seu nom retornant la seva posició a l'array. Si
     * no exixteix retorna -1
     *
     * @param nom nom del pacient que volem cercarPerNom
     * @return posició del pacient al pacients de pacients de la consulta
     */
    public Pacient cercarPerNom(String nom) {
        Pacient pac = null;
        boolean trobat = false;
        int i = 0;
        while ((!trobat) && (i < pacients.size())) {
            if (pacients.get(i).getNom().equals(nom)) {
                trobat = true;
                pac = pacients.get(i);
            }
            i++;
        }
        return pac;
    }

    /**
     * Dona de baixa un pacient passat un ojecte pacient
     *
     * @param pacient que volem donar de baixa
     */
    public void donarBaixaPacient(Pacient p) {
        this.pacients.remove(p);
    }

    /**
     * Dona de baixa un pacient passat el seu nom
     *
     * @param pacient que volem donar de baixa
     */
    public void donarBaixaPacient(String nom) {
        Pacient p = this.cercarPerNom(nom);
        if (p != null) {
            this.pacients.remove(p);
        }
    }

    public void llistador() {
        System.out.println("Llistador");
        for (int i = 0; i < this.pacients.size(); i++) {
            Pacient p = this.pacients.get(i);
            System.out.println(p);
            double cal = p.numCalories();
            System.out.printf("Calories: %.2f\n", cal);
            if (p instanceof Home) {
                Home h = (Home) p;

                System.out.println("És " + h.metodeHome());
            }
            if (p instanceof Dona) {
                Dona d = (Dona) p;
                System.out.println("És " + d.metodeDona());
            }
        }
    }

    @Override
    public String toString() {
        return "Consulta{" + "nom=" + nom + ","
                + " llistat=" + pacients + '}';
    }

}
