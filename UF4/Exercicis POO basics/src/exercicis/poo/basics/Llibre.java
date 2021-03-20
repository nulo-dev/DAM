/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;

/**
 *
 * @author nmartinez
 */
public class Llibre {

    String autor;
    String titol;
    int numpag;
    String isbn;
    boolean prestat;

    public Llibre() {

    }

    public Llibre(String autor, String titol, int numpag, String isbn, boolean prestat){
        this.autor=autor;
        this.titol=titol;
        this.numpag=numpag;
        this.isbn=isbn;
        this.prestat=prestat;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getTitol() {
        return this.titol;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getNumpag() {
        return this.numpag;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPrestat(Boolean prestat) {
        this.prestat = prestat;
    }

    public void mostrar() {
        System.out.println("Autor: "+this.autor+"\n Titol: "+this.titol+"\n NumPag: "+this.numpag+"\n ISBN: "+this.isbn+"\n Prestat: "+this.prestat);
    }

    @Override
    public String toString() {
        return "Llibre{" + "autor=" + autor + ", titol=" + titol + ", numpag=" + numpag + ", isbn=" + isbn + ", prestat=" + prestat + '}';
    }


    
}
