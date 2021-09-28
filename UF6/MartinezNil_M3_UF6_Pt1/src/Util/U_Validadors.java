/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author nmartinez
 */
public class U_Validadors {
    public static boolean validarInt(String s){
        boolean esInt = true;
        try {
            int ib = Integer.parseInt(s);
        } catch (Exception e) {
            esInt = false;
        }

        return esInt;
    }
 
    public static boolean validarDouble(String s){
        boolean esDouble = true;
        try {
            double ib = Double.parseDouble(s);
        } catch (Exception e) {
            esDouble = false;
        }

        return esDouble;
    }
}
