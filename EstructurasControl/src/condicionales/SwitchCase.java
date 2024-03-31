package condicionales;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner vc = new Scanner (System.in);
		System.out.println("introduce una vocal mayúscula");
		char vocal = vc.next().charAt(0);
		
		switch(vocal) {
			case 'A':
				System.out.println("Es la primera de las vocales");
				break;
			case 'E':
				System.out.println("Es la segunda de las vocales");
				break;	
			case 'I':
				System.out.println("Es la tercera de las vocales");
				break;
			case 'O':
				System.out.println("Es la cuarta de las vocales");
				break;
			case 'U':
				System.out.println("Es la última de las vocales");
				break;
			default:
				System.out.println("Escribe una vocal...");
		}
	}
}
