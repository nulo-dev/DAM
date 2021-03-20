/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1uf4.nilmartinez;

import java.util.Scanner;

/**
 *
 * @author nmartinez
 */
public class Pt1UF4NilMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean salir = false;
        Universitat uni = new Universitat("UAB BARCELONA");
        inserirDades(uni);        
        
        do {
            boolean repetirelim = true;
            int opcio = menu();
            
            switch(opcio){
                case 1:
                    uni.mostrarLlista();
                    break;
                case 2:
                    System.out.println("\n\n");
                    uni.mostrarAlumnes();
                    System.out.println("\n\n\n\n\n");
                    break;
                case 3:
                    System.out.println("\n\n");
                    uni.mostrarProfessors();
                    System.out.println("\n\n\n\n\n");
                    break;
                case 4:
                    String dnibusc = Util.demanarString("Ingresi el DNI a buscar: "+"\n>");
                    uni.buscarPersona(dnibusc);
                    break;
                case 5:
                    do {
                        String dnielim = Util.demanarString("Ingresi el DNI a eliminar: "+"\n>");
                        if (dnielim.equals("0")) {
                            repetirelim = false;
                        } else {
                            repetirelim = true;
                            uni.eliminarPersona(dnielim);
                        }
                    } while (repetirelim);
                    break;
                case 6:
                    uni.llistarAsignatures();
                    break;
                case 7:
                    salir = true;
                    break;
            }
            
        } while (!salir);
        
        
    }
    
    public static int menu(){
        
        System.out.println("\t┌────────────────────────────────── MENU ───────────────────────────────────┐");
        System.out.println("\t├───────────────────────────────────────────────────────────────────────────┤");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 1.- Llistar tots els membres de la Universitat                            │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 2.- Llistar tots els alumnes                                              │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 3.- Llistar tots els professors                                           │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 4.- Cercar i mostrar informació d'un membre per el seu DNI                │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 5.- Eliminar membres demanant el DNI (parar eliminacio introduint un 0)   │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 6.- Llistar les assignatures de la Universitat                            │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t│ 7.- Sortir                                                                │");
        System.out.println("\t│                                                                           │");
        System.out.println("\t├───────────────────────────────────────────────────────────────────────────┤");
        System.out.println("\t└───────────────────────────────────────────────────────────────────────────┘");
        int opcio = Util.demanaInt("\nSelecciona una opcio:\n> ");
        return opcio;
    }
    
    public static void inserirDades(Universitat uni){
        
        Assignaturas M01 = new Assignaturas("M01");
        Assignaturas M02 = new Assignaturas("M02");
        Assignaturas M03 = new Assignaturas("M03");
        Assignaturas M04 = new Assignaturas("M04");
        Assignaturas M05 = new Assignaturas("M05");
        
        Alumnes al = new Alumnes("111111W","Juan","Lopez");
        AlumnesDoctorat ald = new AlumnesDoctorat("322223J","Nil","Martinez");
        AlumnesBecats alb = new AlumnesBecats("2584838I","David","Vazques","Beca transport");
        Professor prof = new Professor("9588386Y","Hugo","Rodriguez",1989);
        Professor prof2 = new Professor("5432346I","Pedrp","Sanchez",1989);
        Professor prof3 = new Professor("93828384F","Laura","Lopez",1969);
        Professor prof4 = new Professor("28384858O","Fernando","Gabrien",1999);
        al.setListasigmatr(M02);
        alb.setListasigmatr(M01);
        al.setListasigmatr(M03);
        al.setListasigmatr(M05);
        ald.setListasigmatr(M05);
        prof.impartirAssignatura(M03);
        prof.impartirAssignatura(M02);
        ald.impartirAssignatura(M04);
        ald.setTutor(prof.nom);
        uni.setLlista(al);
        uni.setLlista(alb);
        uni.setLlista(ald);
        uni.setLlista(prof);
        uni.setLlista(prof2);
        uni.setLlista(prof3);
        uni.setLlista(prof4);
        uni.afegirAsignatures(M01);
        uni.afegirAsignatures(M02);
        uni.afegirAsignatures(M03);
        uni.afegirAsignatures(M04);
        uni.afegirAsignatures(M05);
        System.out.println("\n\u001B[32mDades carregadues correctament.\u001B[0m\n");
        
    }
    
}
