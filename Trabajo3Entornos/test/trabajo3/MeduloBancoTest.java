package trabajo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeduloBancoTest {

    @Test
    void testValidarCodigoBanco() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarCodigoBanco());
    }

    @Test
    void testValidarCodigoSucursal() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarCodigoSucursal());
    }

    @Test
    void testValidarNumeroCuenta() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarNumeroCuenta());
    }

    @Test
    void testValidarClavePersonal() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarClavePersonal());
    }

    @Test
    void testValidarOrden() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarOrden());
    }

    @Test
    void testProcesarOperacion() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertEquals("Mostrar ingresos del último mes.", moduloBanco.procesarOperacion());
    }
    
    @Test
    void testValidarCodigoBanco_CodigoValido() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarCodigoBanco());
    }

    @Test
    void testValidarCodigoBanco_CodigoEnBlanco() {
        ModuloBanco moduloBanco = new ModuloBanco("", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarCodigoBanco());
    }

    @Test
    void testValidarCodigoBanco_PrimerDigitoMenorQue1() {
        ModuloBanco moduloBanco = new ModuloBanco("023", "4567", "12345", "abcd", "Ingresos");
        assertFalse(moduloBanco.validarCodigoBanco());
    }

    @Test
    void testValidarCodigoSucursal_Valido() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarCodigoSucursal());
    }

    @Test
    void testValidarCodigoSucursal_PrimerDigitoMenorIgualA0() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "0567", "12345", "abcd", "Ingresos");
        assertFalse(moduloBanco.validarCodigoSucursal());
    }

    @Test
    void testValidarNumeroCuenta_Valido() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarNumeroCuenta());
    }

    @Test
    void testValidarClavePersonal_Valida() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarClavePersonal());
    }

    @Test
    void testValidarOrden_Valida() {
        ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
        assertTrue(moduloBanco.validarOrden());
    }

}
