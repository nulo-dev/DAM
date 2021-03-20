/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxersejemplos;

import java.io.File;

/**
 *
 * @author nmartinez
 */
public class Fitxer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("enters.txt");
     try{
        if (archivo.exists()) {
            System.out.println("Existe");
            System.out.println(archivo.getAbsolutePath());
        } else{
            System.out.println("No existe");
            
            if (archivo.createNewFile()) {
                
            }
        }
        
    } catch (Exception e) { 
            System.err.println(e); 
        } 
    }
}
