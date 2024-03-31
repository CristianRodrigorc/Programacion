package cal;

public class Calculator {

	int num1;
	int num2;
	
	public Calculator(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int sumar() {
		return num1 + num2;
	}
	
	public int resta() {
		return num1 - num2;
	}
	
	public int multiplicacion() {
		return num1 * num2;
	}
	
	public int division() {
		return num1 / num2;
	}
}
