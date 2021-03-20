/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author nmartinez
 */
public class Client extends Persona {
    
    String carrer;

    public Client(String carrer, String dni, String nom, int naixement) {
        super(dni, nom, naixement);
        this.carrer = carrer;
    }
    public Client(){
        
    }
    public void setcarrer(String carrer){
        this.carrer=carrer;
    }
    public String getcarrer(){
        return this.carrer;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() +" carrer=" + carrer + '}';
    }
    
}
