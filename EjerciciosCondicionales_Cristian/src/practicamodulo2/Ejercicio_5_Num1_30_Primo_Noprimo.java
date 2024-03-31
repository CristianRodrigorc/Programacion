package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_5_Num1_30_Primo_Noprimo {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 30");
		int num = vc.nextInt();
		
		if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || num == 23 || num == 29) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}
	}
}
