package bucles;

import java.util.Scanner;

public class Ejercicio3Bucles {
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Introduce tu edad");
		 int edad = scan.nextInt();
		 
		 
		 for(int a=1; a<=edad; a++) 
		 {
			 System.out.println(a);
		 }
	}
}
