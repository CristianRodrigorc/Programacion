package ejercicios;

import java.time.LocalDate;

public class EmpleadoProduccion extends Empleado implements Riesgo{

	private int unidadesProducidas;
	private boolean productosRiesgo;
	
	public EmpleadoProduccion(String nombre, String apellido, int edad, LocalDate fechaEntrada, int unidadesProducidas, boolean productosRiesgo) {
		super(nombre, apellido, edad, fechaEntrada);
		this.unidadesProducidas = unidadesProducidas;
		this.productosRiesgo = productosRiesgo;
	}
	
	/**
	 * @return the unidadesProducidas
	 */
	public int getUnidadesProducidas() {
		return unidadesProducidas;
	}
	
	

	/**
	 * @return the productosRiesgo
	 */
	public boolean isProductosRiesgo() {
		return productosRiesgo;
	}

	@Override
	public double calcularSueldo() {
		double sueldoTotal = getUnidadesProducidas()*5;
		if(isProductosRiesgo()){
			darPrima(sueldoTotal);
			return sueldoTotal;	
		}else {
				return sueldoTotal;		
		}
	}

	@Override
	public StringBuilder getNombreCompleto() {
		StringBuilder nombreCompleto = new StringBuilder();
		nombreCompleto.append("El empleado: "+ getNombre()+" "+getApellido());
		return nombreCompleto;
	}

}
