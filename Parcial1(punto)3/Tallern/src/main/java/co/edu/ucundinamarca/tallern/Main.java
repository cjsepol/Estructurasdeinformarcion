
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    

    public static void main(String[] args) {
        int nr_soldados=Integer.parseInt(JOptionPane.showInputDialog("cuantos soldados hay? "));
        String[]v=new String[nr_soldados];        
        for (int i = 0; i <v.length; i++) {
            String nom_soldados=JOptionPane.showInputDialog("nombre del soldado "+"con el numero "+i);    
            v[i]=nom_soldados;
        }
        for (int i = v.length; i>=0; i--) {
            System.out.print("el soldado "+v[i]+" deve salir del circulo");            
        }
        System.out.print("el soldado "+ v[0]+" es quien ira en el caballo a pedir ayuda");
    }
    
    
   

}
