
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



        ClaseLista lista1 = new ClaseLista();
        NumerosRepetidos listita = new NumerosRepetidos();

        int opcion = 0;

        do{

            try{
                log.info("1. Ingrese un numero");
                log.info("2. Mostrar lista");
                log.info("3. Salir");

                log.info("Su opcion es: ");
                opcion = intr.nextInt();

                switch(opcion){
                    case 1:
                        try{
                            log.info("Ingrese un numero");
                            int numero = intr.nextInt();
                            lista1.agregaNodo(numero);
                        }catch(NumberFormatException n){
                            log.info("Error");
                        }
                        break;
                    case 2:
                        lista1.mostrarLista();
                        lista1.mayorMenor();
                        break;
                }

            }catch (Exception e){

            }

        }while(opcion != 3);


        listita.Agregar(1);
        listita.Agregar(2);
        listita.Agregar(0);
        listita.Agregar(2);
        listita.Agregar(15);
        listita.Agregar(2);



        listita.mostrar();

    }

}

