package variables;

public class ByteCasting {
	public static void main(String[] args) {
		byte numByte = 4;
		
		//CASTING IMPLICITO: BYTE => BYTE
		int numInt = numByte;
		
		//CASTING EXPLÍCITO: BYTE => SHORT
		short numShort = numByte;
		
		//CASTING IMPLÍCITO: BYTE => LONG
		long numLong = numByte;
		
		//CASTING IMPLÍCITO: BYTE => FLOAT
		float numFloat = numByte;
		
		//CASTING IMPLÍCITO: BYTE => DOUBLE
		double numDouble = numByte;
		
		
		//CASTING EXPLÍCITO: BYTE => CHAR 
		char caracter = (char)numByte;
		
		
		//CASTING IMPLÍCITO: BYTE => BOOLEAN
		//int int2 = flag1;
		
		System.out.println("CASTING EXPLÍCITO: BYTE => INT es "+ numInt);
		System.out.println("CASTING EXPLÍCITO: BYTE => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: BYTE => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: BYTE => FLOAT es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: BYTE => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: BYTE => CHAR es "+ caracter);
		
		
		
		
		
		
		
		
		
	}
}
