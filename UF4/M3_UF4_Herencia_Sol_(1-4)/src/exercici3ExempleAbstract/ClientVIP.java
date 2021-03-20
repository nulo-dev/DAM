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
public class ClientVIP extends Client {

    private final float descompteVIP = 30.0f;

    public ClientVIP(float despesa, String nom, String dni, String adreca) {
        super(despesa, nom, dni, adreca);
    }

    @Override
    public String toString() {
        return "ClientVIP{" + super.toString() + "descompteNormal=" + descompteVIP + '}';
    }

    public float importCompra(float compra) {
        float preuCompra = 0;
        if (compra >= 6000) {
            preuCompra = compra * (1 - this.descompteVIP / 100);
        } else {
            preuCompra = compra * (1 - (this.descompteVIP / 2) / 100);
        }
       
        this.despesa = this.despesa + preuCompra;
        return preuCompra;
    }

}
