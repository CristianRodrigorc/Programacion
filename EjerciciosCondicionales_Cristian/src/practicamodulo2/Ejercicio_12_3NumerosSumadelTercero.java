package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_12_3NumerosSumadelTercero {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		int a = vc.nextInt();
		
		System.out.println("introduce el segundo valor");
		int b = vc.nextInt();
		
		System.out.println("introduce el tercer valor");
		int c = vc.nextInt();
		
		if(c ==a+b) 
		{
			System.out.println("El valor del tercer número es igual a la suma del primero con el segundo");
		}else 
		{
			System.out.println("El valor del tercer número no es igual a la suma del primero con el segundo");
		}
	}

}
