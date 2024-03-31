package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_10_PedirLetra_DetectarVocal {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("Introducir una Vocal");
		char vocal = vc.next().charAt(0);
		
		if(vocal==65) 
		{
			System.out.println("Es una Vocal");	
		}else if(vocal==69)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==73)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==79)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==85)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==97)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==101)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==105)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==111)
		{
			System.out.println("Es una Vocal");
		}else if(vocal==117)
		{
			System.out.println("Es una Vocal");
		}else
		{
			System.out.println("No es una vocal");
		}
	}
}
