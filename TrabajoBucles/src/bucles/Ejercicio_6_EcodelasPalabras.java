package bucles;

import java.util.Scanner;

public class Ejercicio_6_EcodelasPalabras {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
        System.out.println("Escribe lo que quieras (Escribe 'salir' para terminar):");

        while (true) {
            String entrada = vc.nextLine();
            
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("Eco: " + entrada);
        }
	}
}
