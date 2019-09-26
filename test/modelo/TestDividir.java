package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDividir {

    public TestDividir() {
    }
    
     @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(10,2);
        int expResult = 5;
        int result = instance.Dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
