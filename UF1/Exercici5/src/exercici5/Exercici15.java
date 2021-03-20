/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author nmartinez
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] vector = new int[20];
        int[] cont = new int[10];
        char valor;int pos;int max = 0;
        Random rnd = new Random();
        do{
            System.out.printf("Vol introduir els valors manualment? [S/N] ");
            valor = Character.toUpperCase(input.next().charAt(0));
            System.out.println();
            switch(valor){
                case 'S':
                    for(int i = 0;i<vector.length;i++){
                        do {
                            System.out.printf("Valor nº%d: ",i+1);
                            vector[i]=input.nextInt();
                            if(vector[i]<1 || vector[i]>10){
                                System.out.println("EL VALOR HA DE SER DE 1-10!");
                            }
                        } while(vector[i]<1 || vector[i]>10);
                    }
                    break;
                case 'N':
                    for(int i = 0;i<vector.length;i++){
                        vector[i]=rnd.nextInt(10)+1;
                    }
                    break;
                default:
                    System.out.println("NO és una opció vàlida.");
            }
        }while(valor!='S' && valor!='N');
        System.out.println(Arrays.toString(vector));
        //GUardar numero de veces que se repiten los numeros
        for(int i=0;i<vector.length;i++){
            pos=vector[i];
            cont[pos]++;
        }
        System.out.println("\nVECTOR REPETICIONS: \n"+Arrays.toString(cont));
        for(int i = 0;i<cont.length;i++){
            if(cont[i]>max){
                max=cont[i];
            }
        }
        System.out.printf("Els numeros que mes es repeteixen (%d vegades)son: ",max);
        for(int i = 0;i<cont.length;i++){
            if(cont[i]==max){
                System.out.printf("%d ",i+1);
            }
            
            
        }
        
        
    }
    
}
