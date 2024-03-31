package bucles;

import java.util.Scanner;

public class Ejercicio5_Bucles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		String palabra = scan.nextLine();
		
		
		for(int i=palabra.length()-1; i>=0;i--) {
			System.out.println(palabra.charAt(i));
		}
		
	}
}
