package bucles;

import java.util.Scanner;

public class Ejercicio4_Bucles {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número entero positivo");
		 int num=scan.nextInt();
		 
		 if (num>0) 
		 {
			 
		 }else {
			 System.out.println("No es un número entero positivo");
		 }
		 for( int a=1; a<=num; a++) {
			 if(a%2!=0) {
				 System.out.print(a+" , ");
			 }
		 }
		
	}
}
