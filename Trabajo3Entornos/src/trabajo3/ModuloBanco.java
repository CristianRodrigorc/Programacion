package trabajo3;

public class ModuloBanco {

	 String codigoBanco;
	 String codigoSucursal;
	 String numeroCuenta;
	 String clavePersonal;
	 String orden;

	public ModuloBanco(String codigoBanco, String codigoSucursal, String numeroCuenta, String clavePersonal,
			String orden) {
		this.codigoBanco = codigoBanco;
		this.codigoSucursal = codigoSucursal;
		this.numeroCuenta = numeroCuenta;
		this.clavePersonal = clavePersonal;
		this.orden = orden;
	}

	public boolean validarCodigoBanco() {
		if (codigoBanco.isEmpty()) {
			return true;
		} else {
			return codigoBanco.length() == 3 && Integer.parseInt(codigoBanco.substring(0, 1)) > 1;
		}
	}

	public boolean validarCodigoSucursal() {
		return codigoSucursal.length() == 4 && Integer.parseInt(codigoSucursal.substring(0, 1)) > 0;
	}

	public boolean validarNumeroCuenta() {
		return numeroCuenta.length() == 5;
	}

	public boolean validarClavePersonal() {
		return clavePersonal.length() == 4 && clavePersonal.matches("[a-zA-Z0-9]+");
	}

	public boolean validarOrden() {
		return orden.equals("Ingresos") || orden.equals("Pagos") || orden.isEmpty();
	}

	public String procesarOperacion() {
		if (!validarCodigoBanco()) {
			return "Campo de código de banco incorrecto.";
		} else if (!validarCodigoSucursal()) {
			return "Campo de código de sucursal incorrecto.";
		} else if (!validarNumeroCuenta()) {
			return "Campo de número de cuenta incorrecto.";
		} else if (!validarClavePersonal()) {
			return "Campo de clave personal incorrecto.";
		} else if (!validarOrden()) {
			return "Campo de orden incorrecto.";
		} else {
			return mostrarResultados();
		}
	}

	public String mostrarResultados() {
		// Lógica para mostrar los ingresos, pagos o ambos según la orden
		if (orden.equals("Ingresos")) {
			return "Mostrar ingresos del último mes.";
		} else if (orden.equals("Pagos")) {
			return "Mostrar pagos del último mes.";
		} else {
			return "Mostrar ambos movimientos del último mes.";
		}
	}

	public static void main(String[] args) {
		ModuloBanco moduloBanco = new ModuloBanco("123", "4567", "12345", "abcd", "Ingresos");
		String resultado = moduloBanco.procesarOperacion();
		System.out.println(resultado);
	}
}