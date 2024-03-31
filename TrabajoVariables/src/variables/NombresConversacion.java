package variables;

import java.util.Scanner;

public class NombresConversacion {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Dime un nombre");
		String persona1 = read.nextLine();
		System.out.println("Dime otro nombre");
		String persona2 = read.nextLine();
		
		System.out.println(persona1+": Hola "+", me alegro de verte.");
		System.out.println(persona2+": Si, estoy cansada de trabajar");
		System.out.println(persona1+": Y yo, pero hoy mismo me voy de vacaiones a París");
		System.out.println(persona2+": Genial. Me dijeron que es una ciudad muy bonita. Toma muchas fotos");
		System.out.println(persona1+": Claro, te las muestro cuando vuelva. Besos");
	}

}
