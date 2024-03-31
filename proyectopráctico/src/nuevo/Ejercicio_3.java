package nuevo;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroCarta = 0 , paloBaraja = 0;
		do {
			System.out.println("Dame el número de la carta");
			numeroCarta = sc.nextInt();
			System.out.println("Dame el número del palo");
			paloBaraja = sc.nextInt();
		} while (valido(numeroCarta, paloBaraja) == false);
		formato(numeroCarta, paloBaraja);
		sc.close();
	}
	
	public static boolean valido (int carta, int palo) {
		if (carta >=1 && (carta <= 12) && (palo >=1) && (palo <=4) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void formato (int carta, int palo) {
		String resultado = "";
		switch (carta) {
		  case 1: resultado = "As"; break;
		  case 2: resultado = "2"; break;
		  case 3: resultado = "3"; break;
		  case 4: resultado = "4"; break;
		  case 5: resultado = "5"; break;
		  case 6: resultado = "6"; break;
		  case 7: resultado = "7"; break;
		  case 8: resultado = "8"; break;
		  case 9: resultado = "9"; break;
		  case 10:resultado = "10"; break;
		  case 11: resultado = "Sota"; break;
		  case 12: resultado = "Caballo"; break;
		  case 13: resultado = "Rey"; break;
		  default: resultado = "Error"; break;
		}
		resultado += resultado != "Error" ? " de " : "de número";
		switch (palo) {
		  case 1: resultado += "Oros"; break;
		  case 2: resultado += "Copas"; break;
		  case 3: resultado += "Bastos"; break;
		  case 4: resultado += "Espadas"; break;
		  default: resultado += "Error de palo"; break;
		}
		System.out.println(resultado);
	}
}
