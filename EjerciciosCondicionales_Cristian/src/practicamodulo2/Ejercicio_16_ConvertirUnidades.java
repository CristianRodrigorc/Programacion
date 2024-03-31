package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_16_ConvertirUnidades {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Introduce el peso en Kg.");
		double valor = vc.nextDouble();
		double resultado;
		
		System.out.println("A que unidad de medida deseas pasar el peso");
		System.out.println("Presiona 1 para Hectogramos");
		System.out.println("Presiona 2 para Decagramos");
		System.out.println("Presiona 3 para Gramos");
		System.out.println("Presiona 4 para Decigramos");
		System.out.println("Presiona 5 para Centigramos");
		System.out.println("Presiona 6 para Miligramos");
		double unidad = vc.nextDouble();
		
		
		
		if(unidad == 1)
		{
			System.out.println(valor*10);
				
			}else if (unidad == 2){
				System.out.println(valor*100);
				
				}else if(unidad == 3) {
					System.out.println(valor*1000);
					
					}else if(unidad == 4){
						System.out.println(valor*10000);
					
						}else if(unidad == 5){
							System.out.println(valor*100000);
							
							}else if(unidad == 6) {
								System.out.println(valor*1000000);
								
								}else {
									System.out.println("Introduce una opción correcta");
								}
	}
}
