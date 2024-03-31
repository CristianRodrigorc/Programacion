package bucles;

import java.util.Scanner;

public class Ejercicio6_Bucles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("escribe");
		
		 String entrada;

	        System.out.println("Escribe algo (o escribe 'salir' para finalizar):");

	        do {
	            entrada = scan.nextLine();
	            System.out.println("Eco: " + entrada);
	        } while (!entrada.equalsIgnoreCase("salir"));
		
	}
}
