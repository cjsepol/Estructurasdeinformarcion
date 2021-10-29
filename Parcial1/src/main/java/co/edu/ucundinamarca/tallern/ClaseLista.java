package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class ClaseLista {

    static Logger log = Logger.getLogger(Main.class.getName());

    protected ClaseNodo inicio, fin;

    public ClaseLista(){
        inicio = null;
        fin = null;
    }
    public void agregaNodo(int elemento){
        inicio = new ClaseNodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    public void mostrarLista(){
        ClaseNodo recorrer = inicio;
        while(recorrer != null){
            log.info("[" + recorrer.dato +"]--->");
            recorrer = recorrer.siguiente;
        }
    }
    public void mayorMenor(){

        ClaseNodo dato = inicio;

      int mayor = 0, menor = 9999999;

      while(dato != null){
        if((dato.dato) > mayor){
          mayor = dato.dato;
        }
        if((dato.dato) < menor){
          menor = dato.dato;
        }
          dato = dato.siguiente;
      }
      log.info("El mayor elemento es: " + mayor);
        log.info("El menor elemento es: " + menor);

    }



}
