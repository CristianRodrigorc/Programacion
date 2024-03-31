package variables;

import java.util.Scanner;

public class TiposDatos {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String [] args){
		//NUMERO ENTEROS (int, byte, short, long)
		int edad = 36;
		byte numero_alumnos = 19;
		short numero_ordenador = 203;
		long anio = 21;
		
		numero_alumnos = 20;
		edad = numero_alumnos;
		
		//NUMEROS DECIMALES (double, float)
		double precio = 50.8;
		float peso = 16.4F;
		
		precio = edad;
		
		//CARACTER (char)
		char tecla = 'a';
		char letraMayus = 'P';
		char numero_char = '2';
		char simbolo = '%';
		
		//BULEANO (boolean)
		boolean v_f = true;
		
		//TIPOS REFERENCIA
		//Objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		String frase = new String ("hola");
		String frase2 = "adios";
		
		
		//DECLARACION E INICIALIZACION
		int numero = 4; //Declaracion e inicializacion
		
		int numero2; //declaracion
		numero2 = 4; //inicializacion
		
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Dime un numero");
		int variable1 = read.nextInt();
		System.out.println("Dime otro numero");
		int variable2 = read.nextInt();
		
		int suma = variable1 + variable2;
		int resta = variable1 - variable2;
		int multiplicacion = variable1 * variable2;
		int division = variable1 / variable2;
		
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La multiplicacion es " + multiplicacion);
		System.out.println("La division es " + division);
		
		
		
		
		
	}
}	
