package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class NumerosRepetidos {


    static Logger log =Logger.getLogger(NumerosRepetidos.class.getName());

    public ClaseNodo primero;

    public ClaseNodo ultimo;



    public NumerosRepetidos() {

        primero = null;

        ultimo = null;



    }



    public void Agregar(int numero) {

        ClaseNodo nuevo = new ClaseNodo();



        nuevo.dato = numero;



        if (primero == null) {

            primero = nuevo;

            nuevo.siguiente = null;

            ultimo = primero;

        } else {

            ultimo.siguiente = nuevo;

            nuevo.siguiente = null;

            ultimo = nuevo;

        }



    }



    public void mostrar() {

        ClaseNodo actual = new ClaseNodo();

        ClaseNodo repetido = new ClaseNodo();

        repetido = primero;



        actual = primero;

        while (actual != null) {

            log.info(actual.dato + "->");

            if (repetido.dato == actual.dato) {

                repetido.contadorRepetido++;

            }

            actual = actual.siguiente;



        }

        log.info("se ha repetido el numero "+repetido.dato +":"+ repetido.contadorRepetido + " veces");



    }
}
