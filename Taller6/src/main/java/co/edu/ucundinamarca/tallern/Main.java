package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.Scanner;
import javax.swing.*;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner intr = new Scanner(System.in);

        int opcion = 0;

        log.info("Listas, estructuras de informacion");
        log.info("1. Listas simples");
        log.info("2. Listas dobles circulares");
        log.info("3. Listas circulares");
        log.info("4. Listas doblemente enlazadas");

        log.info("Ingrese su opcion: ");

        opcion = intr.nextInt();

        switch(opcion){
            case 1:
                log.info("*******************************");
                log.info("* Lista simple Cajas a bodega *");
                log.info("*******************************");

                Imprime.ImprimeListaSimple();
            break;

            case 2:
                log.info("**************************");
                log.info("* Articulos de la tienda *");
                log.info("**************************");

                Imprime.ImprimeListaDobleCircular();
            break;

            case 3:
                log.info("******************************");
                log.info("* Medir el peso de alimentos *");
                log.info("******************************");

                Imprime.ImprimeListaCircular();
            break;

            case 4:
                log.info("***************");
                log.info("* Lista doble *");
                log.info("***************");

                Imprime.ImprimeListaDoble();
            break;

        }


    }

}
