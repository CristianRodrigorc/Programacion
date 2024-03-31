package tarea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tarea1Test {


	@Test
	int Contador (int x, int y) {
		 int num, c = 0;
		 if (x > 0 && y < 0) {


			 System.out.println("Escribe un número");


			 num = 5;
			 if (num >= x && num <= y) {


				 System.out.println("Número en el rango");


				 c++;

				 Assertions.assertNotEquals(9, 5);
				 } else {


				 System.out.println("Número fuera de rango");


				 }


				 } else 

				 c = -1;
				 
				 return c;

				
		}

	}

}
