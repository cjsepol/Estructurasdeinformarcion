package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class ListaDoble {

    static Logger log = Logger.getLogger(Main.class.getName());

    NodoDoble primero;
    NodoDoble ultimo;

    public ListaDoble(){
        primero = null;
        ultimo = null;
    }
    public void IngresarNodo(int dato){
        NodoDoble nuevo = new NodoDoble();
      nuevo.dato = dato;

      if(primero == null){
        primero = nuevo;
        primero.siguiente = null;
        primero.anterior = null;
        ultimo = primero;
      }else{
          ultimo.siguiente = nuevo;
          nuevo.anterior = ultimo;
          nuevo.siguiente = null;
          ultimo = nuevo;
      }

    }
    public void RecorreLista(){
        NodoDoble actual = new NodoDoble();
        actual = ultimo;
        while(actual != null){
          log.info(actual.dato);
          actual = actual.anterior;
        }
    }
}
