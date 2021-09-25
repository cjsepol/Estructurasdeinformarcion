package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;
import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

    Scanner intr = new Scanner(System.in);

    log.debug("Digite el factorial: ");  
    int num = intr.nextInt();
    
    int fact = Funciones.FactorialRec(num);
    log.debug("El factorial de " + num + " es: " + fact);
    
    log.debug("");
    
    log.debug("Digite la base: ");
    int base = intr.nextInt();
    log.debug("Digite el exponente: ");
    int exp = intr.nextInt();
    
    int pot = Funciones.Potencia(base, exp);
    log.debug("El resultado de la potencia es: " + pot);

    log.debug("");


    int num1 = 40;
    int num2 = 60;
    int resultado = Mcd.mcd(num1, num2);
    log.debug("El MCD de " + num1 + " " + num2 + " es: " + resultado);

    }

}
