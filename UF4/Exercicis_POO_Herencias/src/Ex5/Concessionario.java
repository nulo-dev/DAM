/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class Concessionario {
    String nom;
    ArrayList<Cotxe> llistat;

    public Concessionario(String nom) {
        this.nom = nom;
        this.llistat = new ArrayList<>();
    }
    
    public void afegirAudi(double preu, int cilindrada, int places, boolean venut,boolean superSport,double venta){
        Audi au = new Audi(preu,cilindrada,places,venut);
        au.setSuperSport(superSport);  
        au.setVenta(venta);
        llistat.add(au);
    }
    
    public void afegirSkoda(double preu, int cilindrada, int places, boolean venut, boolean electic, boolean consumMinim,double venta){
        Skoda sk = new Skoda(preu,cilindrada,places,venut);
        sk.setElectric(electic);
        sk.setConsumMinim(consumMinim);
        sk.setVenta(venta);
        llistat.add(sk);
    }
    
    public void afegirVolkswagen(double preu, int cilindrada, int places, boolean venut,double venta){
        Volkswagen vw = new Volkswagen(preu,cilindrada,places,venut);
        vw.setVenta(venta);
        llistat.add(vw);
    }

    @Override
    public String toString() {
        
        return "Concessionario{" + "nom=" + nom + ", llistat=" + llistat.toString() + '}';
    }
    
    public void numcotxvenuts(){
        
        int aux = 0;
        
        for (int i = 0; i < llistat.size(); i++) {
            if (llistat.get(i).venut==true) {
                aux++;
            }
        }
        
        if (aux==0) {
            System.out.println("No se ha venut cap cotxe");
        } else {
            System.out.println("Se han venut "+aux+" cotxes.");
        }
    }
 
    public void infocotxvenuts(){
        
        boolean aux = false;
        
        for (int i = 0; i < llistat.size(); i++) {
            if (llistat.get(i).venut==true) {
                aux = true;
                System.out.println(llistat.get(i).toString());
            }
        }
        if (!aux) {
            System.out.println("No se ha trovat cap cotxe venut.");
        }
    }
    
    public void gastcotxvenuts(){
        
        boolean aux = false;
        double res = 0;
        for( Cotxe c : this.llistat){
            if (c.venut) {
             aux = true;
            res = res+c.calcularPreu(c.preu);  
            }
        }
        System.out.println(res); 
        if (!aux) {
            System.out.println("No se ha trovat cap cotxe venut.");
        }
    }
        
     public int numAudisvenuts(){
         
        int aux = 0;

         for (Cotxe c : this.llistat) {
             if (c instanceof Audi && c.venut) {
                 aux++;
             }
         }
         return aux;
     }    
    
     
     public int numSkodavenuts(){
         
         int aux = 0;
         
         for(Cotxe c : this.llistat){
             if (c instanceof Skoda ) {
                 Skoda sk = (Skoda) c;
                 if (sk.isConsumMinim()) {
                     aux++;
                 }
             }
         }
         return aux;
     }
}
