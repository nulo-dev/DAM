/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.poo.basics;
import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Biblioteca {
    
    String dni;
    String nom;
    ArrayList<Soci> listasoc;
    ArrayList<Llibre> listalib;
    
    public Biblioteca(){
        listasoc = new ArrayList<>();
        listalib = new ArrayList<>();
    }
    
    public Biblioteca(String dni, String nom){
        this.dni = dni;
        this.nom = nom;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setLlibre(Llibre lib,Soci soc){
        soc.setllibre(lib);
    }
    
    public void setSoci(Soci soc){
        listasoc.add(soc);
    }
    public void setLlibre(Llibre lib){
        listalib.add(lib);
    }
    
    public int getSoci(String soci){
        int pos = -1;
        
        for (int i = 0; i < listasoc.size(); i++) {
            if (listasoc.get(i).nom.equals(soci)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public void buscarSoci(String soci){
        int pos = getSoci(soci);
        
        if (pos!=-1) {
            listasoc.get(pos).mostrarTitol();
        } else {
            System.out.println("Soci no encontrado.");
        }
    }
    
    public void eliminarSoci(String soci){
        int pos = getSoci(soci);
        
        if (pos!=-1) {
            System.out.println("--------Eliminando Soci--------");
            System.out.println("Soci: "+listasoc.get(pos).nom+" eliminado satisfactoriamente.");
            listasoc.remove(pos);
        } else {
            System.out.println("Soci no encontrado.");
        }
        
    }
    
    public int getLibro(String libro){
        int pos = -1;
        
        for (int i = 0; i < listalib.size(); i++) {
            if (listalib.get(i).isbn.equals(libro)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public void buscarLibro(String libro){
        int pos = getLibro(libro);
        
        if (pos!=-1) {
            listalib.get(pos).mostrar();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
    
    public void eliminarLibro(String libro){
        int pos = getLibro(libro);
        
        if (pos!=-1) {
            System.out.println("--------Eliminando Libro--------");
            System.out.println("Libro: "+listalib.get(pos).titol+" eliminado satisfactoriamente.");
            listalib.remove(pos);
        } else {
            System.out.println("Libro no encontrado.");
        }
        
    }
    
    public void mostrarSocios(){
        System.out.println("--------------------Lista Socios--------------------");
        for (int i = 0; i < listasoc.size(); i++) {
            System.out.println(listasoc.get(i).toString());
        }
        
    }
    
    public void mostrarLibros(){
        System.out.println("--------------------Lista Libros--------------------");
        for (int i = 0; i < listalib.size(); i++) {
            System.out.println(listalib.get(i).toString());
        }
        
    }
    
}
