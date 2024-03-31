package trabajo3;

import java.util.Scanner;

public class CodigoEjercicio2 {
	    public static int sumaRestaParesImpares(int numeroLimite) {
	        if (numeroLimite <= 0) {
	            return 0;
	        }

	        int resultado = 0;

	        for (int i = 1; i <= numeroLimite; i++) {
	            if (i % 2 == 0) {
	                resultado += i; // Sumar números pares
	            } else {
	                resultado -= i; // Restar números impares
	            }
	        }

	        return resultado;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número mayor que 0: ");
	        int numeroLimite = scanner.nextInt();

	        int resultado = sumaRestaParesImpares(numeroLimite);

	        System.out.println("El resultado de sumar pares y restar impares hasta " + numeroLimite + " es: " + resultado);

	        scanner.close();
	    }
}
