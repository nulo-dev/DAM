import java.util.Scanner;


/**
 *
 * @author nmartinez
 * 
 * TODOS LOS DERECHOS RESERVADOS POR NIL MARTINEZ
 * 
 */
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int filas,columnas,x,o;
        int numjug = 1;
        int contjugadores=0;
        int ju = 0;
        jugador jugador[] = new jugador[2];
        boolean salir =false;
        boolean lleno = false;
        boolean correcto = true;
        boolean ganadorx = false;
        boolean ganadoro = false;
        boolean bucle = true;
        boolean empate = false;
        boolean repetir = true;
        String respuesta = "";
        // ESTO ES UNA TONTERIA PARA PONER UN CARTELITO AL INICIO DEL PROGRAMA CON EL NOMBRE DEL JUEGO :D //
        System.out.println("\033[36m $$$$$$\\   $$$$$$\\  $$\\   $$\\ $$$$$$$$\\  $$$$$$\\ $$$$$$$$\\  $$$$$$\\        $$\\   $$\\ ");
        System.out.println("\033[36m$$  __$$\\ $$  __$$\\ $$$\\  $$ |$$  _____|$$  __$$\\\\__$$  __|$$  __$$\\       $$ |  $$ |");
        System.out.println("\033[36m$$ /  \\__|$$ /  $$ |$$$$\\ $$ |$$ |      $$ /  \\__|  $$ |   $$ /  $$ |      $$ |  $$ |");
        System.out.println("\033[36m$$ |      $$ |  $$ |$$ $$\\$$ |$$$$$\\    $$ |        $$ |   $$$$$$$$ |      $$$$$$$$ |");
        System.out.println("\033[36m$$ |      $$ |  $$ |$$ \\$$$$ |$$  __|   $$ |        $$ |   $$  __$$ |      \\_____$$ |");
        System.out.println("\033[36m$$ |  $$\\ $$ |  $$ |$$ |\\$$$ |$$ |      $$ |  $$\\   $$ |   $$ |  $$ |            $$ |");
        System.out.println("\033[36m\\$$$$$$  | $$$$$$  |$$ | \\$$ |$$$$$$$$\\ \\$$$$$$  |  $$ |   $$ |  $$ |            $$ |");
        System.out.println("\033[36m \\______/  \\______/ \\__|  \\__|\\________| \\______/   \\__|   \\__|  \\__|            \\__|");
        System.out.println("\033[37m");
        
        
        while(repetir){
        ganadorx = false;
        ganadoro = false;    
        // ESTE FOR CAMBIA EL NUMERO DEL JUGADOR PARA PODER INGRESAR LOS DOS JUGADORES //
        for (ju = 0; ju < jugador.length; ju++) {
            System.out.printf("\033[33mIngrese el nombre del jugador %d :",numjug);
            jugador[ju] = new jugador();
            jugador[ju].nom = input.nextLine();
            numjug++;
        }
         // AQUI ESPECIFICAMOS EL NUMERO DE FILAS Y COLUMNAS QUE QUEREMOS PARA EL JUEGO//
        
        System.out.println("\033[33mIngrese quantas filas quiere: ");
        filas = input.nextInt();
        System.out.println("\033[33mIngrese quantas columnas quiere: ");
        columnas = input.nextInt();
        System.out.print("\033[37m");
        int vertical = filas+1;
        int contador = 1;
        int contadorx = 0;
        int contadoro = 0;
        int contadorempate = 0;
        // EL TABLERO //
        int tabla[][] = new int[filas][columnas+1];

        // PRINTEAMOS EL TABLERO VACIO PARA QUE EL PRIMER JUGADOR VEA COMO ES //
        System.out.print("\033[37m");
        for (int i = 0; i < filas; i++) {
            // AQUI ESTAMOS PONIENDO LAS LINEAS HORIZONTALES //
            System.out.print("  ");
            for (int j = 0; j <columnas; j++) {
                System.out.print("────");
            }
            System.out.println();
            // EL "vertical" ES PARA COLOCAR LOS NUMEROS DE ARRIBA A BAJO //
            vertical--;
            System.out.print(vertical);
            for (int j = 0; j < columnas; j++) {
                // AQUI ASIGNAMOS A TODAS LAS CASILLAS EL NUMERO 0 (EXCEPTO A LAS QUE TIENEN LOS NUMEROS PARA INDICAR LAS POSICONES) //
                tabla[i][j] = 0;
            }
            for (int j = 0; j < columnas; j++) {
                if (tabla[i][j] == 0) {
                    // AQUI MIRAMOS SI LA COLUMNA TIENE UN 0 SI ES ASI PRINTEARA EL FORMATO DE LA TABLA //
                 System.out.print("|   ");   
                }
            }
            System.out.println("|");
            // AQUI LO QUE HACEMOS ES CHEQUEAR SI I ES IGUAL AL ULTIMO DIGITO DE LAS FILAS PARA PODER PRINTEAR LA ULTIMA FILA PERO CON LA ENUMERACION //
            if (i == filas-1) {
                System.out.print("  ");
                for (int j = 0; j <columnas; j++) {
                System.out.print("────");
                }
                System.out.println();
                System.out.print("  ");
                for (int j = 0; j < columnas; j++) {
                    System.out.print(" "+contador+"  ");
                    contador++;
                }
            }
        }
        bucle = true;
        // UN WHILE PARA QUE SE REPITA TODO EL RATO HASTA QUE GANE ALGUIEN LA PARTIDA //
       while(bucle){
           vertical = filas+1;
           contador = 1;
           correcto = true;
           // UN WHILE PARA QUE EN CASO DE QUE EL USUARIO INTRODUZCA UN DIGITO MAL O INTRDUZCA LA FICHA EN UNA CASILLA LLENA LE VUELVA A PREGUNTAR DONDE QUIERE TIRAR //
          while(correcto){
              // AQUI COMPROBAMOS SI EL NUMERO DE "contjugadores" ES PAR O IMPAR Y ASI INTERCALAR ENTRE UN JUGADOR Y OTRO //
              if (contjugadores % 2 == 0) {
                  // AQUI INGRESAMOS EL NOMBRE DEL JUGADOR //
                System.out.printf("%n%s \033[33mIngrese donde quiere poner la ficha 'X' [1][%s]: ",jugador[0].nom,filas,columnas);
                contjugadores++;
                int fitxa = input.nextInt();
                
                // COMPROBACION PARA VER SI EL NUMERO ESTA EN EL RANGO DE LA TABLA. //
                  if (fitxa <= 0 || fitxa > columnas) {
                      correcto = true;
                      contjugadores--;
                      System.out.println("\n\033[31m \u274c El numero que ha ingresado no es correcto.");
                      System.out.print("\033[37m");
                  } else {
                      correcto = false;
                  }
                  // SI CORRECTO ES "false" ENTRAREMOS AL FOR Y RECORREREMOS LA TABLA PARA COLOCAR LAS "X" O LAS "O" //
                  if (!correcto) {
                    for (int k = filas-1; k >= 0; k--) {
                        // CON ESTE IF REVISAMOS SI LA FILA DE ARRIBA DEL TODO ESTA LLENA, EN CASO DE ESTAR LLENA TE DIRA UN MENSAJE Y TE VOLVER A PEDIR QUE INTRODUZCAS EN NUMERO //
                        if (tabla[0][fitxa-1] != 0){
                          System.out.printf("%n\033[31m \u274c La posicion %d esta llena, pruebe con otra.%n",fitxa);
                          System.out.print("\033[37m");
                          k=0;
                          correcto = true;
                          contjugadores--;
                          // CON ESTE IF REVISAMOS SIN LA FILA ESTA VACIA EN CASO DE ESTAR VACIA LE ASIGNARA UN UNO //
                        } else if (tabla[k][fitxa-1] == 0) {
                          tabla[k][fitxa-1] = 1;
                          k=0;
                          correcto = false;
                        } 
                     }
                    // CON ESTOS DOS FOR RECORREMOS LA ARRAY ENTERA HORIZONTALMENTE //
                    for (int i = 0; i < filas; i++) {      

                        for (int j = 0; j < columnas; j++) {
                            // EN ESTOS 3 IF REVISAMOS SI LA POSICION [I] (FILAS) Y LA POSICION [j] (COLUMNAS) TIENEN UN "0","1" O UN "2" //
                            if (tabla[i][j] == 0) {
                                // RESETEAMOS EL CONTADOR DE X A 0 POR QUE ESO QUIERE DECIR QUE LAS X NO ESTAN COMPLETAS //
                                contadorx = 0;
                            } else if(tabla[i][j] == 1) {
                                // SUMAMOS EL CONTADOR DE X POR QUE HEMOS PASADO POR UNA DE ELLAS //
                                contadorx++;
                                // EN CASO DE QUE EL CONTADOR DE X TENGA 4 QUERRA DECIR QUE EL JUGADOR CON LAS FICHAS X HA GANADO //
                                if (contadorx == 4) {
                                    ganadorx = true;
                                    j = columnas;
                                }
                                // AQUI EL CONTADOR DE X SE RESETEA A 0 POR QUE QUIERE DECIR QUE SE HA ENCONTRADO UN NUMERO QUE NO CORRESPONDE CON LAS X //
                            } else if(tabla[i][j] == 2) {
                                contadorx = 0;
                            }

                        }
                        // RESETEAMOS EL CONTADOR DE X POR QUE CADA VEZ QUE SALGA DEL FOR DE COLUMNAS CAMBIARA DE FILA OSEA QUE TENEMOS QUE REINICIAR EL CONTADOR POR QUE SI NO ESTARA SUMANDO LAS X DE LA FILA DE ABAJO //
                        contadorx = 0;
                    }
                    // ESTE FOR RECORRE EN VERTICAL //
                    for (int i = 0; i <columnas; i++) {
                        // EN ESTOS 3 IF REVISAMOS SI LA POSICION [I] (COLUMNAS) Y LA POSICION [j] (FILAS) TIENEN UN "0","1" O UN "2" //
                        for (int j = 0; j <filas; j++) {
                            if (tabla[j][i] == 0) {
                                // RESETEAMOS EL CONTADOR DE X A 0 POR QUE ESO QUIERE DECIR QUE LAS X NO ESTAN COMPLETAS //
                                contadorx = 0;
                            } else if (tabla[j][i] == 1) {
                                // SUMAMOS EL CONTADOR DE X POR QUE HEMOS PASADO POR UNA DE ELLAS //
                                contadorx++;
                                // EN CASO DE QUE EL CONTADOR DE X TENGA 4 QUERRA DECIR QUE EL JUGADOR CON LAS FICHAS X HA GANADO //
                                if (contadorx == 4) {
                                    ganadorx = true;
                                    j = filas;
                                }
                                // AQUI EL CONTADOR DE X SE RESETEA A 0 POR QUE QUIERE DECIR QUE SE HA ENCONTRADO UN NUMERO QUE NO CORRESPONDE CON LAS X //
                            } else if (tabla[j][i] == 2) {
                                contadorx = 0;
                            }
                        }
                        // RESETEAMOS EL CONTADOR DE X POR QUE CADA VEZ QUE SALGA DEL FOR DE FILAS CAMBIARA DE COLUMNA OSEA QUE TENEMOS QUE REINICIAR EL CONTADOR POR QUE SI NO ESTARA SUMANDO LAS X DE LA COLUMNA DE ABAJO //
                        contadorx = 0;
                    }
                      
                     // ESTE FOR RECORRE LA ARRAY EN DIAGONAL HACIA ARRIBA
                        for(int j = 3; j < tabla.length; j++){
                            // AQUI SUMAS LA J (OSEA LAS FILAS)
                                for(int l = 0; l < tabla[0].length - 3; l++){
                                    // AQUI SUMAS LA L (OSEA LAS COLUMNAS) 
                                        // EN ESTE IF COMROBAMOS QUE J Y L SEAN IGUAL A 1 (OSEA "X") EN LOS SIGUENTES AND RESTAMOS LA J Y SUMAMOS LA L HACIENDO ASI UNA DIAGONAL DE TODA LA VIDA //
                                        if (tabla[j][l] == 1   && 
                                                tabla[j-1][l+1] == 1 &&
                                                tabla[j-2][l+2] ==1 &&
                                                tabla[j-3][l+3] == 1){
                                                ganadorx = true;
                                        }
                                }
                        }
                     // ESTE FOR RECORRE LA ARRAY EN DIAGONAL HACIA ABAJO
                        for(int j = 0; j < tabla.length - 3; j++){
                             // AQUI SUMAS LA J (OSEA LAS FILAS)
                                for(int l = 0; l < tabla[0].length - 3; l++){
                                    // AQUI SUMAS LA L (OSEA LAS COLUMNAS) 
                                        // EN ESTE IF COMROBAMOS QUE J Y L SEAN IGUAL A 1 (OSEA "X") EN LOS SIGUENTES AND SUMAMOS LA J Y RESTAMOS LA L HACIENDO ASI UNA DIAGONAL DE TODA LA VIDA PERO HACIA ABAJO //
                                        if (tabla[j][l] == 1   && 
                                                tabla[j+1][l+1] == 1 &&
                                                tabla[j+2][l+2] == 1 &&
                                                tabla[j+3][l+3] == 1){
                                                ganadorx = true;
                                        }
                                }
                        }
            }

                  
           } else {
                  // AQUI INGRESAMOS EL NOMBRE DEL JUGADOR //
                System.out.printf("%n%s \033[33mIngrese donde quiere poner la ficha 'O' [1][%s]: ",jugador[1].nom,filas,columnas);
                contjugadores++;
                int fitxa = input.nextInt();
                
                // COMPROBACION PARA VER SI EL NUMERO ESTA EN EL RANGO DE LA TABLA. //
                  if (fitxa <= 0 || fitxa > columnas) {
                      correcto = true;
                      contjugadores--;
                      System.out.println("\n\033[31m \u274c El numero que ha ingresado no es correcto.");
                      System.out.print("\033[37m");
                  } else {
                      correcto = false;
                  }
                
                 // SI CORRECTO ES "false" ENTRAREMOS AL FOR Y RECORREREMOS LA TABLA PARA COLOCAR LAS "X" O LAS "O" //
                if (!correcto) {
                    for (int k = filas-1; k >= 0; k--) {
                        // CON ESTE IF REVISAMOS SI LA FILA DE ARRIBA DEL TODO ESTA LLENA, EN CASO DE ESTAR LLENA TE DIRA UN MENSAJE Y TE VOLVER A PEDIR QUE INTRODUZCAS EN NUMERO //
                        if (tabla[0][fitxa-1] != 0){
                          System.out.printf("%n\033[31m \u274c La posicion %d esta llena, pruebe con otra.%n",fitxa);
                          System.out.print("\033[37m");
                          k=0;
                          correcto = true;
                          contjugadores--;
                          // CON ESTE IF REVISAMOS SIN LA FILA ESTA VACIA EN CASO DE ESTAR VACIA LE ASIGNARA UN UNO //
                        } else if (tabla[k][fitxa-1] == 0) {
                          tabla[k][fitxa-1] = 2;
                          k=0;
                          correcto = false;
                        }
                     }
                     // CON ESTOS DOS FOR RECORREMOS LA ARRAY ENTERA //
                   for (int i = 0; i < filas; i++) {      

                        for (int j = 0; j < columnas; j++) {
                            // EN ESTOS 3 IF REVISAMOS SI LA POSICION [I] (FILAS) Y LA POSICION [j] (COLUMNAS) TIENEN UN "0","1" O UN "2" //
                            if (tabla[i][j] == 0) {
                                contadoro = 0;
                                 // RESETEAMOS EL CONTADOR DE O A 0 POR QUE ESO QUIERE DECIR QUE LAS O NO ESTAN COMPLETAS //
                            } else if(tabla[i][j] == 1) {
                                // AQUI EL CONTADOR DE O SE RESETEA A 0 POR QUE QUIERE DECIR QUE SE HA ENCONTRADO UN NUMERO QUE NO CORRESPONDE CON LAS O //
                                contadoro = 0;
                            } else if(tabla[i][j] == 2) {
                                // SUMAMOS EL CONTADOR DE O POR QUE HEMOS PASADO POR UNA DE ELLAS //
                                contadoro++;
                                // EN CASO DE QUE EL CONTADOR DE O TENGA 4 QUERRA DECIR QUE EL JUGADOR CON LAS FICHAS O HA GANADO //
                                if (contadoro == 4) {
                                    ganadoro = true;
                                    j = columnas;
                                }
                            }

                        }
                        // RESETEAMOS EL CONTADOR DE O POR QUE CADA VEZ QUE SALGA DEL FOR DE COLUMNAS CAMBIARA DE FILA OSEA QUE TENEMOS QUE REINICIAR EL CONTADOR POR QUE SI NO ESTARA SUMANDO LAS O DE LA FILA DE ABAJO //
                        contadoro = 0;
                    }
                    // ESTE FOR RECORRE EN VERTICAL //
                    for (int i = 0; i <columnas; i++) {
                        // EN ESTOS 3 IF REVISAMOS SI LA POSICION [I] (COLUMNAS) Y LA POSICION [j] (FILAS) TIENEN UN "0","1" O UN "2" //
                        for (int j = 0; j <filas; j++) {
                            if (tabla[j][i] == 0) {
                                contadoro = 0;
                                 // RESETEAMOS EL CONTADOR DE O A 0 POR QUE ESO QUIERE DECIR QUE LAS O NO ESTAN COMPLETAS //
                            } else if(tabla[j][i] == 1) {
                                // AQUI EL CONTADOR DE O SE RESETEA A 0 POR QUE QUIERE DECIR QUE SE HA ENCONTRADO UN NUMERO QUE NO CORRESPONDE CON LAS O //
                                contadoro = 0;
                            } else if(tabla[j][i] == 2) {
                                // SUMAMOS EL CONTADOR DE O POR QUE HEMOS PASADO POR UNA DE ELLAS //
                                contadoro++;
                                // EN CASO DE QUE EL CONTADOR DE O TENGA 4 QUERRA DECIR QUE EL JUGADOR CON LAS FICHAS O HA GANADO //
                                if (contadoro == 4) {
                                    ganadoro = true;
                                    j = columnas;
                                }
                            }
                        }
                        // RESETEAMOS EL CONTADOR DE O POR QUE CADA VEZ QUE SALGA DEL FOR DE FILAS CAMBIARA DE COLUMNA OSEA QUE TENEMOS QUE REINICIAR EL CONTADOR POR QUE SI NO ESTARA SUMANDO LAS O DE LA COLUMNA DE ABAJO //
                        contadorx = 0;
                    }
                     // ESTE FOR RECORRE LA ARRAY EN DIAGONAL HACIA ARRIBA
                        for(int j = 3; j < tabla.length; j++){
                            // AQUI SUMAS LA J (OSEA LAS FILAS)
                                for(int l = 0; l < tabla[0].length - 3; l++){
                                    // AQUI SUMAS LA L (OSEA LAS COLUMNAS) 
                                        // EN ESTE IF COMROBAMOS QUE J Y L SEAN IGUAL A 2 (OSEA "O") EN LOS SIGUENTES AND RESTAMOS LA J Y SUMAMOS LA L HACIENDO ASI UNA DIAGONAL DE TODA LA VIDA //
                                        if (tabla[j][l] == 2   && 
                                                tabla[j-1][l+1] == 2 &&
                                                tabla[j-2][l+2] == 2 &&
                                                tabla[j-3][l+3] == 2){
                                                ganadoro = true;
                                        }
                                }
                        }
                     // ESTE FOR RECORRE LA ARRAY EN DIAGONAL HACIA ABAJO
                        for(int j = 0; j < tabla.length - 3; j++){
                             // AQUI SUMAS LA J (OSEA LAS FILAS)
                                for(int l = 0; l < tabla[0].length - 3; l++){
                                     // AQUI SUMAS LA L (OSEA LAS COLUMNAS) 
                                        // EN ESTE IF COMROBAMOS QUE J Y L SEAN IGUAL A 2 (OSEA "O") EN LOS SIGUENTES AND RESTAMOS LA J Y SUMAMOS LA L HACIENDO ASI UNA DIAGONAL DE TODA LA VIDA //
                                        if (tabla[j][l] == 2   && 
                                                tabla[j+1][l+1] == 2 &&
                                                tabla[j+2][l+2] == 2 &&
                                                tabla[j+3][l+3] == 2){
                                                ganadoro = true;
                                        }
                                }
                        }
                }    
           }
                    // ESTE FOR RECORRE LA ARRAY POR COLUMNAS POSICIONANDOSE EN LA PRIMERA FILA DE TODAS (OSEA LA ULTIMA SI LO MIRAMOS DES DE EL OUTPUT, AL RECORRERLO COMPRUEBA SI FILA 0 COLUMNAS I TIENE ALGO QU NO SEA UN 0 AL SER ASI SE SUMARA A UN CONTADOR, ASI PODREMOS SABER CUANDO EL TABLERO ESTA LLENO POR COMPLETO //
                        for (int i = 0; i < columnas; i++) {
                            if (tabla[0][i] !=0) {
                                contadorempate++;
                                // CON ESTE IF COMPROBAMOS CUANDO EL CONTADOR LLEGA AL MISMO NUMERO DE COLUMNAS ASI SABREMOS SI LA TABLA ESTA COMPLETAMENTE LLENA //
                                if (contadorempate == columnas) {
                                    empate = true;
                                }
                                // EN CASO DE QUE LA COLUMNAS TENGA UN 0 RESETEAREMOS EL CONTADOR //
                            } else{
                                contadorempate = 0;
                            }
                    }
          }       
          System.out.print("\033[37m");
          // CON ESTE FOR PRINTEAREMOS LA TABLA CON LAS X I LAS O DENTRO DE ELLA //
        for (int i = 0; i < filas; i++) {
            System.out.print("  ");
            for (int j = 0; j <columnas; j++) {
                System.out.print("────");
            }
            System.out.println();
            vertical--;
            System.out.print(vertical); 
            

            for (int j = 0; j < columnas; j++) {
                // AQUI COMPROBAMOS QUE NUMEROS HAY EN LA ARRAY PARA PRINTEAR SUS CORRESPONDIENTES SIGNOS (YA SEA LOS ESPACIOS, LA "X" O LA "O")
                if (tabla[i][j] == 0) {
                    System.out.print("|   ");  
                } else if(tabla[i][j] == 1) {
                    System.out.print("| \033[36mX ");
                    System.out.print("\033[37m");
                } else if(tabla[i][j] == 2) {
                    System.out.print("| \033[33mO ");
                    System.out.print("\033[37m");
                }

            }
            System.out.print("\033[37m");
            System.out.println("|");
            
            if (i == filas-1) {
                System.out.print("  ");
                for (int j = 0; j <columnas; j++) {
                System.out.print("────");
                }
                System.out.println();
                System.out.print("  ");
                for (int j = 0; j < columnas; j++) {
                    System.out.print(" "+contador+"  ");
                    contador++;
                }
            }
        }
              if (ganadorx) {
                  System.out.printf("%n\033[32mHa ganado el jugador %s (con las fichas 'X') \uD83D\uDE00 %n",jugador[0].nom);
                  input.nextLine();
                  System.out.println("");
                  System.out.println("¿Quiere jugar otra partida? (si,no)");
                  respuesta = input.nextLine();
                  if (respuesta.toLowerCase().equals("si")) {
                    System.out.println("¡Vamos a ello!");

                    repetir = true;
                    bucle = false;
                  } else if(respuesta.toLowerCase().equals("no")){
                    correcto = false;
                    bucle = false;
                    repetir = false;
                  } else{
                    System.out.println("No ha ingresado una respuesta valida asi que se queda sin partida :D");
                    correcto = false;
                    bucle = false;
                    repetir = false;                      
                  }

              } else if (ganadoro) {
                  System.out.printf("%n\033[32mHa ganado el jugador %s (con las fichas 'O') \uD83D\uDE00 %n",jugador[1].nom);
                  correcto = false;
                  bucle = false; 
                  input.nextLine();
                  System.out.println("");
                  System.out.println("¿Quiere jugar otra partida? (si,no)");
                  respuesta = input.nextLine();
                  if (respuesta.toLowerCase().equals("si")) {
                    System.out.println("¡Vamos a ello!");

                    repetir = true;
                    bucle = false;
                  } else if(respuesta.toLowerCase().equals("no")){
                    correcto = false;
                    bucle = false;
                    repetir = false;
                  } else{
                    System.out.println("No ha ingresado una respuesta valida asi que se queda sin partida :D");
                    correcto = false;
                    bucle = false;
                    repetir = false;
                  }
              } else if (empate){
                  System.out.printf("%n\033[32mNo ha ganado ningún jugador, habéis quedado empate... %n");
                  correcto = false;
                  bucle = false; 
              }
        }
      }  
    }
    
}
