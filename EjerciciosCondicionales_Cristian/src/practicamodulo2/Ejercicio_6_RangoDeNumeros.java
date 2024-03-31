package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_6_RangoDeNumeros {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		System.out.print("Escribe un número del 1 al 7");
		int n = vc.nextInt();
		
		if(n==1) {
			System.out.println("Lunes");
				}else if(n==2) {
						System.out.println("Martes");
						}else if(n==3) {
										System.out.println("Miércoles");
										}else if(n==4) {
														System.out.println("Jueves");
														}else if(n==5) {
																		System.out.println("Viernes");
																		}else if(n==6) {
																						System.out.println("Sábado");
																						}else if(n==7) {
																										System.out.println("Domingo");
																										}
		else {
			System.out.println("El día no existe");
		}
		if(n==1) {
			System.out.println("Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo");
				}else if(n==2) {
						System.out.println("Martes, Miércoles, Jueves, Viernes, Sábado, Domingo");
						}else if(n==3) {
										System.out.println("Miércoles, Jueves, Viernes, Sábado, Domingo");
										}else if(n==4) {
														System.out.println("Jueves, Viernes, Sábado, Domingo");
														}else if(n==5) {
																		System.out.println("Viernes, Sábado, Domingo");
																		}else if(n==6) {
																						System.out.println("Sábado, Domingo");
																						}else if(n==7) {
																										System.out.println("Domingo");
																										}
		else {
			System.out.println("El día no existe");
		}
 

	}
}