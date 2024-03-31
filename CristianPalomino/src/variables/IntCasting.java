package variables;

public class IntCasting {
	public static void main(String[] args) {
		int numInt = 6;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => BYTE
		byte numByte = (byte)numInt;
		
		//CASTING EXPLÍCITO: INT => SHORT
		short numShort = (short) numInt;
		
		//CASTING IMPLÍCITO: INT => LONG
		long numLong = numInt;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		float numFloat = numInt;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = numInt;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numInt;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//boolean flag1 = numInt;
		
		System.out.println("CASTING EXPLÍCITO: INT => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: INT => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: INT => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: INT => FLOAT es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: INT => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: INT => CHAR es "+ caracter);
		System.out.println("CASTING EXPLÍCITO: INT => BOOLEAN no se puede hacer casting");
		
		
		
		
		
		
		
		
	}
}
