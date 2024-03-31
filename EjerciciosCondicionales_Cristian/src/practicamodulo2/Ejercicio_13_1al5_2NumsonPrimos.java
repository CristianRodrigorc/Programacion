package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_13_1al5_2NumsonPrimos {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Ingrese un valor del 1 al 5");
		int num1 = vc.nextInt();
		
		System.out.println("Ingrese otro valor del 1 al 5");
		int num2= vc.nextInt();
		
		if((num1 == 2 || num1 == 3 || num1 == 5) && (num2 == 2 || num2 == 3 || num2 == 5))
		{
			System.out.println("Los números "+num1+" y "+num2+" son primos.");
			
		}else
		{
			System.out.println("Los números "+num1+" y "+num2+" no son primos.");
		}
		

		
	}

}