/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici7;

/**
 *
 * @author nmartinez
 */
public class Exercici8 {

    
    public static void main(String[] args) {
       
        String s1 = "Bienvenido a Java";
        String s2 = s1;
        String s3 = new String("Bienvenido a Java");
        String s4 = "Bienvenido a Java";
        
        System.out.println(s1 == s2); //no es una manera correcta de comprobar los Strings, ja que con esto estamos comparando si ocupan el mismo espacio de memoria, no si son iguales en cuanto a caracteres
        System.out.println(s2 == s3); //no es una manera correcta de comprobar los Strings, ja que con esto estamos comparando si ocupan el mismo espacio de memoria, no si son iguales en cuanto a caracteres
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1 == s4); //no es una manera correcta de comprobar los Strings, ja que con esto estamos comparando si ocupan el mismo espacio de memoria, no si son iguales en cuanto a caracteres
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf('J'));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("a", 16));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Bie"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("Bienvenido  ".trim());
        System.out.println(s1.replace('a', 'T'));
        System.out.println(s1.replaceAll("a","T"));
        System.out.println(s1.replaceFirst("a", "T"));
        System.out.println(s1.toCharArray());
        
    }
    
}
