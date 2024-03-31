package variables;

public class FloatCasting {
	public static void main(String[] args) {
		float numFloat = 88;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => BYTE
		byte numByte = (byte)numFloat;
		
		//CASTING IMPLÍCITO: INT => LONG
		short numShort = (short)numFloat;
		
		//CASTING EXPLÍCITO: INT => SHORT
		int numInt = (int)numFloat;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		long numLong = (long)numFloat;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = numFloat;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numFloat;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//int int2 = flag1;
		
		System.out.println("CASTING EXPLÍCITO: FLOAT => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: FLOAT => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: FLOAT => INT es "+ numInt);
		System.out.println("CASTING IMPLÍCITO: FLOAT => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: FLOAT => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: FLOAT => CHAR es "+ caracter);
		
		
		
		
		
		
		
		
		
	}
}
