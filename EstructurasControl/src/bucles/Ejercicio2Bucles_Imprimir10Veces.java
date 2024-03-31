package bucles;

import java.util.Scanner;

public class Ejercicio2Bucles_Imprimir10Veces {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		String palabra = scan.next();
		 
		for(int a=1; a<=10; a++) {
			
			System.out.println(a+")"+palabra);
		}
	}
}
