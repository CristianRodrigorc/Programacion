package ejercicios;

import java.time.LocalDate;

abstract class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaEntrada;
	
	
	public Empleado(String nombre, String apellido, int edad, LocalDate fechaEntrada) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaEntrada = fechaEntrada;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}




	public abstract double calcularSueldo();
	
	
	public abstract StringBuilder getNombreCompleto();
}
