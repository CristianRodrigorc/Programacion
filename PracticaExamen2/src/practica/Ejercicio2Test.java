package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	public void testgenerarPrimoEnRango() {
		System.out.println("testRangoCorrecto");
		int resultado = Ejercicio2.generarPrimosEnRango(10, 12);
		assertEquals(1,resultado);
	}
	
	@Test
	public void tesesPrimo() {
		System.out.println("testesPrimoCorrecto");
		boolean resultado = Ejercicio2.esPrimo(2);
		assertEquals(true,resultado);
	}

}
