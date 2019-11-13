
package almacenar;
import org.junit.Test;
import static org.junit.Assert.*;
public class PaqueteTest {   
    public PaqueteTest() {
    }

    @Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        Paquete instance = new Paquete(1.0);
        double esperado = 1.0;
        double resultado = instance.getVolumen();
        assertEquals(esperado, resultado, 0.00);
    }
    
}
