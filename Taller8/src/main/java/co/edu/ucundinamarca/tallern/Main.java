
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        ArbolBinario<Integer> arbol = new ArbolBinario<>();

        arbol.agregaNodo(8);

        arbol.agregaNodo(2);
        arbol.agregaNodo(arbol.arbolRaiz(), 10);
        arbol.agregaNodo(arbol.arbolRaiz(), 12);
        arbol.agregaNodo(1);



        log.info("PreOrden");
        arbol.preOrden(arbol.arbolRaiz()); // 8, 4, 1, 10, 12
        System.out.println("");
        log.info("InOrden");
        arbol.inOrden(arbol.arbolRaiz()); // 1, 4, 8, 10, 12
        System.out.println("");
        log.info("PosOrden");
        arbol.posOrden(arbol.arbolRaiz());// 1, 4, 12, 10, 8

    }

}
