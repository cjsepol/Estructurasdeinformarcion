package co.edu.ucundinamarca.taller5_1;

public class Nodo {
  public int dato;
  Nodo sig, ant;

    public Nodo(int elemento){
        this(elemento, null, null);
    }

  public Nodo(int elemento, Nodo s, Nodo a){
    dato = elemento;
    sig = s;
    ant = a;
  }
}
