package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_14_3Num {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Indica el primer valor");
		int a= vc.nextInt();
		
		System.out.println("indica el segundo valor");
		int b= vc.nextInt();
		
		System.out.println("Indica el tercer valor");
		int c= vc.nextInt();
		
		if (c==a*b) {
			System.out.println("Es igual el Tercer valor al producto del Primero con el Segundo");
		}else {
			System.out.println("No es igual el Tercer valor al producto del primero con el segundo");
		}
		
		if (c==a/b && a>b) {
			System.out.println("Es igual el Tercer valor al cociente del Primero con el Segundo");
		}else if(c==b/a && b>a){
			System.out.println("Es igual el Tercer valor al cociente del Primero con el Segundo");
		}else{
			System.out.println("No es igual el Tercer valor al cociente del Primero con el Segundo");
		}
		
		if(c==a%b) {
			System.out.println("Es igual el Tercer valor al módulo del Primer valor y el Segundo valor");
		}else {
			System.out.println("No es igual el Tercer valor al módulo del Primer valor y el Segundo valor");
		}
	}
}
