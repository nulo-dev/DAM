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
public class activitat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("CALCULAR LA RAIZ CUADRADA");
        double num1 = util.validdouble("Ingrese el numero: ");
        
        System.out.println("La raiz cuadrada de "+num1+" es "+raizcuadrada(num1));
        
    }
    
    
     /**
     * @author nmartinez
     * @param num1 Ingresamos el numero del cual queremos saber la raiz cuadrada
     * Calculamos la raiz cuadrada
     * @return raiz Devuelve la raiz cuadrada del numero que hemos ingresado
     */
    public static double raizcuadrada(double num1){
        
        double raiz = Math.sqrt(num1);
        
        if (num1 <= 0) {
            raiz = -1;
            return raiz;
        } else {
            return raiz;
        }
        
    }
    
}
