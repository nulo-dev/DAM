/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici3ExempleAbstract;

/**
 *
 * @author Alfredo
 */
public abstract class Client extends Persona {

    protected float despesa;

    public Client(float despesa, String nom, String dni, String adreca) {
        super(nom, dni, adreca);
        this.despesa = despesa;
    }

    public abstract float importCompra(float compra);
  
    @Override
    public String toString() {
        return "Client{" + super.toString() + "despesa=" + despesa + '}';
    }
    

}
