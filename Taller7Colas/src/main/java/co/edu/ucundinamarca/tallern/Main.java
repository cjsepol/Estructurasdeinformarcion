
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.*;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LinkedList cola = new LinkedList();

        for(int i = 0; i<=10; i++){
           cola.offer(i);

           while(cola.peek() != null){
               log.info(cola.poll());
           }
        }

        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");
    }

}
