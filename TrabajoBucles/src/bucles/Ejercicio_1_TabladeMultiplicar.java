package bucles;

import java.util.Scanner;

public class Ejercicio_1_TabladeMultiplicar {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.print("Ingresa un número para generar su tabla de multiplicar: ");
        int numero = vc.nextInt();
        
        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
	}

}
