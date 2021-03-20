/*
 * A partir d'un array bidimensional i el valor que es desitja buscar, tornarà
 * la posició on es troba el primer que s'ha trobat fent el recorregut per files.
 */
package recerques;

import java.util.Scanner;

/**
 *
 * @author Francesca && Alfredo
 */
public class RecercaLinealMatriuBidimensional {

     public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int taula[][] = {{1, 2, 3}, {4, 2, 6}, {8, 9, 2}};

        int numACercar = 0;
        boolean esNum = false;        
        do {
            System.out.print("Introdueix el número a buscar: ");
            if (teclat.hasNextInt()) {
                numACercar = teclat.nextInt();
                teclat.nextLine();
                esNum = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
             }

        } while (!esNum);

        boolean trobat = false;
        int fila = -1, col = -1;
        int posF = 0, posC = 0;
        while (posF < taula.length && trobat == false) {
            posC = 0;
            while (posC < taula[posF].length && trobat == false) {
                if (taula[posF][posC] == numACercar) {
                    fila = posF;
                    col = posC;
                    trobat = true;
                }
                posC++;
            }
            posF++;
        }
        if (trobat) {
            System.out.printf("Primer->S'ha trobat el %d a la posició [%d,%d]\n", numACercar, fila, col);
        } else {
            System.out.println("No trobat");
        }
        trobat = false;
        fila = -1;
        col = -1;
        posF = taula.length - 1;
        while (posF >= 0 && trobat == false) {
            posC = taula[posF].length - 1;
            while (posC >= 0 && trobat == false) {
                if (taula[posF][posC] == numACercar) {
                    fila = posF;
                    col = posC;
                    trobat = true;
                }
                posC--;
            }
            posF--;
        }
        if (trobat) {
            System.out.printf("Ultim-> S'ha trobat el %d a la posició [%d,%d]\n", numACercar, fila, col);
        } else {
            System.out.println("No trobat");
        }
         for (int i = 0; i < taula.length; i++) {
             for (int j = 0; j < taula[i].length; j++) {
                 if (taula[i][j]==numACercar) {
                     System.out.print(taula[i][j]+"* ");
                     
                 } else {
                     System.out.print(taula[i][j]+" ");
                 }
                 
                 
                 
             }
             System.out.println("");
             
         }
         for (int i = 0; i < taula.length; i++) {
             for (int j = 0; j < taula[i].length; j++) {
                 if (taula[i][j]==numACercar) {
                     System.out.printf("S'ha trobat el %d a la posició [%d,%d]\n",numACercar, i, j);
                     
                     
                 } else {
                     
                 }
                 
                 
                 
             }
             System.out.println("");
             
         }
    }
}
