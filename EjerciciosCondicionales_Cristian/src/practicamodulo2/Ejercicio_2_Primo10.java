	package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_2_Primo10 {
	public static void main(String[] args) {
		
		
		Scanner vc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = vc.nextInt();
		
		if (num1 % 10 ==0) {
			System.out.println("El número "+num1+" es múltiplo de 10");
		}else {
			System.out.println("El número "+num1+" no es múltiplo de 10");
		}
	}
}
