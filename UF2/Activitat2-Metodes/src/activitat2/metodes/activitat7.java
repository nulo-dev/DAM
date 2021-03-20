/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat2.metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class activitat7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random ran = new Random();
        double [][] array = new double[30][12];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j][i] = ran.nextDouble()*41;
            }
        }
        
        /* for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println("");
        } */
        boolean salir = false;
        while(!salir){
            System.out.println("======================== SELECCIONE UNA OPCION DEL MENU ========================");
            System.out.println("");
            System.out.println("1. El dia mas frio del año");
            System.out.println("2. El dia mas calutoso del año");
            System.out.println("3. La temperatura media de cada año");
            System.out.println("4. Diferencia de temperatura entre el dia mas frio y mas caluroso del año");
            System.out.println("5. Finalizar programa");
            int num = util.validint("Ingrese la opcion que quiere: ");
            if (num == 1) {
                masFrio(array);
            } else if (num == 2) {
                masCalor(array);   
            } else if (num == 3) {
                mediaAño(array);                
            } else if (num == 4) {
                diferenciaMes(array);   
            } else if (num == 5) {
                salir = true;
            }
        }
    }
    
    public static void masFrio(double[][] array){
        
        double masfrio [] = new double[3];
        masfrio[2] = 41;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] < masfrio[2]) {
                    masfrio[0] = i;
                    masfrio[1] = j;
                    masfrio[2] = array[j][i];
                }
            }
        }
        System.out.println("MES MAS FRIO DEL AÑO");
        System.out.println("====================");
            masfrio[0] = masfrio[0] +1;
            System.out.println("Mes: "+masfrio[0]);
            masfrio[1] = masfrio[1] +1;
            System.out.println("Dia: "+masfrio[1]);
            System.out.printf("Temperatura: %.2f%n",masfrio[2]);
    }


    public static void masCalor(double[][] array){
        
        double mascalor [] = new double[3];
        mascalor[2] = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > mascalor[2]) {
                    mascalor[0] = i;
                    mascalor[1] = j;
                    mascalor[2] = array[j][i];
                }
            }
        }
        System.out.println("MES MAS CALUROSO DEL AÑO");
        System.out.println("====================");
            mascalor[0] = mascalor[0] +1;
            System.out.println("Mes: "+mascalor[0]);
            mascalor[1] = mascalor[1] +1;
            System.out.println("Dia: "+mascalor[1]);
            System.out.printf("Temperatura: %.2f%n",mascalor[2]);
        
    }    
    
    public static void mediaAño (double[][] array){
        
        double arraymedia [] = new double[12];
        double media = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j <array.length; j++) {
                media = media + array[j][i];
                if (j == 29) {
                    media = media/30;
                    arraymedia[i] = media;
                }
            }
        }
        int l = 1;
        System.out.println("MEDIA DE CADA MES");
        System.out.println("=================");
        for (int i = 0; i < 12; i++) {
            System.out.println("Media mes "+l+": ");
            System.out.printf("%.2f",arraymedia[i]);
            System.out.println("");
            l++;
        }
        
    }
    
    public static void diferenciaMes (double[][] array){
        
        double masfrio = 41;
        double mascaliente = 0;
        System.out.println("DIFERENCIA DE TEMPERATURA");
        System.out.println("=========================");
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j <array.length; j++) {
                if (array[j][i] > mascaliente) {
                    mascaliente = array[j][i];
                }
                if (array[j][i] < masfrio) {
                    masfrio = array[j][i];
                }
                if (j == 29) {
                    System.out.println("Mes "+i+": ");
                    double resultado = mascaliente - masfrio;
                    System.out.printf("%.2f",resultado);
                    System.out.println("");
                    resultado = 0;
                    mascaliente = 0;
                    masfrio = 41;
                }
            }
        }
        
    }
}
