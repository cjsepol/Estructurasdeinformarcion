
package co.edu.ucundinamarca.taller7;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author CAMILO
 */
public class TorreHanoi {
    static Logger log = Logger.getLogger(Main.class.getName());
    
    public void TorreHanoi(int num,int Tinicio,int Ttemp ,int Tfinal) {
        
        if(num==1){
            log.info("Movimiento de la torre 1 a la torre 3 \n Juego terminado");
            
        }else
        {
            TorreHanoi(num-1, Tinicio, Tfinal, Ttemp);
            log.info("Moviendo de la torre de inicio"+Tinicio+ " A la torre "
                    + "de destino "+Tfinal);
            
            TorreHanoi(num-1, Ttemp, Tinicio, Tfinal);
    }

            
  }
   
}
    

