
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.*;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        Scanner intr = new Scanner(System.in);

        int opcion = 0;

        int identificacion = 0;
        String nombre = "";
        String tituloLibro = "";

        Cola cola1 = new Cola();

        do{
            try {
                log.info("* * * * *");
                log.info("* Menu  *");
                log.info("* * * * *");
                log.info("1. Insertar libro");
                log.info("2. Extraer libro");
                log.info("3. Mostrar libros");
                log.info("4. Salir");
                log.info("Su opcion es: ");
                opcion = intr.nextInt();

                switch (opcion){
                    case 1:
                        log.info("Ingrese el libro");
                        tituloLibro = intr.next();
                        log.info("Ingrese su nombre");
                        nombre = intr.next();
                        log.info("Ingrese su identidicacion");
                        identificacion = intr.nextInt();
                    break;

                    case 2:
                        if(!cola1.ColaVacia()){
                         /* log.info("Se extrajo el libro " + cola1.Extraer());*/
                        }else{
                            log.info("La cola esta vacia");
                        }
                    break;

                    case 3:
                        cola1.MostrarContenido();
                    break;

                    case 4:
                        opcion = 4;
                    break;

                    default:
                        log.info("Opcion no disponible");
                    break;
                }

            }catch(NumberFormatException e){

            }

        }while(opcion != 4);

    }
}
