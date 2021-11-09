
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;


public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Deque colad= new Deque();
        colad.insertarInicial(25);
        colad.insertarInicial(40);
        colad.insertarFinal(20);
        colad.insertarFinal(10);
        colad.insertarFinal(45);
        colad.insertarInicial(60);


        log.info(colad.toString());

        colad.removerInicial();
        colad.removerInicial();
        colad.removerFinal();

        log.info(colad.toString());

    }

}
