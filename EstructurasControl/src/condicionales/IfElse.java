package condicionales;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		//Pedir 2 numeros por teclado y decir si son distintos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = scan.nextInt();
		System.out.println("Introduce otro número");
		int num2 = scan.nextInt();
		
		//Preguntamos si son distintas
		
		if(num1 != num2) {
			System.out.println("Los números son distintos");
		}else {
			System.out.println("Los números son iguales");
		}
	}

}
