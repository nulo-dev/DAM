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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nmartinez
 */
public class EmpresaMap {
    String nom;
    private Map<String, Treballadors> treballadors;

    public EmpresaMap(String nom) {
        this.nom = nom;
        treballadors = new HashMap<>();
    }
    
    public void afegirTreballador(Treballadors tre){
        boolean trovat = false;
        Set<String> ks = treballadors.keySet();
        for (String key : ks) {
            Treballadors t = treballadors.get(key);
            if (t.getDNI().equals(tre.getDNI())) {
                trovat = true;
            }
        }
        if (!trovat) {
            treballadors.put(tre.getDNI(), tre);
        } else {
            System.out.println("Treballador repetit. DNI("+tre.getDNI()+")");
        }
    }
    
    public void esborrarTreballador(String DNI){
        boolean trovat = false;
        Set<String> ks = treballadors.keySet();
        for (String key : ks) {
            Treballadors t = treballadors.get(key);
            if (t.getDNI().equals(DNI)) {
                treballadors.remove(DNI);
                trovat = true;
            }
        }
        if (!trovat) {
            System.out.println("No existeix una persona amb aquest DNI ("+DNI+")");
        }
    }
    
    public void augmentarSou(String DNI,double sou){
        boolean trovat = false;
        Set<String> ks = treballadors.keySet();
        for (String key : ks) {
            Treballadors t = treballadors.get(key);
            if (t.getDNI().equals(DNI)) {
                t.setSou(sou);
                trovat = true;
            }
        }
        if (trovat) {
            System.out.println("Sou aumentat a "+ sou +".");
        } else {
            System.out.println("No existeix el treballador.");
        }
    }
    
    public void mostrarTreballadors(){
        Set<String> ks = treballadors.keySet();
        for (String key : ks) {
            Treballadors t = treballadors.get(key);
            System.out.println(t.toString());
        }
    }
    
//    public void emmagatzemarTreballadors(){
//      try {
//            FileOutputStream fos = new FileOutputStream("empleats");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(treballadors);
//            oos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        } catch (Exception exe){
//            exe.printStackTrace(System.out);
//        }
//    }
//    
//    public void recuperarTreballadors(){
//        ObjectInputStream ois = null;
//        try {
//            FileInputStream fis = new FileInputStream("empleats");
//            ois = new ObjectInputStream(fis);   
//            TreeSet<Treballadors> treb =(TreeSet<Treballadors>) ois.readObject();
//            treballadors.addAll(treb);
//        } catch (IOException io) {
//            io.printStackTrace(System.out);
//        } catch (ClassNotFoundException e){
//            e.printStackTrace(System.out);
//        } finally{
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException ex) {
//                System.out.println(ex.toString());
//            }
//        }
//    }
    
}

