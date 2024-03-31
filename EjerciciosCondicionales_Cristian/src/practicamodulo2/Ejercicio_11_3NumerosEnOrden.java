package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_11_3NumerosEnOrden {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		int a = vc.nextInt();
		
		System.out.println("ingrese el segundo valor");
		int b = vc.nextInt();
		
		System.out.println("Ingrese el tercer valor");
		int c = vc.nextInt();
		
		
		if (a<b && b<c)
		{
			System.out.println("Los números están de forma creciente");
			
		}else 
		{
			System.out.println("Los números no están de forma creciente");
		}
	}
}
