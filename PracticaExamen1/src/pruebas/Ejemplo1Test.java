package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejemplo1Test {

	@Test
	public void testRangoCorrecto() {
		System.out.println("testRangoCorrecto");
		int resultado = Ejemplo1.Contador(10,-10);
		assertEquals(1,resultado);
	}
}
