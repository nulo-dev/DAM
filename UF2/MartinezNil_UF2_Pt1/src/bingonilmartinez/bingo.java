/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingonilmartinez;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nilma
 */
public class bingo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
//----------------------------------------------------------
// Aqui estamos definiendo las variables
        int cartones; // Cantidad de cartones con los que queremos jugar
        String respuesta; // La respuesta del jugador a la pregunta de si quiere seguir jugando
        int respuestanum; //La respuesta del jugador a la pregunta de que carton quiere comprobar con el bombo
        boolean sjugando = false; // Seguir jugando
        boolean linea = false; // Indica si ha salido linea
        boolean bingo = false; // Indica si ha salido bingo
        boolean repetir = false; // Si quiere volver a jugar otra partida
        boolean correctocontinuar = false; // Verificacion de que la respuesta del usuario es correcta
        boolean correctorespuestanum = false; // Verificacion de que la respuesta del usuario es correcta
//----------------------------------------------------------

        do {
        cartel(); // Iniciamos el metodo cartel que lo que hace es printear el nombre del juego en un formato mas agradable
        cartones = util.validint("Ingrese la cantidad de cartones con los que quiere jugar: "); // Preguntamos al usuario con cuantos cartones quiere jugar (comprobamos que es un numero) y lo guardamos en la variable cartones
        int carton[][][] = new int[3][9][cartones]; // Creamos la array carton
        int cartonCopia[][][] = new int[3][9][cartones]; // Creamos una array del mismo tamaño que la array carton
        int ubicacion[] = new int[5]; // Creamos una array llamada ubicacion donde alamacenaremos las ubicaciones aleatorias de los nuemros en cada fila.
        int[] numeroBombo = bombo(); // Creamos una array donde guardaremos los numeros del bombo
        int aux; // Un auxiliar que ira cambiando de valor mediante avance el programa (para ir sacando un numero del bombo cada vez que pasemos por el)
        int incrementador = 0; // Otro incrementador, este incrementador limitara la pregunta de seguir jugando a 90 como maximo
        insertarDatos(carton,cartones,ubicacion); // Insertamos los datos al carton
        copiarCarton(carton,cartonCopia,cartones); // Copiamos el carton original a la array cartonCopia
            do {
            if (repetir) { // Este if es por si queremos jugar una nueva partida resetear las variables e ingresar de nuevo los datos
                incrementador = 0; 
                insertarDatos(carton,cartones,ubicacion); 
                copiarCarton(carton,cartonCopia,cartones);
                repetir = false;
                linea = false;
                bingo = false;
                numeroBombo = bombo();
            }
            
            aux = numeroBombo[incrementador]; // Este aux guarda un numero del bombo, cada vez que pasemos por aqui nos dara la ubicacion del numero del bombo+1
            mostrarCartonCopia(cartonCopia,cartones);  // Mostraremos el CartonCopia formatado para que sea mas agradable a la vista
            modificarCartonCopia(cartonCopia,cartones,aux); // Modificamos el cartonCopia en caso de que el numero del carton conicida con el bombo
            if (!linea) { // Si linea es false comprobamos
               linea = comprobarLinea(cartonCopia,cartones); // Comprueba si hay linea, en caso de que haya linea la variable linea pasara a ser true y no volvera a comprobarse mas
            }
            if (incrementador != 90) { //Comprobamos que el incrementador no llegue a mas de 90 para no salirnos del maximo del bombo
                incrementador++; // Incrementamos el incrementador xD
                do { // Este while sirve para repetir la pregunta en caso de que el usuario inserte una respuesta erronea
                    System.out.println("¿Quiere seguir jugando? (s/n)"); // Le preguntamos al usuario si quiere seguir jugando
                    respuesta = input.next(); // Guardamos la respuesta del usuario
                    // PARA PREGUNTAR SI QUIERE SEGUIR JUGANDO, SI QUIERES QUITARLO PON UN if(true)
                    if (respuesta.charAt(0) == 's') { //Comprobamos la respuesta del usuario
                        sjugando = true; // Pasamos sjugando a true, eso quiere decir que el while que saca los cartones y comprueba todo se volvera a repetir
                        correctocontinuar = true; // Ponemos el comprobador en correcto para que salir del while de comrpobacion
                    } else  if (respuesta.charAt(0) == 'n') { //Comprobamos la respuesta del usuario
                        sjugando = false; // Pasamos sjugando a false, eso quiere decir que el while que saca los cartones y comprueba todo no se volver a repetir, basicamente salimos del programa
                        correctocontinuar = true; // Ponemos el comprobador en correcto para que salir del while de comrpobacion
                    } else {
                        System.out.println("No ha ingresado una opcion correcta..."); // Le decimos al usuario que la opcion introducia no es correcta
                        correctocontinuar = false; // Ponemos el comprobador en false para que se repita la comprobacion y vuelva a preguntarle al usuario
                    }
                } while (!correctocontinuar); // While de comprobacion de la pregunta de seguir jugando
            }
            if (!bingo) { // Comprobamos si ha salido bingo o todavia no
                bingo = comprobarBingo(cartonCopia,cartones); // Comprobamos el bingo en caso de salir positivo o negativo la variable bingo recibiria un true o un false del metodo
                if (bingo) { // Si sale bingo hacemos lo siguiente
                    do { 
                        respuestanum = util.validint("Indique el carton para mostrarle que numeros ha acertado: "); // Comprobamos la respuesta del usuario para saber si es un int o no
                        if (respuestanum <= cartones) { // Si lo que ha introducido el usuario es un numero y esta en el rango de cartones cerramos el while
                            correctorespuestanum = true; // cerramos el while
                        } else { // Si el numero no esta en el rango de cartones con los que juega le recordamos al usuario con cuantos cartones ha jugado
                            System.out.println("No ha ingresado una cantidad correcta, recuerde que esta jugando con "+cartones+" carton/es"); // recordatorio de cartones
                            correctorespuestanum = false; // repetimos while, volvemos a preguntarle al usuario
                        }
                    } while (!correctorespuestanum); // While para comprobar que lo que ha introducido el usuario es un numero o esta dentro del rango de cartones con los que esta jugando
                    mostrarCartonOriginal(carton,respuestanum-1); // Mostramos el carton que ha seleccionado el usuario (le mostramos el carton original)
                    mostrarBombo(numeroBombo,incrementador,carton,respuestanum-1); // Mostramos el bombo y lo pintamos para que muestre los numeros que han coincidido con el carton seleccionado
                    do {
                    System.out.println("¿Quiere jugar otra partida? (s/n)"); // Le preguntamos si quiere jugar otra partida
                    respuesta = input.next(); // Guardamos la respuesta
                        if (respuesta.charAt(0) == 's') { // Cogemos la respuesta y nos ubicamos en la posicion 0 asi el usuario si ingresa un "si" seguira siendo valido
                            sjugando = false; // Cerramos el while de sjugando para que no nos muestre los cartones antiguos
                            repetir = true; // Ponemos el boolean repetir en true para que asi volvamos a empezar a jugar
                            correctocontinuar = true; // Ponemos el boolean de comprobacion en correcto para que asi no nos vuelva a preguntar si queremos jugar otra partida
                        } else  if (respuesta.charAt(0) == 'n') { // Cogemos la respuesta y nos ubicamos en la posicion 0 asi el usuario si ingresa un "no" seguira siendo valido
                            sjugando = false; // Cerramos el while de sjugando para que no nos muestre los cartones antiguos
                            repetir = false; // Ponemos el boolean repetir en false para que asi no volvamos a jugar
                            correctocontinuar = true; // Ponemos el boolean de comprobacion en correcto para que asi no nos vuelva a preguntar si queremos jugar otra partida
                        } else { // Si el usuario no ingresa una respuesta valida se lo decimos
                            System.out.println("No ha ingresado una opcion correcta..."); // Le decimos que no ha ingresado una respuesta valida
                            correctocontinuar = false; // Repetimos el while con la pregunta para que ingrese una respuesta correcta
                        }
                    } while (!correctocontinuar); // Comprobacion de la respuesta del usuario
                }
            }
            } while (sjugando);
        } while (repetir);
              
        
    }
    
    /**
     * Con este metodo clonamos el carton original a la array cartonCopia
     * @param carton
     * @param cartonCopia
     * @param cartones
     * @return cartonCopia Devuelve el cartonCopia con la informacion del carton original
     */
    public static int[][][] copiarCarton (int[][][] carton, int[][][] cartonCopia, int cartones){
        for (int dimension = 0; dimension < cartones; dimension++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    cartonCopia[i][j][dimension] = carton[i][j][dimension];
                }
            }
        }
        return cartonCopia;
    }
    /**
     * Con este metodo generamos las ubicaciones aleatorias donde iran los numeros en cada fila
     * @param ubicacion
     * @return ubicacion
     * Generamos un nume
     */
    public static int[] ubicacionRandom(int[] ubicacion){

        for(int i=0;i<ubicacion.length;i++){
            boolean encontrado = false;
            int aleatorio=(int)(Math.random()*9); // generamos un numero del 0 al 9
            for (int j=0;j<i ;j++){
                if(ubicacion[j]==aleatorio){ // si dentro de la array encontramos el numero ponemos el boolean en true
                    encontrado=true;
                }
            }
            if(!encontrado){ // si no ha encontrado el numero en toda la array (osea el boolean esta en false) se lo asignamos a la posicion i
                ubicacion[i]=aleatorio;
            }else{ // si encontramos el numero en la array (osea el boolean esta en true) restamos un i para asi volver a la posicion de antes para poder asignarle un numero nuevo
                i--;
            }
        }       
        Arrays.sort(ubicacion); // ordenamos los numeros de la array de menor a mayor
        return ubicacion; // devolvemos la array llena y ordenada
    }
      /**
       * En este metodo insertaremos los datos en el carton, insertaremos los numeros aleatorios en las ubicaciones indicadas por el metodo ubicacion
       * @param carton
       * @param cartones
       * @param ubicacion
       * @return carton
       */
    public static int[][][] insertarDatos(int[][][] carton, int cartones,int[] ubicacion){
        // En este motodo como su nombre indica vamos a insertar los datos dentro del carton
        Random rnd = new Random();
        int aux = 0;
        int aux2 = 0;
        int guardado[][] = new int[3][9];
        boolean repetido = false;
        int numero[] = new int[20];
        for (int dimension = 0; dimension < cartones; dimension++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    carton[i][j][dimension] = 0; // Asignamos en todas las ubicaciones un 0 para resetear las arrays
                }
            }
        }
        for (int dimension = 0; dimension < cartones; dimension++) {       
            numero = datosRandom();
            for (int i = 0; i < 3; i++) {    
                ubicacionRandom(ubicacion);
                for (int j = 0; j < 9; j++) {
                    if (aux < 5) {
                     if (ubicacion[aux] == j) {
                        carton[i][j][dimension] = numero[aux2]; // Asiganmos en la ubicacion i j dimension el numro random generado anteriormente
                        aux++;
                        aux2++;
                    } else {
                        carton[i][j][dimension] = 0;   
                           }   
                    }
                }
                    aux = 0;
            }
                    aux2 = 0;
        }

        return carton;
    }   
    /**
     * Este metodo generamos numeros aleatorios sin repeticion para luego meter esos numeros en el carton mediante el metodo "insertarDatos"
     * @return numeros
     */
    public static int[] datosRandom(){
        
        int[] numeros = new int[20];
        Random rnd = new Random();
        
        for(int i=0;i<numeros.length;i++){
            for (int j=0;j<i ;j++){
                numeros[i] = 0;
            }
        }
        
        for(int i=0;i<numeros.length;i++){
            boolean repetido = false;
            int random = rnd.nextInt(90)+1;
            for (int j=0;j<i ;j++){
                if(numeros[j]==random){
                    repetido=true; // Si el numero de la array numeros coincide con el numero random generado ponemos el repetido en true para que vuelva a genera otro numero
                }
            }
            if(!repetido){
                numeros[i]=random; // si no esta repetido asiganmos el numero random a la array
            }else{
                i--;
            }
        }

        return numeros;
        
        
    }
    /**
     * Generamos el bombo con numeros aleatorios sin repeticion
     * @return bombo
     */
    public static int[] bombo(){
        
        int[] bombo = new int[90];
        Random rnd = new Random();
        
        for(int i=0;i<bombo.length;i++){
            boolean repetido = false;
            int random = rnd.nextInt(90)+1;
            for (int j=0;j<i ;j++){
                if(bombo[j]==random){
                    repetido=true; // Si el numero de la array numeros coincide con el numero random generado ponemos el repetido en true para que vuelva a genera otro numero
                }
            }
            if(!repetido){
                bombo[i]=random; // si no esta repetido asiganmos el numero random a la array
            }else{
                i--;
            }
        }
        
        return bombo;
    }
    /**
     * Con este metodo sacamos por pantalla el bombo pintando de color rojo los numeros que ha acertado con el carton seleccionado previamente
     * @param bombo
     * @param incrementador
     * @param carton
     * @param num 
     */
    public static void mostrarBombo(int[]bombo,int incrementador,int[][][] carton,int num){
        int aux = 0;      
        
        for (int i = 0; i < incrementador; i++) {
            boolean encontrado = false;
            for (int l = 0; l < 3; l++) {
                for (int j = 0; j < 9; j++) {
                        if (bombo[i] == carton[l][j][num] && !encontrado) {
                            if (bombo[i] >=10) {
                                System.out.print("|\u001B[41m "+bombo[i]+" \u001B[0m");
                                encontrado = true;
                            } else {
                                System.out.print("|\u001B[41m "+bombo[i]+"  \u001B[0m");
                                encontrado = true;
                            }                            
                        }
                    if (aux == 10) {
                        System.out.print("|");
                        System.out.println("");
                        aux = 0;
                    }
                }
            }
            if (!encontrado) {
                if (bombo[i] >=10) {
                    System.out.print("\u001B[0m| "+bombo[i]+" ");
                } else {
                    System.out.print("\u001B[0m| "+bombo[i]+"  ");
                }
            }
            aux++;
        }
        System.out.println("\n\nEstos son los numeros que coinciden con el carton seleccionado.");
        System.out.println("");
    }
    /**
     * Modificamos el cartonCopia para poner un -1 en caso de que el numero del carton coincida con el numero del bombo
     * @param cartonCopia
     * @param cartones
     * @param bombo
     * @return cartonCopia
     */
    public static int[][][] modificarCartonCopia(int[][][] cartonCopia, int cartones,int bombo){
        
        System.out.println("Nuevo numero: "+bombo);
        for (int dimension = 0; dimension < cartones; dimension++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    if (cartonCopia[i][j][dimension] == bombo) {
                        cartonCopia[i][j][dimension] = -1;
                    }
                }
            }
        }
        return cartonCopia;
    }
    /**
     * Mostramos el cartonCopia formatado para que sea agradable a la vista del usuario y tachando los numeros acertados
     * @param cartonCopia
     * @param cartones 
     */
    public static void mostrarCartonCopia(int[][][] cartonCopia, int cartones){
        System.out.println("");
        for (int dimension = 0; dimension < cartones; dimension++) {
            System.out.println("\u001B[36m╔════════════════════════════════════════════╗");
             System.out.printf("\u001B[36m║                  \u001B[0mCARTON %d                  \u001B[36m║\n",dimension+1);
             System.out.printf("\u001B[36m╠════╤════╤════╤════╤════╤════╤════╤════╤════╣\u001B[0m");
            for (int i = 0; i < 3; i++) {
                    if (i!=0) {
                         System.out.print("\u001B[36m╟────┼────┼────┼────┼────┼────┼────┼────┼────╢\u001B[0m");   
                }
                System.out.println("");
                for (int j = 0; j < 9; j++) {
                    if (j == 0) {
                        if (cartonCopia[i][j][dimension] < 10) {
                            if (cartonCopia[i][j][dimension] == 0) {
                                System.out.print("\u001B[36m║\u001B[36m▓▓▓\u001B[0m");
                            } else
                            if (cartonCopia[i][j][dimension] == -1) {
                                System.out.print("\u001B[36m║\u001B[37m\u001B[41m X \u001B[0m");
                            } else {
                                System.out.print("\u001B[36m║\u001B[0m "+cartonCopia[i][j][dimension]+" "); 
                            }
                        } else {
                           System.out.print("\u001B[36m║\u001B[0m "+cartonCopia[i][j][dimension]); 
                        }
                    } else{
                        if (cartonCopia[i][j][dimension] < 10) {
                            if (cartonCopia[i][j][dimension] == 0) {
                                System.out.print(" \u001B[36m│\u001B[36m▓▓▓\u001B[0m");
                            } else
                            if (cartonCopia[i][j][dimension] == -1) {
                                System.out.print(" \u001B[36m│\u001B[37m\u001B[41m X \u001B[0m");
                            } else {
                                System.out.print(" \u001B[36m│\u001B[0m "+cartonCopia[i][j][dimension]+" ");
                            }
                        } else{
                            System.out.print(" \u001B[36m│\u001B[0m "+cartonCopia[i][j][dimension]);   
                        }  
                    }
                    if (j == 8) {
                           System.out.print(" \u001B[36m║\u001B[0m");   
                    }
                }
                    System.out.println("");
            }
                System.out.print("\u001B[36m╚════╧════╧════╧════╧════╧════╧════╧════╧════╝\u001B[0m");   
                System.out.println("\n\n");
        }
        
    }
    /**
     * Mostramos el carton original sin tachar los numeros acertados
     * @param carton
     * @param dimension 
     */
    public static void mostrarCartonOriginal (int[][][] carton,int dimension){
        
            System.out.println("\u001B[36m╔════════════════════════════════════════════╗");
            System.out.printf("\u001B[36m║                  \u001B[0mCARTON %d                  \u001B[36m║\n",dimension+1);
            System.out.printf("\u001B[36m╠════╤════╤════╤════╤════╤════╤════╤════╤════╣\u001B[0m");
        for (int i = 0; i < 3; i++) {
                if (i!=0) {
                         System.out.print("\u001B[36m╟────┼────┼────┼────┼────┼────┼────┼────┼────╢\u001B[0m");   
                }
                System.out.println("");
                for (int j = 0; j < 9; j++) {
                    if (j == 0) {
                        if (carton[i][j][dimension] < 10) {
                            if (carton[i][j][dimension] == 0) {
                                System.out.print("\u001B[36m║\u001B[36m▓▓▓\u001B[0m");
                            }else {
                                System.out.print("\u001B[36m║\u001B[0m "+carton[i][j][dimension]+" "); 
                            }
                        } else {
                           System.out.print("\u001B[36m║\u001B[0m "+carton[i][j][dimension]); 
                        }
                    } else{
                        if (carton[i][j][dimension] < 10) {
                            if (carton[i][j][dimension] == 0) {
                                System.out.print(" \u001B[36m│\u001B[36m▓▓▓\u001B[0m");
                            } else {
                                System.out.print(" \u001B[36m│\u001B[0m "+carton[i][j][dimension]+" ");
                            }
                        } else{
                            System.out.print(" \u001B[36m│\u001B[0m "+carton[i][j][dimension]);   
                        }  
                    }
                    if (j == 8) {
                           System.out.print(" \u001B[36m║\u001B[0m");   
                    }
                }
                 System.out.println("");
        }
                System.out.print("\u001B[36m╚════╧════╧════╧════╧════╧════╧════╧════╧════╝\u001B[0m");   
                System.out.println("");
    }
    /**
     * Comprobamos la linea de todos los cartones, en caso de acertar una linea en un carton devolvemos un boolean para que no se vuelva a comprobar la linea y saca por pantalla "LINEA"
     * @param cartonCopia
     * @param cartones
     * @return linea
     */
    public static boolean comprobarLinea(int[][][] cartonCopia, int cartones){
        boolean linea = false;
        int k = 0;
        for (int dimension = 0; dimension < cartones; dimension++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    if (cartonCopia[i][j][dimension] == -1) {
                        k++;
                    }
                    if (k == 5) {
                        
                        System.out.printf("\n"+
                                           "\u001B[33m +-+-+-+-+-+-+-+\n" +
                                           "\u001B[33m ¡L  I  N  E  A!\n" +
                                           "\u001B[33m  C A R T O N %d\n" +
                                           "\u001B[33m +-+-+-+-+-+-+-+\n" +
                                           "\u001B[0m",dimension+1);
                        linea = true;
                        i=3;
                        j=9;
                        dimension=cartones;
                    }
                }
                k = 0;
            }
        }
        return linea;
    }
    /**
     * Comprobamos el bingo de cada carton, en caso de que algun carton tenga bingo devolvera un boolean para que no siga comprobando y saque por pantalla un mensaje que ponga "BINGO"
     * @param cartonCopia
     * @param cartones
     * @return bingo
     */
    public static boolean comprobarBingo(int[][][] cartonCopia, int cartones){
        boolean bingo = false;
        int k = 0;
        for (int dimension = 0; dimension < cartones; dimension++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    if (cartonCopia[i][j][dimension] == -1) {
                        k++;
                    }
                    if (k == 15) {
                        System.out.printf("\n"+
                                           "\u001B[33m +-+-+-+-+-+-+-+\n" +
                                           "\u001B[33m ¡B  I  N  G  O!\n" +
                                           "\u001B[33m  C A R T O N %d\n" +
                                           "\u001B[33m +-+-+-+-+-+-+-+\n" +
                                           "\u001B[0m",dimension+1);
                        bingo = true;
                        i=3;
                        j=9;
                        dimension=cartones;
                    }
                }
            }
            k = 0;
        }
        return bingo;
    }
    /**
     * Un metodo para sacar por pantalla el cartel con el nombre del Juego
     */
    public static void cartel (){
        
        System.out.println(
        "\u001b[36m██╗ ██████╗ ██╗███╗   ██╗ ██████╗  ██████╗  ██╗\n" +
        "\u001b[36m╚═╝ ██╔══██╗██║████╗  ██║██╔════╝ ██╔═══██╗ ██║\n" +
        "\u001b[36m██╗ ██████╔╝██║██╔██╗ ██║██║  ███╗██║   ██║ ██║\n" +
        "\u001b[36m██║ ██╔══██╗██║██║╚██╗██║██║   ██║██║   ██║ ╚═╝\n" +
        "\u001b[36m██║ ██████╔╝██║██║ ╚████║╚██████╔╝╚██████╔╝ ██╗\n" +
        "\u001b[36m╚═╝ ╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝  ╚═════╝  ╚═╝\n" +
        "                                          \n" +
        "");
        System.out.println("\u001b[0m");
    }
}
