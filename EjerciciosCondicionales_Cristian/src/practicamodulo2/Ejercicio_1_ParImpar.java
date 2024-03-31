package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_1_ParImpar {
	public static void main(String[] args) {

		
		Scanner vc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = vc.nextInt();
		
		
		if ( num1 %2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}
}
