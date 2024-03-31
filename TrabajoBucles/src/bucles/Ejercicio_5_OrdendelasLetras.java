package bucles;

import java.util.Scanner;

public class Ejercicio_5_OrdendelasLetras {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		
        System.out.print("Ingrese una palabra: ");
        String palabra = vc.nextLine();


        System.out.println("Letras de la palabra en orden inverso:");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            char letra = palabra.charAt(i);
            System.out.println(letra);
        }
	}
}
