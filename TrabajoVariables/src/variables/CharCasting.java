package variables;

public class CharCasting {
	public static void main(String[] args) {
		byte caracter = 14;
		
		//CASTING EXPLÍCITO: CHAR => CHAR 
		byte numByte = (byte)caracter;
		
		//CASTING IMPLICITO: CHAR => BYTE
		int numInt = caracter;
		
		//CASTING EXPLÍCITO: CHAR => SHORT
		short numShort = caracter;
		
		//CASTING IMPLÍCITO: CHAR => LONG
		long numLong = caracter;
		
		//CASTING IMPLÍCITO: CHAR => FLOAT
		float numFloat = caracter;
		
		//CASTING IMPLÍCITO: CHAR => DOUBLE
		double numDouble = caracter;
		
		
		
		//CASTING IMPLÍCITO: CHAR => BOOLEAN
		//int int2 = flag1;
		
		System.out.println("CASTING EXPLÍCITO: CHAR => BYTE es "+ numByte);
		System.out.println("CASTING EXPLÍCITO: CHAR => INT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: CHAR => SHORT es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: CHAR => LONG es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: CHAR => FLOAT es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: CHAR => DOUBLE es "+ caracter);
		
		
		
		
		
		
		
		
		
	}
}
