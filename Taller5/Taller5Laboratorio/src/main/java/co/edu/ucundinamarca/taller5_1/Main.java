
package co.edu.ucundinamarca.taller5_1;

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

        String nomEmpl = "";
        String apeEmpl = "";
        int fecha;
        double salario;

        Lista milista = new Lista();
        int opcion = 0;
        Empleado empleado = new Empleado();

        do{
          try{
              log.debug("\n1. Agregar empleado a la lista\n"
                      + "2. Ver empleados");

              opcion = intr.nextInt();

              switch(opcion){
                  case 1:
                      log.info("Ingrese el nombre del empleado");
                      empleado.setNombres(nomEmpl = intr.next());
                      log.info("Ingrese el apellido del empleado");
                      empleado.setNombres(apeEmpl = intr.next());
                      log.info("Año de ingreso");
                      empleado.setFechaIngreso(fecha = intr.nextInt());
                      log.info("Salario");
                      empleado.setSalario(salario = intr.nextDouble());

                      milista.agregarAlInicio(new Empleado(empleado.getNombres(), empleado.getApellidos(), empleado.getFechaIngreso(), empleado.getSalario()));
                      break;
                  case 2:
                      if (!milista.estaVacia()) {
                          log.info("Siguiente");
                          milista.mostrarListaSig();

                          log.info("Anterior");
                          milista.mostrarListaAnt();

                      } else {
                          log.info("Lista vacia");
                      }
                      break;
              }
          }catch (Exception e){
              log.info("Error");
          }

        }while(opcion != 2);

    }

}
