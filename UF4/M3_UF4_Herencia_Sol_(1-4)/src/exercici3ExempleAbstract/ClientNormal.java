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
public class ClientNormal extends Client {

    private final float descompteNormal = 10.0f;

    public ClientNormal(float despesa, String nom, String dni, String adreca) {
        super(despesa, nom, dni, adreca);
    }

    @Override
    public String toString() {
        return "ClientNormal{" + super.toString() + "descompteNormal=" + descompteNormal + '}';
    }

    @Override
    public float importCompra(float compra) {
        float preuCompra = compra * (1 - descompteNormal / 100);
        this.despesa = this.despesa + preuCompra;
        return preuCompra;
    }


   



}
