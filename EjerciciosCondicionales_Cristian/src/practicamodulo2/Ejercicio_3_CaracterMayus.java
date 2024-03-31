package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_3_CaracterMayus {
	public static void main(String[] args) {
		Scanner vc = new Scanner (System.in);
		System.out.println("introduce una letra mayúscula");
		char vocal = vc.next().charAt(0);

		if (vocal > 64 && vocal < 91) {
			System.out.println("La Letra es Mayúscula");
		}else {
			System.out.println("La Letra no es Mayúscula");
		}
	}
}
