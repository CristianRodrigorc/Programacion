package bucles;

import java.util.Scanner;

public class Ejercicio_2_10veces {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = vc.nextLine();
		
		System.out.println(palabra);
		
		for (int i = 0; i <= 8; i++) {
            System.out.println(palabra);
        }
	}
}
