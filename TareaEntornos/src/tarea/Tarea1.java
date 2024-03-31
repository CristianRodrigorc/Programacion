package tarea;

import java.util.Scanner;

public class Tarea1 {
	int Contador (int x, int y) {


		 Scanner entrada = new Scanner(System.in);


		 int num, c = 0;


		 if (x > 0 && y < 0) {


		 System.out.println("Escribe un número");


		 num = entrada.nextInt();


		 if (num >= x && num <= y) {


		 System.out.println("Número en el rango");


		 c++;


		 } else {


		 System.out.println("Número fuera de rango");


		 }


		 } else 

		 c = -1;
		 
		 return c;

		}
}
