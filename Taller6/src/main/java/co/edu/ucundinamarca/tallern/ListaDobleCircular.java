package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

public class ListaDobleCircular {
    NodoDobleCircular primero;
    NodoDobleCircular ultimo;
    String dato;
    Scanner teclado = new Scanner(System.in);
    public ListaDobleCircular(){
        primero=null;
        ultimo=null;
    }
    public void Ingresar (String x){
        NodoDobleCircular nuevo = new NodoDobleCircular();
        nuevo.datos=x;
        if (primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
    public void Mostrar() {
        NodoDobleCircular actual = new NodoDobleCircular();
        actual = primero;
        do{
            System.out.println(actual.datos);
        }while(actual!=primero);
    }
    public void Buscar (String x){
        NodoDobleCircular actual = new NodoDobleCircular();
        actual=ultimo;
        boolean encontrado=false;
        do{
            if (actual.datos==x){
                encontrado = true;
                dato=actual.datos;
            }
        }while(actual!=ultimo);
        if(encontrado ==true){
            System.out.println("Articulo encontrado");
            System.out.println(dato);
        }else{
            System.out.println("Articulo no encontrado");
        }

    }
    public void Modificar (String x){
        NodoDobleCircular actual = new NodoDobleCircular();
        actual.datos=x;

        do{
            if(actual.datos==x){
                System.out.println("Ingrese un nuevo articulo");
                actual.datos=teclado.next();
            }
            actual=actual.siguiente;
        }while (actual!=primero);

    }
}
