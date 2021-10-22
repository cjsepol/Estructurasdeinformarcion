
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner intr = new Scanner(System.in);

        lista lista1 = new lista();
        int opcion;

        do{
            log.info("Elija una opcion: ");
            log.info("1. Ingresar un nodo");
            log.info("2. Mostrar la lista");
            log.info("3. Buscar en la lista");
            log.info("4. Mosdificar");
            log.info("5. Salir");

            log.info("Su opcion es: ");
            opcion = intr.nextInt();

            switch(opcion){
                case 1:
                    log.info("Ingrese un nodo");
                    int dato = intr.nextInt();
                    lista1.ingresar(dato);
                break;

                case 2:
                    log.info("Mostrar lista");
                    lista1.mostrar();
                break;

                case 3:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar");
                    int dato3 = intr.nextInt();
                    lista1.buscar(dato3);
                break;

                case 4:
                    log.info("Ingrese un dato a modificar");
                    int dato4 = intr.nextInt();
                    lista1.modificar(dato4);
                break;
            }

        }while(opcion != 5);

    }

}
