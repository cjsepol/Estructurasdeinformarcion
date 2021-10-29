package co.edu.ucundinamarca.tallern;

public class ClaseNodo {

    public int dato;
    public ClaseNodo siguiente;
    public int contadorRepetido = 0;

    public ClaseNodo(){
        this.dato = dato;
    }
    public ClaseNodo(int d, ClaseNodo n){
        dato = d;
        siguiente = n;
    }
}
