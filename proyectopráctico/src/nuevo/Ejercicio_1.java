package nuevo;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		System.out.println("Tablas de multiplicar: ");
		for (int i=1; i<=10; i++) {
		  for (int j=1; j<=10; j++) {
			  //*El error está en la linea 10. Ya que la expresión es de
			  //resta y no de multiplicación
			  System.out.print(i+" x "+j+" = "+(i*j)+" | ");
		  }
		  System.out.println();
		}
	}
}
