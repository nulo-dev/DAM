/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martinez_Nil_UF5_Pe1;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author nmartinez
 */
public class Treballadors implements Comparable<Treballadors> ,Serializable{
    
    String DNI;
    String nom;
    String departament;
    transient double sou;

    public Treballadors(String DNI, String nom, String departament, double sou) {
        this.DNI = DNI;
        this.nom = nom;
        this.departament = departament;
        this.sou = sou;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Treballadors other = (Treballadors) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Treballadors p) {
        return this.DNI.compareTo(p.DNI);
    }

    @Override
    public String toString() {
        return "Treballadors{" + "DNI=" + DNI + ", nom=" + nom + ", departament=" + departament + ", sou=" + sou + '}';
    }
    
    
}
