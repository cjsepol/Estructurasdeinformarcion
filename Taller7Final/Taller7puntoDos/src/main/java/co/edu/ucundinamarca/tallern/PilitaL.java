package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class PilitaL {

    static Logger log = Logger.getLogger(Main.class.getName());

    int tamaño=0;
    private NodoL ultimoingreso;
    String lista="";
    public PilitaL() {
        ultimoingreso=null;
        tamaño=0;
    }


    public boolean PilaVacia(){
        return ultimoingreso==null;
    }


    public void insertar (Object elemento){
        NodoL nuevo=new NodoL(elemento);
        nuevo.siguiente=ultimoingreso;
        ultimoingreso=nuevo;
        tamaño++;

    }

    public Object eliminarNodo_Pop(){
        Object auxiliar=ultimoingreso.elemento;
        ultimoingreso=ultimoingreso.siguiente;
        tamaño--;
        return auxiliar;
    }


    public Object mostrarFinElemento_Top(){
        return ultimoingreso.elemento;
    }


    public int tamañoPila(){
        return tamaño;
    }


    public void vaciarPila(){
        while(!PilaVacia()){
            eliminarNodo_Pop();
        }

    }

    public void MostrarValores(){
        NodoL recorrido= ultimoingreso;
        while(recorrido!=null){
            lista +=recorrido.elemento +"\n";
            recorrido=recorrido.siguiente;
        }

        log.info(lista);
        lista="";
    }
}
