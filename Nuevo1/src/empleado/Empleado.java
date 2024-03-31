package empleado;

import java.util.Scanner;

public class Empleado {
	public float calculaSalarioBruto(int tipoEmpleado, float ventasMes, float horasExtra) {
        if (tipoEmpleado != 1 && tipoEmpleado != 2 || ventasMes < 0 || horasExtra < 0) {
            throw new IllegalArgumentException("ERROR EN LOS DATOS");
        }

        float salarioBase = (tipoEmpleado == 1) ? 1000 : 1500;
        float prima = (ventasMes <= 1000) ? 100 : 200;
        float salarioHoraExtra = horasExtra * 20;

        return salarioBase + prima + salarioHoraExtra;
    }
    public float calculaSalarioNeto(float salarioBruto) {
        if (salarioBruto < 0) {
            throw new IllegalArgumentException("ERROR EL SALARIO NETO DEBE SER POSITIVO");
        }

        float retencion;
        if (salarioBruto < 1000) {
            retencion = 0;
        } else if (salarioBruto < 1500) {
            retencion = 0.16f;
        } else {
            retencion = 0.19f;
        }

        float salarioNeto = salarioBruto * (1 - retencion);
        return salarioNeto;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try {
            System.out.print("Ingrese el tipo de empleado (1 o 2): ");
            int tipoEmpleado = leer.nextInt();

            System.out.print("Ingrese las ventas del mes: ");
            float ventasMes = leer.nextFloat();

            System.out.print("Ingrese las horas extras trabajadas: ");
            float horasExtra = leer.nextFloat();

            Empleado empleado = new Empleado();
            float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, ventasMes, horasExtra);
            System.out.println("Salario Bruto: " + salarioBruto);

            float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
            System.out.println("Salario Neto: " + salarioNeto);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            leer.close();
        }
    }
}
