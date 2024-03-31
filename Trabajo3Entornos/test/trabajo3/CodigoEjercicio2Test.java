package trabajo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodigoEjercicio2Test {

    @Test
    void testSumaRestaConNumeroPositivo() {
        assertEquals(25, CodigoEjercicio2.sumaRestaParesImpares(5));
    }

    @Test
    void testSumaRestaConNumeroCero() {
        assertEquals(0, CodigoEjercicio2.sumaRestaParesImpares(0));
    }

    @Test
    void testSumaRestaConNumeroNegativo() {
        assertEquals(0, CodigoEjercicio2.sumaRestaParesImpares(-5));
    }
}
