/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martinez_Nil_UF5_Pe1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nmartinez
 */
public class Empresa {
    String nom;
    private Set<Treballadors> treballadors;

    public Empresa(String nom) {
        this.nom = nom;
        treballadors = new TreeSet<>();
    }
    
    public void afegirTreballador(Treballadors tre){
        boolean agregado = treballadors.add(tre);
        if (!agregado) {
            System.out.println("Treballador amb DNI repetit. ("+tre.getDNI()+")");
        }
    }
    
    public void esborrarTreballador(String DNI){
        boolean trovat = false;
        Iterator<Treballadors> iter = treballadors.iterator();
        while(iter.hasNext()){
            Treballadors tre = iter.next();
            if (tre.getDNI().equals(DNI)) {
                trovat = true;
                iter.remove();
            }
        }
        if (trovat) {
            System.out.println("Treballador amb DNI: "+ DNI +" esborrat.");
        } else {
            System.out.println("No existeix un treballador amb aquest DNI. ("+DNI+")");
        }
    }
    
    public void augmentarSou(String DNI,double sou) throws ExceptionCatA{
        boolean trovat = false;
        boolean sueldoA = false;
        for (Treballadors tre : treballadors) {
            if (tre.getDNI().equals(DNI)) {
                trovat = true;
                tre.setSou(sou);
                if (tre.getSou() > 3000) {
                    sueldoA = true;
                }
            }
        }
        if (trovat) {
            System.out.println("Sou aumentat a "+ sou +".");
        } else {
            System.out.println("No existeix el treballador.");
        }
        if (sueldoA) {
            throw new ExceptionCatA(sueldoA);
        }
    }
    
    public void mostrarTreballadors(){
        for (Treballadors tre : treballadors) {
            System.out.println(tre.toString());
        }
    }
    
    public void emmagatzemarTreballadors(){
      try {
            FileOutputStream fos = new FileOutputStream("empleats");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(treballadors);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (Exception exe){
            exe.printStackTrace(System.out);
        }
    }
    
    public void recuperarTreballadors(){
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("empleats");
            ois = new ObjectInputStream(fis);   
            TreeSet<Treballadors> treb =(TreeSet<Treballadors>) ois.readObject();
            treballadors.addAll(treb);
        } catch (IOException io) {
            io.printStackTrace(System.out);
        } catch (ClassNotFoundException e){
            e.printStackTrace(System.out);
        } finally{
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
}

