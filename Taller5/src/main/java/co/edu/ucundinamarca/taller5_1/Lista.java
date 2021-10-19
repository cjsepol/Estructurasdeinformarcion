package co.edu.ucundinamarca.taller5_1;

public class Lista {
    protected Nodo inicio, fin;
    public Lista() {
        inicio = null;
        fin = null;
    }
    boolean estaVacia() {
        return inicio == null;
    }

    public void agregarAlInicio(Object elemento) {
        Nodo nuevo = new Nodo((Integer) elemento, inicio, fin);
        if (!estaVacia()) {
            inicio = nuevo;
            inicio.sig = inicio;
            inicio.ant = inicio;
            fin = inicio;
        } else {
            Nodo aux = inicio;
            while (aux.sig != inicio) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            nuevo.ant = aux;
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }
    public void mostrarListaSig() {
        Nodo aux = inicio;
        if (aux.sig == inicio && aux.ant == fin) {
            System.out.print("[" + aux.dato + "]--->");
        } else {
            while (aux.sig != inicio) {
                System.out.print("[" + aux.dato + "]--->");
                aux = aux.sig;
                if (aux.sig == inicio) {
                    System.out.print("[" + aux.dato + "]--->");
                }
            }
        }
    }
    public void mostrarListaAnt() {
        Nodo aux = fin;
        if (aux.sig == inicio && aux.ant == fin) {
            System.out.print("[" + aux.dato + "]--->");
        } else {
            while (aux.ant != fin) {
                System.out.print("[" + aux.dato + "]--->");
                aux = aux.ant;
                if (aux.ant == fin) {
                    System.out.print("[" + aux.dato + "]--->");
                }
            }
        }
    }
}


