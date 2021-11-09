
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        PilitaL pila= new PilitaL();
        pila.insertar("a");
        pila.insertar("b");
        pila.insertar("c");
        pila.insertar("d");
        pila.MostrarValores();
    }

}
