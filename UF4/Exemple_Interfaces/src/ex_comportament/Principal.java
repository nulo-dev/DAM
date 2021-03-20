/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_comportament;

import java.util.ArrayList;

/**
 *
 * @author alfredo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Figura f = new Figura();
        Quadrat q = new Quadrat(4.5);
        System.out.println(q.perimetre());
        System.out.println(q.area());
        Cercle c = new Cercle(2.8);
        System.out.println(c.perimetre());
        System.out.println(c.area());
        System.out.println("----------");
        ArrayList<Figura> figs = new ArrayList<Figura>();
        figs.add(q);
        figs.add(c);
        for (Figura f : figs) {
            System.out.println(f.perimetre());
            System.out.println(f.area());

        }

        ArrayList<I_Moure> aom = new ArrayList<>();
        aom.add(q);
        aom.add(c);
        aom.add(new Persona("Pep", "123", "Adreça"));
        System.out.println("--------------");
        int x = 10;
        int y = 25;
        for (I_Moure im : aom) {
            im.mou(x++, y++);
            System.out.println(im.showPosicio());
        }
        System.out.println("--------------");
        for (I_Moure im : aom) {
            im.mou(x++, y++);
            if (im instanceof Persona) {
                Persona p = (Persona) im;
                System.out.print(p.getNom() + " ");
            }
            System.out.println(im.showPosicio());
        }

    }
}
