package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

public class lista {

    nodo primero;
    nodo ultimo;
    int dato;
    Scanner teclado=new Scanner(System.in);
    public lista (){
        primero=null;
        ultimo=null;
    }
    public void ingresar (int x){
        nodo nuevo = new nodo ();
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
    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        do{
            System.out.println(actual.datos);
        }while(actual!=primero);
    }
    public void buscar (int x){
        nodo actual = new nodo();
        actual=ultimo;
        boolean encontrado=false;
        do{
            if (actual.datos==x){
                encontrado = true;
                dato=actual.datos;
            }
        }while(actual!=ultimo);
        if(encontrado ==true){
            System.out.println("Nodo encontrado");
            System.out.println(dato);
        }else{
            System.out.println("Nodo no encontrado");
        }

    }
    public void modificar (int x){
        nodo actual = new nodo ();
        actual.datos=x;

        do{
            if(actual.datos==x){
                System.out.println("Ingrese un nuevo valor");
                actual.datos=teclado.nextInt();
            }
            actual=actual.siguiente;
        }while (actual!=primero);

    }
}
