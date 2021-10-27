package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Imprime {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void ImprimeListaSimple(){

        Scanner intr = new Scanner(System.in);

        Lista lista1 = new Lista();

        int opcion = 0;

        do{

            try{
                log.info("1. Ingresar cajas");
                log.info("2. MOstrar cantidad de cajas en bodega");
                log.info("3. Salir");

                log.info("Su opcion es: ");
                opcion = intr.nextInt();

                switch(opcion){
                    case 1:
                        try{
                            log.info("Ingrese la cantidad de cajas");
                            int cajas = intr.nextInt();
                            lista1.agregaNodo(cajas);
                        }catch(NumberFormatException n){
                            log.info("Error");
                        }
                        break;
                    case 2:
                        lista1.mostrarLista();
                        break;
                }

            }catch (Exception e){

            }

        }while(opcion != 3);
    }
    public static void ImprimeListaDobleCircular(){
        Scanner intr = new Scanner(System.in);

        ListaDobleCircular lista1 = new ListaDobleCircular();
        int opcion;

        do{
            log.info("Elija una opcion: ");
            log.info("1. Ingresar un articulo a la tienda");
            log.info("2. Mostrar la lista de articulos");
            log.info("3. Buscar en la tienda");
            log.info("4. Mosdificar articulo");
            log.info("5. Salir");

            log.info("Su opcion es: ");
            opcion = intr.nextInt();

            switch(opcion){
                case 1:
                    log.info("Ingrese un articulo");
                    String dato = intr.next();
                    lista1.Ingresar(dato);
                    break;

                case 2:
                    log.info("Mostrar lista de articulos");
                    lista1.Mostrar();
                    break;

                case 3:
                    log.info("Buscar articulos");
                    log.info("Ingrese un articulo a buscar");
                    String dato3 = intr.next();
                    lista1.Buscar(dato3);
                    break;

                case 4:
                    log.info("Ingrese un articulo a modificar");
                    String dato4 = intr.next();
                    lista1.Modificar(dato4);
                    break;
            }

        }while(opcion != 5);
    }
    public static void ImprimeListaCircular(){

        Scanner intr = new Scanner(System.in);

        ListaLC listita =new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado=false;
        do{
            try{

                log.info("1. Agregar peso del producto al inicio");
                log.info("2. Eliminar un dato");
                log.info("3. Mostrar elementos pesados");
                log.info("4. Salir");

                log.info("Si opcion es: ");
                opcion = intr.nextInt();

                switch (opcion){
                    case 1:
                        log.info("Ingrese un peso en KG");
                        elemento = intr.nextInt();
                        listita.insertar(elemento);
                        log.info("Agregando peso del producto");
                        break;
                    case 2:
                        if (!listita.estaVacia()){

                            log.info("Ingrese el dato a eliminar");
                            elemento = intr.nextInt();
                            listita.eliminar(elemento);
                            log.info("Eliminando dato");

                            eliminado= listita.eliminar(elemento);

                            if (eliminado){
                                log.info("El dato eliminado es: " + elemento);

                            }else {
                                log.info("El elemento " + elemento + " no esta en la lista");

                            }
                        }else {
                          log.info("No hay datos");
                        }

                        break;
                    case 3:
                        if (!listita.estaVacia()){
                            listita.mostrarLista();
                        }else{
                            log.info("Aun no hay nodos");
                        }
                        break;
                    case 4:
                        log.info("Aplicacion finalizada, salir");

                        break;
                    default:
                      log.info("La opcion no esta en el menu");
                }
            }catch (NumberFormatException n){
                log.info("Error");
            }
        }while (opcion !=4);

    }
    public static void ImprimeListaDoble(){

        ListaDoble id = new ListaDoble();

        id.IngresarNodo(34);
        id.IngresarNodo(76);
        id.IngresarNodo(27);
        id.IngresarNodo(69);
        id.IngresarNodo(55);
        id.IngresarNodo(43);

        id.RecorreLista();
    }
}
