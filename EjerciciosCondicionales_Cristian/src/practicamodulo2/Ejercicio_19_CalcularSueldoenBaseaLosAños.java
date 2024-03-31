package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_19_CalcularSueldoenBaseaLosAños {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		
		System.out.println("Indique la cantidad de años trabajados");
		double anios = vc.nextDouble();
		double sueldo = 40000.00;
		
		if(anios >= 10){
			System.out.println("El sueldo en 12 meses es "+ ((sueldo+(sueldo*0.1))/12)+ " El sueldo anual es "+(sueldo+(sueldo*0.1)));
			
			}else if(anios<10 && anios >= 5) {
				System.out.println("El sueldo en 12 meses es "+((sueldo+(sueldo*0.07))/12)+ " El sueldo anual es "+(sueldo+(sueldo*0.07)) );
				
				}else if(anios< 5 &&anios >=3) {
					System.out.println("El sueldo en 12 meses es "+ ((sueldo+(sueldo*0.05))/12)+" El sueldo anual es "+(sueldo+(sueldo*0.05)));
					
					}else if(anios < 3 && anios>=0) {
						System.out.println("El sueldo en 12 meses es "+ ((sueldo+(sueldo*0.03))/12)+" El sueldo anual es "+(sueldo+(sueldo*0.03)));
						
						}else {
							System.out.println("introduce un valor correcto");
						}
		
	}

}
