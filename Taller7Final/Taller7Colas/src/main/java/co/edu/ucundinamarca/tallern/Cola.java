package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class Cola {

    static Logger log = Logger.getLogger(Main.class.getName());

    private Nodo cabeza, ultimo;


    public Cola(){
        cabeza = null;
        ultimo = null;

    }
    public boolean ColaVacia(){
        if(cabeza == null){
           return true;
        }else{
            return false;
        }
    }
    public void Insertar(String identificacion, String nombre, String tituloLibro){
      Nodo nuevoNodo = new Nodo();

      nuevoNodo.identificacion = identificacion;
      nuevoNodo.nombre = nombre;
      nuevoNodo.tituliLibro = tituloLibro;

      nuevoNodo.siguiente = null;

      if(ColaVacia()){
        cabeza = nuevoNodo;
        ultimo = nuevoNodo;
      }else{
          ultimo.siguiente = nuevoNodo;
          ultimo = nuevoNodo;
      }
    }
    public void MostrarContenido(){
      Nodo actual = new Nodo();
      actual = cabeza;

      do{
        log.info("ID " + actual.identificacion + " Nombre: " + actual.nombre + " Libro: " + actual.tituliLibro);
        actual = actual.siguiente;

      }while(actual != cabeza);
    }
}
