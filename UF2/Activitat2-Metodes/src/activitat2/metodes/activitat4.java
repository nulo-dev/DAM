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
public class activitat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num = util.validdouble("Dinero: ");
        
        double calculo = calc_bonificacion(num);
        System.out.println("La bonificacion sera de "+calculo);
    }
    
    static double calc_bonificacion (double ventas){
        
        double bonificacion;
        double porcentaje;
        if (ventas < 20000) {
            porcentaje = ventas*2/100;
            bonificacion = 7000 + porcentaje;
            return bonificacion;
        } else if (ventas >= 20000 && ventas < 50000){
            porcentaje = ventas*3/100;
            bonificacion = 15000 + porcentaje;
            return bonificacion;
        }   else if (ventas >= 50000){
            porcentaje = ventas*12/100;
            bonificacion = 20000 + porcentaje;
            return bonificacion;
        } else {
            bonificacion = 0;
            return bonificacion;
        }
        
    }
    
}
