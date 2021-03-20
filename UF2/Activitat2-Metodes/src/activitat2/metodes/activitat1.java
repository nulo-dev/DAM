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
public class activitat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("CALCULADORA PARA DIVIDIR");
        System.out.println("========================");
        
        double num1 = util.validdouble("Ingrese el primer numero: ");
        double num2 = util.validdouble("Ingrese el segundo numero: ");
        
        dividir(num1,num2);
        
    }
    
    public static void dividir(double num1, double num2) {
        
        if (num2 == 0) {
            System.out.println("La division es imposible");
        } else {
           double resultado = num1/num2; 
           System.out.println("El resultado de la division es: "+resultado);
        }
        
    }
    
}
