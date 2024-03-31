package pruebas;

import java.util.Scanner;

public class Ejemplo1 {
	public static int Contador(int x, int y) {

		Scanner leer = new Scanner(System.in);

		int num, c = 0;

		if (x > 0 && y < 0) {
			System.out.println("Escribe un número");
			num = leer.nextInt();
			if (num <= x && num >= y) {
				System.out.println("Número en el rango");
				c++;
			} else {
				System.out.println("Número fuera de rango");
			}
		} else
			c = -1;
		return c;
	}
	public static void main(String[] args) {
		Contador(10,-10);
	}
}
