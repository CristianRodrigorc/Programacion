package bucles;

import java.util.Scanner;

public class EjerciciosBucles_Parte1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Escribe un número");
			int a= scan.nextInt();
			
	
			for (int b=1; b<=10;b++){
				
				System.out.println(b*a);
			}	
			
		}
}
