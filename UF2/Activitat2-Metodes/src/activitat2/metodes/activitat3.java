/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat2.metodes;

/**
 *
 * @author nmartinez
 */
public class activitat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int x = util.validint("Ingrese el primer numero: ");
        int y = util.validint("Ingrese el segundo numero: ");
        int z = util.validint("Ingrese el tercer numero: ");
        
        pareja(x,y,z);
        
    }
    
    
     /**
     * @author nmartinez
     * @param x Ingresamos el 1 numero que queremos comprobar si es pareja
     * @param y Ingresamos el 2 numero que queremos comprobar si es pareja
     * @param z Ingresamos el 3 numero que queremos comprobar si es pareja
     * Revisa las parejas de numeros que hay (hasta un maximo de una pareja)
     * 
     */
    public static void pareja(int x, int y, int z){
        
        if (x == y) {
            System.out.println(+x+" y "+y+ " son pareja!");
        } else if (x == z) {
            System.out.println(+x+" y "+z+ " son pareja!");
        } else if (y == z) {
            System.out.println(+y+" y "+z+ " son pareja!");
        } else if (y == x) {
            System.out.println(+y+" y "+x+ " son pareja!");
        } else {
            System.out.println("No hay ninguna pareja D:");
        }
        
    }
    
}
