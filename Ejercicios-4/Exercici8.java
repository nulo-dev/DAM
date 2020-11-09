/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num[];
        num = new int[5];
        float neg = 0, pos = 0, mediapos= 0, medianeg= 0;
        int contneg =0, contpos =0, cero = 0;
        for(int i=0; i<num.length; i++){
            System.out.print("Ingresi un nombre: ");
            num[i] = input.nextInt();
            
            if(num[i] < 0){
                neg = neg+num[i];
                contneg++;
            } else if (num[i] > 0) {
                pos = pos+num[i];
                contpos++;
            } else if (num[i] == 0) {
                cero++;
            }
        }
        
        
        if(pos != 0){
          mediapos = pos/contpos;
        } else {
          mediapos = 0;
        }
        if(neg != 0){
          medianeg = neg/contneg; 
        } else {
          medianeg = 0;
        }
            System.out.printf("%n%nLa mitja de numeros positius es '%.2f'%n%nLa mitja de numeros negatius es '%.2f'%n%nLa quantitat de zeros es '%d'%n",mediapos,medianeg,cero);
    }
    
}
