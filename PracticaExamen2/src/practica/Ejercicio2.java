package practica;

public class Ejercicio2 {
	public static int generarPrimosEnRango(int inicio, int fin) {

		int resultado = 0;
		
		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)) {
				resultado++;
				System.out.print(i + " ");
			}
		}
		return resultado;
	}

	public static boolean esPrimo(int numero) {

		boolean esPrimo = false;
		if (numero >= 1) {
			esPrimo = true;
			for (int i = 2; esPrimo && i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
				}
			}
		}
		return esPrimo;
	}
}
