package arraya2;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		System.out.print("ingrese el número de lados de un cuadrado: ");
		int ladosCuadrado = leer.nextInt();
		
		int cuadradoArray [] [] = new int [ladosCuadrado][ladosCuadrado]; 
		
		for (int i = 0; i < cuadradoArray.length; i++) {
			for (int j = 0; j < cuadradoArray.length; j++) {
				if(cuadradoArray[0][j]==0 || cuadradoArray[i][0]== 0 || cuadradoArray[][]) {
					
				}
					System.out.println("*");
				}
			}
			System.out.println();
		}
		
	}
}
