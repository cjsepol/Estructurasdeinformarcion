package co.edu.ucundinamarca.tallern;

import javax.swing.*;
import org.apache.log4j.Logger;

public class ListaLC {

    static Logger log = Logger.getLogger(Main.class.getName());

    NodoLC ultimo;
    public ListaLC(){

        ultimo = null;
    }
    public boolean estaVacia(){

        return ultimo == null;
    }
    public ListaLC insertar(int elemento){
        NodoLC nuevo = new NodoLC(elemento);
        if(ultimo != null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }
    public void mostrarLista(){
        NodoLC auxiliar = ultimo.siguiente;
        String cadena = "";
        do{
            cadena = cadena + "[" + auxiliar.dato + "] -> ";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar != ultimo.siguiente);

        log.info("MOstrando lista circular");
        log.info(cadena);

    }
    public Boolean eliminar(int elemento){
        NodoLC actual;
        boolean encontrado=false;
        actual=ultimo;
        while (actual.siguiente!=ultimo && !encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if (!encontrado){
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.dato==elemento);
        if (encontrado){
            NodoLC auxiliar = actual.siguiente;
            if (ultimo==ultimo.siguiente){
                ultimo=null;
            }else {
                if (auxiliar==ultimo){
                }
                actual.siguiente=auxiliar.siguiente;
            }
            auxiliar=null;
        }
        return encontrado==true;
    }
}
