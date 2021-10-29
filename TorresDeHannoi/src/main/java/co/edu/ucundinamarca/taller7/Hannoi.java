package co.edu.ucundinamarca.taller7;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author CAMILO
 */
public class Hannoi {
    static Logger log = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        
        int n=0;
        Scanner leer=new Scanner(System.in);
         TorreHanoi h=new TorreHanoi();
        
        log.info("Ingrese con cuantos discos quiere jugar: ");
          
           n=leer.nextInt();
          
          h.TorreHanoi(n, 1, 2, 3);
        
    }
    
}
