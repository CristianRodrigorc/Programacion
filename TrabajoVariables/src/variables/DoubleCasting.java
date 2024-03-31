package variables;

public class DoubleCasting {
	public static void main(String[] args) {
		double numDouble = 98;
		
		//CASTING EXPLÍCITO: DOUBLE => BYTE
		byte numByte = (byte)numDouble;
		
		//CASTING EXPLÍCITO: DOUBLE => LONG
		short numShort = (short)numDouble;
		
		//CASTING EXPLÍCITO: DOUBLE => SHORT
		int numInt = (int)numDouble;
		
		//CASTING EXPLÍCITO: DOUBLE => FLOAT
		long numLong = (long)numDouble;
		
		//CASTING EXPLÍCITO: DOUBLE => DOUBLE
		float numFloat = (float)numDouble;
		
		
		//CASTING EXPLÍCITO: DOUBLE => CHAR 
		char caracter = (char)numDouble;
		
		
		//CASTING  DOUBLE => BOOLEAN
		//int int2 = flag1;
		
		System.out.println("CASTING EXPLÍCITO: DOUBLE => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: DOUBLE => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => INT es "+ numInt);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => FLOAT es "+ numFloat);
		System.out.println("CASTING EXPLÍCITO: DOUBLE => CHAR es "+ caracter);
		
		
		
		
		
		
		
		
		
	}
}
