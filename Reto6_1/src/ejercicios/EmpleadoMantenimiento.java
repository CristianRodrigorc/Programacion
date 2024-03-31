package ejercicios;

import java.time.LocalDate;

public class EmpleadoMantenimiento extends Empleado implements Riesgo{
	
	private int horasTrabajadas;
	private boolean productosRiesgo;
	
	public EmpleadoMantenimiento(String nombre, String apellido, int edad, LocalDate fechaEntrada, int horasTrabajadas, boolean productosRiesgo) {
		super(nombre, apellido, edad, fechaEntrada);
		this.horasTrabajadas = horasTrabajadas;
		this.productosRiesgo = productosRiesgo;
	}
	
	

	/**
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	

	/**
	 * @return the productosRiesgo
	 */
	public boolean isProductosRiesgo() {
		return productosRiesgo;
	}



	@Override
	public double calcularSueldo() {
		double sueldoTotal = getHorasTrabajadas()*5;
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
