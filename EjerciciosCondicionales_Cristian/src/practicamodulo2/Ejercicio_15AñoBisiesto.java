package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_15AñoBisiesto {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un año: ");
        int anio = scan.nextInt();

        if (esBisiesto(anio)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }

    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
	}
}
