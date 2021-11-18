package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;



public class ArbolBinario <T extends Comparable<T>>{

    static Logger log = Logger.getLogger(Main.class.getName());


    private NodoArbol<T> arbol;

    public boolean arbolVacio() {
        return arbol == null;
    }
    public NodoArbol<T> arbolRaiz() {
        return arbol;
    }
    public boolean Raiz(NodoArbol<T> nodo) {
        return arbol == nodo;
    }
    public boolean isLeaf(NodoArbol<T> nodo) {
        return nodo.hijoIzquierdo() == null && nodo.hijoDerecho() == null;
    }
    public boolean isInternal(NodoArbol<T> nodo) {
        return !isLeaf(nodo);
    }

    public NodoArbol<T> agregaNodo(NodoArbol<T> origen, T elemento) {

        NodoArbol<T> nodo = null;

        if (arbol == null) {
            nodo = new NodoArbol<>(elemento);
            arbol = nodo;
        } else if (origen == null) {
            log.info("El origen es nulo");
        } else {

            if (origen.getElement().compareTo(elemento) > 0) {
                if (origen.hijoIzquierdo() != null) {
                    nodo = agregaNodo(origen.hijoIzquierdo(), elemento);
                } else {
                    nodo = new NodoArbol<>(elemento);
                    nodo.setPadre(origen);
                    origen.setHijoIzquierdo(nodo);
                }

            } else {
                if (origen.hijoDerecho() != null) {
                    nodo = agregaNodo(origen.hijoDerecho(), elemento);
                } else {
                    nodo = new NodoArbol<>(elemento);
                    nodo.setPadre(origen);
                    origen.setDerecho(nodo);
                }

            }

        }
        return nodo;
    }
    public NodoArbol<T> agregaNodo(T elemento) {

        NodoArbol<T> nodo = null;

        if (arbol == null) {
            nodo = new NodoArbol<>(elemento);
            arbol = nodo;
        }else {

            NodoArbol<T> aux = arbol;
            boolean insertado = false;
            while (!insertado) {
                if (aux.getElement().compareTo(elemento) > 0) {

                    if (aux.hijoIzquierdo() != null) {
                        aux = aux.hijoIzquierdo();
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setPadre(aux);
                        aux.setHijoIzquierdo(nodo);
                        insertado = true;
                    }

                } else {

                    if (aux.hijoDerecho() != null) {
                        aux = aux.hijoDerecho();
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setPadre(aux);
                        aux.setDerecho(nodo);
                        insertado = true;
                    }
                }
            }
        }
        return nodo;
    }
    public void preOrden(NodoArbol<T> nodo) {
        log.info(nodo.getElement().toString());

        if (nodo.hijoIzquierdo() != null) {
            preOrden(nodo.hijoIzquierdo());
        }

        if (nodo.hijoDerecho() != null) {
            preOrden(nodo.hijoDerecho());
        }

    }
    public void inOrden(NodoArbol<T> nodo) {

        if (nodo.hijoIzquierdo() != null) {
            inOrden(nodo.hijoIzquierdo());
        }

        log.info(nodo.getElement().toString());

        if (nodo.hijoDerecho() != null) {
            inOrden(nodo.hijoDerecho());
        }
    }
    public void posOrden(NodoArbol<T> nodo) {
        if (nodo.hijoIzquierdo() != null) {
            posOrden(nodo.hijoIzquierdo());
        }

        if (nodo.hijoDerecho() != null) {
            posOrden(nodo.hijoDerecho());
        }

        log.info(nodo.getElement().toString());
    }


}
