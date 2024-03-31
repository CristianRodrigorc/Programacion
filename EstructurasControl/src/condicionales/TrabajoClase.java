package condicionales;

import java.util.Scanner;

public class TrabajoClase {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = vc.nextInt();
		System.out.println("Introduce otro número");
		int num2 = vc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El cociente es "+num1/num2);
		}else {
			System.out.println("El cociente es "+num2/num1);
		}
	}
}
