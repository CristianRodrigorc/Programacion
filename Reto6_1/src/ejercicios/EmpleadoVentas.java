package ejercicios;

import java.time.LocalDate;

public class EmpleadoVentas extends Empleado{
	
	private double sueldoBase;
	private int ventas;
	
	public EmpleadoVentas(String nombre, String apellido, int edad, LocalDate fechaEntrada, int ventas) {
		super(nombre, apellido, edad, fechaEntrada);
		this.sueldoBase = 400;
		this.ventas = ventas;
	}
	
	

	/**
	 * @return the sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}


	/**
	 * @return the ventas
	 */
	public int getVentas() {
		return ventas;
	}



	@Override
	public double calcularSueldo() {
		double sueldoTotal = getSueldoBase()+(ventas*0.2);
		return sueldoTotal;
	}



	@Override
	public StringBuilder getNombreCompleto() {
		StringBuilder nombreCompleto = new StringBuilder();
		nombreCompleto.append("El empleado: "+ getNombre()+" "+getApellido());
		return nombreCompleto;
	}


	



}
