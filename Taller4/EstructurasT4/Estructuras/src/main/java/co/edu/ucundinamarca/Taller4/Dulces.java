package co.edu.ucundinamarca.Taller4;


import org.apache.log4j.Logger;
import java.util.Scanner;

public class Dulces {

  static Logger log = Logger.getLogger(Dulces.class.getName());

  Nodo primero;
  Nodo ultimo;

  public Dulces(){
    primero = null;
    ultimo = null;
  }

  public void imprimirIterando(String dulce){

    Nodo nuevoNodo = new Nodo();

    nuevoNodo.dulce = dulce;

    if(primero == null){
      primero = nuevoNodo;
      primero.siguiente = null;
      ultimo = primero;
    }else {
      ultimo.siguiente = nuevoNodo;
      nuevoNodo.siguiente = null;
      ultimo = nuevoNodo;
    }

  }
  public void mostrarLista(){
    Nodo actual = new Nodo();

    actual = primero;

    while(actual != null){
      log.debug(actual.dulce);
      actual = actual.siguiente;
    }


  }





  public static int imprimirSinIterador(String letras, int indice){

    Scanner intr = new Scanner(System.in);

    String[] dulces = new String[10];

    for(int i = 0; i < indice; i++){
      log.debug("Digite el dulce numero " + (i + 1));
      dulces[i] = intr.next();
    }
    log.debug("Los dulces son: ");

    for(int i = 0; i < indice; i++){
      log.debug(dulces[i] + " ");
    }

    return indice;
  }


}
