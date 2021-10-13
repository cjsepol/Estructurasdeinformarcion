
package co.edu.ucundinamarca.Taller4;

import org.apache.log4j.Logger;
import java.util.Scanner;
import static junit.framework.TestCase.assertTrue;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Dulces.class.getName());

    public static void main(String[] args) {

        Scanner intr = new Scanner(System.in);

        Dulces objetoDulce = new Dulces();

        objetoDulce.imprimirIterando("BombonBum");
        objetoDulce.imprimirIterando("ChocoRamo");
        objetoDulce.imprimirIterando("Barrilete");
        objetoDulce.imprimirIterando("Masmelos");
        objetoDulce.imprimirIterando("Galletas");
        objetoDulce.imprimirIterando("Sparkies");
        objetoDulce.imprimirIterando("Arequipe");
        objetoDulce.imprimirIterando("Chocolate");
        objetoDulce.imprimirIterando("Barrilete");
        objetoDulce.imprimirIterando("Papas");

        objetoDulce.mostrarLista();


        Dulces.imprimirSinIterador("ChocoRamo", 10);


    }

}