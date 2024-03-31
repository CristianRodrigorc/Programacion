package bucles;

import java.util.Scanner;

public class Ejercicio_3_edadynvecescumplidos {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Indique su edad: ");
		int anios = vc.nextInt();
		
		System.out.println("Años cumplidos:");
        for (int i = 1; i <= anios; i++) {
            System.out.println("Año " + i);
	}
	}
}
