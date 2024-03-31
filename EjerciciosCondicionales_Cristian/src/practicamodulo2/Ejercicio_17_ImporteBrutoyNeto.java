package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_17_ImporteBrutoyNeto {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Indique el Importe en Bruto a calcular");
		double importe = vc.nextDouble();
		
		
		if(importe>15000){
			System.out.println("El importe Neto es "+ (importe -(importe*0.16)));
			
		}else if(importe<=15000){
			System.out.println("El importe Neto es "+ (importe -(importe*0.1)));
			
			}else {
				System.out.println("");
			}
	}
}
