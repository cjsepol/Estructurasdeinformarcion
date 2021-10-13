package co.edu.ucundinamarca.Taller4;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class TestImprimirIterando {

    @Test
    public void testDulces() {

      assertEquals(Dulces.imprimirSinIterador("ChocoRamo", 10), "ChocoRamo");

    }
}
