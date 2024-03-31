package variables;

public class CharCasting {
	public static void main(String[] args) {
		byte caracter = 14;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => CHAR 
		byte numByte = (byte)caracter;
		
		//CASTING IMPLICITO: INT => BYTE
		int numInt = caracter;
		
		//CASTING EXPLÍCITO: INT => SHORT
		short numShort = caracter;
		
		//CASTING IMPLÍCITO: INT => LONG
		long numLong = caracter;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		float numFloat = caracter;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = caracter;
		
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//boolean flag1 = caracter;
		
		System.out.println("CASTING EXPLÍCITO: CHAR => BYTE es "+ numByte);
		System.out.println("CASTING EXPLÍCITO: CHAR => INT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: CHAR => SHORT es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: CHAR => LONG es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: CHAR => FLOAT es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: CHAR => DOUBLE es "+ caracter);
		System.out.println("CASTING EXPLÍCITO: CHAR => BOOLEAN no se puede hacer casting");
		
		
		
		
		
		
		
		
	}
}
