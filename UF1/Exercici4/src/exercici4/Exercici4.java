/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /// EXERCICI 1 ///
        
//        for (int i=0;i<=9;i++){
//            System.out.println(i);
//        }
        
        /// EXERCICI 2 ///
        
//        for (int i=100;i<=200;i++) {
//            System.out.println(i);
//    }

        /// EXERCICI 3.1 ///
        
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(i);
//        }

        /// EXERCICI 3.2 ///
//        int num= 9;
//        while (num>=0){
//            System.out.println(num);
//            num--;
//        }

        /// EXERCICI 4 ///
        
//        int i=0;
//        while (i<5){
//            System.out.println(i);
//            i++;
//        }

        /// EXERCICI 5 ///
        
//        for(int i=1; i<=100; i++){
//            if (i%2==1) {
//                System.out.println(i);
//            } 
//        }

        /// EXERCICI 6 ///
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingresi un nombre: ");
//        int num = input.nextInt();
//        while(num != 0){
//            
//            int doble = num*2;
//            System.out.printf("El doble de %d es %d %n",num,doble);
//            System.out.println("Ingresi un nombre: ");
//            num = input.nextInt();
//    }

        /// EXERCICI 7 ///

//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingresi un nombre: ");
//          int  i = input.nextInt();
//          int factorial = 1;
//        while(i>0){
//            factorial = factorial*i;
//            i--;
//        }
//        System.out.println(factorial);

        /// EXERCICI 8 ///
        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.printf("Ingresi un nombre: ");
//            int i = input.nextInt();
//            
//        while (i!=0) {
//            if (i>0){
//                int doble = i*i;
//                System.out.println(doble);
//            } else {
//                int triple = i*i*i;
//                System.out.println(triple);
//            }
//            System.out.printf("Ingresi un nombre: ");
//            i = input.nextInt();
//        }

        /// EXERCICI 9 ///
        
//        Scanner input = new Scanner(System.in);
//            boolean salir = true;
//            float suma = 0;
//            int numero = 0;
//        while (salir){
//            System.out.printf("Ingresi un nombre: ");
//            float i = input.nextFloat();
//            if (i>=0){
//            suma = suma+i;   
//            numero++;
//            }else {
//                salir = false;
//            }
//            
//        }
//        float resultado = suma/numero;
//        System.out.printf("La mitjana es: %.3f %n",resultado);

        /// EXERCICI 10 ///
        
//        Scanner input = new Scanner (System.in);
//            boolean salir = true;
//            
//            while (salir){
//                System.out.print("Ingresi un nombre: ");
//                int i = input.nextInt();
//                if (i>0){
//                    i++;
//                    System.out.printf("El seguent numero es: %d%n",i);
//                } else if (i<0) {
//                    i--;
//                    System.out.printf("El anterior numero es: %d%n",i);
//                } else {
//                    salir = false;
//                }
//            }

        /// EXERCICI 11 ///     
        
//        int i;
//        
//        for(i=1;i<=100; i++){
//            System.out.printf("%d\t",i);
//            
//            if (i % 10 == 0){
//                System.out.printf("%n");
//            }
//        }
//        System.out.printf("Final del programa%n");

        /// EXERCICI 12 ///
        
//        Scanner input = new Scanner (System.in);
//        
//        System.out.printf("Ingresi el numero que vol elevar: ");
//        float a = input.nextFloat();
//        int b = 0;
//        boolean salir = true;
//        System.out.printf("Ingresi el numero de vegades que vol elevar %.2f: ",a); 
//            b = input.nextInt();
//        while(salir){
//            if(b==0){
//                System.out.println("A INGRESAT UN 0, INGRESI UN NUMERO MAJOR A '0'");
//            System.out.printf("Ingresi el numero de vegades que vol elevar %.2f: ",a); 
//            b = input.nextInt();
//            } else {
//                salir=false;
//            }
//        }
//        float resultado = 1;
//        float i;
//        for(i=1;i<=b;i++){
//           resultado =resultado*a ;
//           if(i==b){
//            System.out.printf("El resultat es %.2f%n",resultado);
//           }
//        }
        
        /// EXERCICI 13 ///
        
//        Scanner input = new Scanner (System.in);
//        System.out.printf("Ingresi un nombre real: ");
//        float num = input.nextFloat();
//        
//        for(float i=1;i<=10;i++){
//            float resultado = num*i;
//            System.out.printf("%5.2f \t * \t%.2f \t=\t %.2f%n",num,i,resultado);
//        }
        
        /// EXERCICI 14 ///
        
//        Scanner teclat = new Scanner(System.in);
//            System.out.print("Introdueix un numero: ");
//            int num = teclat.nextInt();
//
//            System.out.printf("Nombre");
//            System.out.printf("%10s", "Quadrat");
//            System.out.printf("%10s", "Cub");
//                    System.out.println("");
//            System.out.println("=======  =======    =======");
//            for (int i = 0; i <=5; i++ ,num++) {
//            int quadrat = num*num;
//            int cub = num*num*num;
//            System.out.printf("%7d",num);
//            System.out.printf("%9d",quadrat);
//            System.out.printf("%11d %n",cub);
//        }

        /// EXERCICI 15 ///
        
//        Scanner input = new Scanner(System.in);
//        
//                    char caracter;
//                    String entrada;
//                    int i;
//            for (i=0;i<10;){
//                System.out.printf("Introdueix una lletra: ");
//                entrada = input.nextLine();
//                caracter = entrada.charAt(0);
//            if(caracter == 65 || caracter == 97){
//                i++;
//            } else {
//                System.out.println("No has escrit una a/A");
//            }
//            }
            
        /// EXERCICI 16 ///
        
//        Scanner input = new Scanner(System.in);
//        
//        char caracter;
//        String entrada;
//        boolean salida = true;
//        int a = 0;
//        int e = 0;
//        int i = 0;
//        int o = 0;
//        int u = 0;
//        while(salida){
//            System.out.print("Introdueix una vocal: ");
//            entrada = input.nextLine();
//            caracter = entrada.charAt(0);
//            
//            switch (caracter) {
//                case 65:
//                case 97:
//                    // a|A //
//                    a++;
//                    break;
//                case 69:
//                case 101:
//                    // e|E //
//                    e++;
//                    break;
//                case 73:
//                case 105:
//                    // i|I //
//                    i++;
//                    break;
//                case 70:
//                case 111:
//                    // o|O //
//                    o++;
//                    break;
//                case 85:
//                case 117:
//                    // u|U //
//                    u++;
//                    break;
//                case 35:
//                    // # //
//                    salida = false;
//                    break;
//            }
//        }
//        System.out.printf("%nCOMPTADOR%n");
//        System.out.printf("---------%n");
//        System.out.printf("A: %d%n",a);
//        System.out.printf("E: %d%n",e);
//        System.out.printf("I: %d%n",i);
//        System.out.printf("O: %d%n",o);
//        System.out.printf("U: %d%n",u);

        /// EXERCICI 17 ///

//    Scanner input = new Scanner (System.in);
//    
//        System.out.printf("Ingresi el nombre de treballadors: ");
//        int t = input.nextInt();
//        int smax = 0;
//        for(int i=1;i<=t;i++){
//            System.out.printf("Ingresi el sou del treballador %d: ",i);
//            int s = input.nextInt();
//            
//            if(s>smax) {
//                smax=s;
//            }
//        }
//        System.out.printf("El sou maxim es: %d€%n",smax);

        /// EXERCICI 18 ///

//      Scanner input = new Scanner (System.in);
//      
//        System.out.printf("Programa per aprendre les taules de multiplicar%n");
//        
//        System.out.printf("%nAmb quin número vols practicar? ");
//        int num = input.nextInt();
//        
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d * %d = ",num,i);
//            int resposta = input.nextInt();
//            int resultat = num*i;
//            if(resposta == resultat) {
//                System.out.println("Valor correcte!");
//            } else {
//                System.out.println("Ho sento, s'ha equivocat. La resposta correcta era 10.");
//                i--;
//                System.out.printf("%nHas encertat %d de 10 números%n",i);
//                i=10;
//            }
//        }
        
             /// EXERCICI 19 ///

//        Scanner input = new Scanner (System.in);
//            int comptadorsus = 0;
//            int comptadorapr = 0;
//            for(int i=1; i<=6; i++){
//                System.out.printf("Escriu la nota numero %d: ",i);
//                int nota = input.nextInt();
//                if (nota <=4){
//                    comptadorsus++;
//                } else {
//                    comptadorapr++;
//                }
//            }
//            System.out.printf("La quantitat de alumnes aprobats son: %d%n",comptadorapr);
//            System.out.printf("La quantitat de alumnes suspesos son: %d%n",comptadorsus);

            /// EXERCICI 20 ///

//                for (int alto = 1; alto < 4; alto++) {
//                   for (int espacio = 1; espacio <= 4-alto; espacio++) {
//                       System.out.print(" ");
//                   }
//                   for (int asteriscos = 1; asteriscos <= (alto*2)-1; asteriscos++) {
//                       System.out.print("*");
//                   }
//                   System.out.println();
//               }

            /// EXERCICI 21 ///
            
//            Scanner input = new Scanner(System.in);
//            
//            System.out.printf("Ingresi un numero: ");
//            int num = input.nextInt();
//            
//            switch(num){
//                case 1:
//                    System.out.printf("El numero %d en angles es 'One'%n",num);
//                    break;
//                case 2:
//                    System.out.printf("El numero %d en angles es 'Two'%n",num);
//                    break;
//                case 3:
//                    System.out.printf("El numero %d en angles es 'Three'%n",num);
//                    break;
//                case 4:
//                    System.out.printf("El numero %d en angles es 'Four'%n",num);
//                    break;
//                case 5:
//                    System.out.printf("El numero %d en angles es 'Five'%n",num);
//                    break;
//                case 6:
//                    System.out.printf("El numero %d en angles es 'Six'%n",num);
//                    break;
//                case 7:
//                    System.out.printf("El numero %d en angles es 'Seven'%n",num);
//                    break;
//                case 8:
//                    System.out.printf("El numero %d en angles es 'Eight'%n",num);
//                    break;
//                case 9:
//                    System.out.printf("El numero %d en angles es 'Nine'%n",num);
//                    break;
//                case 10:
//                    System.out.printf("El numero %d en angles es 'Ten'%n",num);
//                    break;
//                default:
//                    System.out.printf("Ingressi un numero del 1 al 10",num);
//                    break;
//            }

    }
}


