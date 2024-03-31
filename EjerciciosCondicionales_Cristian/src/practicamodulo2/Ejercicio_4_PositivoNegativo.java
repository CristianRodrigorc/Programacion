package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_4_PositivoNegativo {
	public static void main(String[] args) {
		Scanner vc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num = vc.nextInt();
	
		if(num > 0) {
			System.out.println("Es positivo");
		}else {
			System.out.println("Es negativo");
		}
	}

}
