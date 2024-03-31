package ejercicios;

public interface Riesgo {
	
	double primaRiesgo = 1000.00;
	
	default double darPrima (double sueldo) {
		sueldo += primaRiesgo;
		return sueldo;
	}
}
