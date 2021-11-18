package co.edu.ucundinamarca.tallern;

public class NodoArbol <T extends Comparable<T>>{

    private T element;
    private NodoArbol<T> padre;
    private NodoArbol<T> izquierdo;
    private NodoArbol<T> derecho;

    public NodoArbol(T element) {
        this.element = element;
    }
    public NodoArbol(T element, NodoArbol<T> padre, NodoArbol<T> izquierdo, NodoArbol<T> derecho) {
        this.element = element;
        this.padre = padre;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public NodoArbol(T element, NodoArbol<T> padre) {
        this.element = element;
        this.padre = padre;
    }
    public NodoArbol(T element, NodoArbol<T> izquierdo, NodoArbol<T> derecho) {
        this.element = element;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    public NodoArbol<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol<T> padre) {
        this.padre = padre;
    }
    public NodoArbol<T> hijoIzquierdo() {
        return izquierdo;
    }

    public void setHijoIzquierdo(NodoArbol<T> izquierdo) {
        this.izquierdo = izquierdo;
    }
    public NodoArbol<T> hijoDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol<T> derecho) {
        this.derecho = derecho;
    }

}
