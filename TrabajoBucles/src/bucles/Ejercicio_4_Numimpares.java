package bucles;

import java.util.Scanner;

public class Ejercicio_4_Numimpares {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		 System.out.print("Ingrese un número entero positivo: ");
	        int numero = vc.nextInt();
	        
	        
	        if (numero > 0) {
	            System.out.println("Números impares desde 1 hasta " + numero + ":");
	            for (int i = 1; i <= numero; i++) {
	                if (i % 2 != 0) {
	                    System.out.print(i);
	                    if (i < numero - 1) {
	                        System.out.print(", ");
	                    }
	                }
	            }
	        } else {
	            System.out.println("El número ingresado no es positivo.");
	        }
	}
}
