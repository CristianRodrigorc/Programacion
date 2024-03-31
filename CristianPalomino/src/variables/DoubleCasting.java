package variables;

public class DoubleCasting {
	public static void main(String[] args) {
		double numDouble = 98;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => BYTE
		byte numByte = (byte)numDouble;
		
		//CASTING IMPLÍCITO: INT => LONG
		short numShort = (short)numDouble;
		
		//CASTING EXPLÍCITO: INT => SHORT
		int numInt = (int)numDouble;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		long numLong = (long)numDouble;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		float numFloat = (float)numDouble;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numDouble;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//boolean flag1 = numDouble;
		
		System.out.println("CASTING EXPLÍCITO: DOUBLE => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: DOUBLE => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => INT es "+ numInt);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: DOUBLE => FLOAT es "+ numFloat);
		System.out.println("CASTING EXPLÍCITO: DOUBLE => CHAR es "+ caracter);
		System.out.println("CASTING EXPLÍCITO: DOUBLE => BOOLEAN no se puede hacer casting");
		
		
		
		
		
		
		
		
	}
}
