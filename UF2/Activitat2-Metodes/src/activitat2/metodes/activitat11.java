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
public class activitat11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      
      Alumno alumno[] = introduirDadesAlumnesCurs();
      Alumno alumnofinal[] = mitjanaNotesCurs(alumno);
      Alumno aprovats[] = alumnesAprovats(alumnofinal);
      
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Nombre: "+alumno[i].nom);
            System.out.println("Edad: "+alumno[i].edad);
            System.out.println("Nota Trimestre 1: "+alumno[i].nota_tr1);
            System.out.println("Nota Trimestre 2: "+alumno[i].nota_tr2);
            System.out.println("Nota Trimestre 3: "+alumno[i].nota_tr3);
            System.out.println("Nota final del curso: "+alumnofinal[i].notafinal);
        }
     
        
    }

    public static Alumno[] introduirDadesAlumnesCurs(){
        
        Scanner input = new Scanner(System.in);
        int cantidad = util.validint("Ingrese la cantidad de alumnos: ");
        Alumno alumno[] = new Alumno[cantidad];
        int j =1;
        for (int i = 0; i < cantidad; i++) {
            alumno[i] = new Alumno();
            System.out.println("Ingrese el nombre del alumno "+j+": ");
            alumno[i].nom = input.next();
            input.nextLine();
            System.out.println("Ingrese la edad del alumno "+j+": ");
            alumno[i].edad = input.nextInt();
            System.out.println("Ingrese la nota del trimestre 1 del alumno "+j+": ");
            alumno[i].nota_tr1 = input.nextDouble();
            System.out.println("Ingrese la nota del trimestre 2 del alumno "+j+": ");
            alumno[i].nota_tr2 = input.nextDouble();
            System.out.println("Ingrese la nota del trimestre 3 del alumno "+j+": ");
            alumno[i].nota_tr3 = input.nextDouble();
            j++;
        }
        
        return alumno;
    }
    
    public static Alumno[] mitjanaNotesCurs (Alumno[] alumno){
        System.out.println("MITAJA DEL CURS PER ALUMNE:");
        for (int i = 0; i <alumno.length; i++) {
            double resultado = alumno[i].nota_tr1+alumno[i].nota_tr2+alumno[i].nota_tr3;
            resultado = resultado /3;
            alumno[i].notafinal = resultado;
        }
        return alumno;
    }
    
    public static Alumno[] alumnesAprovats (Alumno[] alumno) {
        
        Alumno aprovats[] = new Alumno[alumno.length];
        int j = 0;
        for (int i = 0; i <alumno.length; i++) {
            if (alumno[i].notafinal > 5) {
                aprovats[j] = new Alumno();
                aprovats[j].nom = alumno[i].nom;
                aprovats[j].notafinal = alumno[i].notafinal;
                j++;
            }
        }
        System.out.println("ALUMNE APROVATS");
        for (int i = 0; i < aprovats.length; i++) {
            System.out.println(aprovats[i].nom);
            System.out.println(aprovats[i].notafinal);
        }
        return aprovats;
    }
    
    
}
