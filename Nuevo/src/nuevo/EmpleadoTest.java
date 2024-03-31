package nuevo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    void testCalculaSalarioBrutoTipo1() {
        Empleado empleado = new Empleado();
        float salarioBruto = empleado.calculaSalarioBruto(1, 500, 5);
        assertEquals(1300, salarioBruto);
    }

    @Test
    void testCalculaSalarioBrutoTipo2() {
        Empleado empleado = new Empleado();
        float salarioBruto = empleado.calculaSalarioBruto(2, 1200, 10);
        assertEquals(2100, salarioBruto);
    }

    @Test
    void testCalculaSalarioBrutoDatosInvalidos() {
        Empleado empleado = new Empleado();
        assertThrows(IllegalArgumentException.class, () -> {
            empleado.calculaSalarioBruto(3, 500, 5); // Tipo Empleado no válido
        });
    }
    
    
    @Test
    void testCalculaSalarioNetoMenorA1000() {
        Empleado empleado = new Empleado();
        float salarioNeto = empleado.calculaSalarioNeto(800);
        assertEquals(800, salarioNeto);
    }

    @Test
    void testCalculaSalarioNetoEntre1000Y1500() {
        Empleado empleado = new Empleado();
        float salarioNeto = empleado.calculaSalarioNeto(1200);
        assertEquals(1008, salarioNeto);
    }

    @Test
    void testCalculaSalarioNetoMayorA1500() {
        Empleado empleado = new Empleado();
        float salarioNeto = empleado.calculaSalarioNeto(1800);
        assertEquals(1458, salarioNeto);
    }

    @Test
    void testCalculaSalarioNetoDatosInvalidos() {
        Empleado empleado = new Empleado();
        assertThrows(IllegalArgumentException.class, () -> {
            empleado.calculaSalarioNeto(-500); // Salario Bruto negativo
        });
    }
}