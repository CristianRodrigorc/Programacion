package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_9_SeleccionDeCaracteres {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("introducir el caracter S, N o .");
		char asc1 = vc.next(). charAt(0);
		
		if(asc1==83) 
		{
			System.out.println("El caracter S es correcto");
			
		}else if(asc1==78)
		{
			System.out.println("El caracter N es correcto");
			
		}else if(asc1==46)
		{
			System.out.println("El caracter . es correcto");
			
		}else 
		{
			System.out.println("Introduce un caracter S, N o .");
		}
		
	}
}
