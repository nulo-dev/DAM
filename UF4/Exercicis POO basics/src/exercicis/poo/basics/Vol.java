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
public class Vol {
    
    String volid;
    String origen;
    String desti;

    public Vol() {
    }

    public Vol(String volid, String origen, String desti) {
        this.volid = volid;
        this.origen = origen;
        this.desti = desti;
    }
    
    public void setVolid(String volid){
        this.volid=volid;
    }
    
    public String getVolid(){
        return this.volid;
    }
    
    public void setOrigen(String origen){
        this.origen=origen;
    }
    
    public String getOrigen(){
        return this.origen;
    }
    
    public void setDesti(String desti){
        this.desti=desti;
    }
    
    public String getDesti(){
        return this.desti;
    }
    
    public void mostrar(){
        
        System.out.println("VOLID: "+this.volid+" Origen: "+this.origen+" Desti: "+this.desti);
        
    }
    
}
