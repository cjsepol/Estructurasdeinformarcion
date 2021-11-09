package co.edu.ucundinamarca.tallern;


import java.util.logging.Logger;

public class Deque implements DequeDL {

    static Logger log = Logger.getLogger(Main.class.getName());


    NodoD cola;
    NodoD cabeza;
    public int contador;
    String organizar;

    public Deque() {

        cola=null;
        cabeza=null;
        contador=0;

    }


    @Override
    public void insertarIncial(Object elemento) {

    }

    @Override
    public void insertarInicial(Object elemento) {
        if(cabeza==null){
            cabeza= new NodoD();
            cabeza.elemento=elemento;
            cola=cabeza;

        }else{
            NodoD nuevo= new NodoD();
            nuevo.elemento=elemento;
            nuevo.siguiente=cabeza;
            cabeza.anterior=nuevo;
            cabeza=nuevo;
        }
        contador++;
    }

    @Override
    public void insertarFinal(Object elemento) {
        if(cola==null){
            cola= new NodoD();
            cola.elemento=elemento;
            cabeza=cola;

        }else{
            NodoD nuevo= new NodoD();
            nuevo.elemento=elemento;
            nuevo.anterior=cola;
            cola.siguiente=nuevo;
            cola=nuevo;
        }
        contador++;
    }

    @Override
    public void removerIncial() {

    }


    @Override
    public void removerInicial() {
        cabeza=cabeza.siguiente;
        cabeza.anterior=null;
    }

    @Override
    public void removerFinal() {
        cola=cola.anterior;
        cola.siguiente=null;

    }

    @Override
    public int tamaño() {
        return contador;
    }

    public String toString(){
        String t="cabeza[";
        for(NodoD h= cabeza;h!=null;h=h.siguiente){
            t+=h.elemento+"-";
        }
        return t+"]cola";
    }

}
