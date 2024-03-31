package trabajo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Ejercicio3Test {

    @Test
    void testGenerarPrimosEnRango() {
        // Prueba con rango del 1 al 10 (números primos: 2, 3, 5, 7)
        assertEquals(4, Ejercicio3.generarPrimosEnRango(1, 10));
        
        // Prueba con rango del 20 al 30 (números primos: 23, 29)
        assertEquals(2, Ejercicio3.generarPrimosEnRango(20, 30));
        
        // Prueba con rango del 50 al 60 (números primos: 53, 59)
        assertEquals(2, Ejercicio3.generarPrimosEnRango(50, 60));
    }

    @Test
    void testEsPrimo() {
        // Números primos
        assertTrue(Ejercicio3.esPrimo(2));
        assertTrue(Ejercicio3.esPrimo(3));
        assertTrue(Ejercicio3.esPrimo(5));
        assertTrue(Ejercicio3.esPrimo(7));
        assertTrue(Ejercicio3.esPrimo(11));

        // Números no primos
        assertFalse(Ejercicio3.esPrimo(1));
        assertFalse(Ejercicio3.esPrimo(4));
        assertFalse(Ejercicio3.esPrimo(6));
        assertFalse(Ejercicio3.esPrimo(8));
        assertFalse(Ejercicio3.esPrimo(9));
    }
}

