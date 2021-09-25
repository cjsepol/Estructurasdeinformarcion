package co.edu.ucundinamarca.taller3;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class TestFunciones {

   @Test
   public void testFactorialRec(){
   
     int fun = Funciones.FactorialRec(5);
     assertEquals(120, fun);  
   }
   @Test
   public void testFactorialIterativas(){
     int funcion2 = Funciones.Factorial(10);
     assertEquals(15100, funcion2);
   }  

}
