package variables;

public class LongCasting {
	public static void main(String[] args) {
		long numLong = 2;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => BYTE
		byte numByte = (byte)numLong;
		
		//CASTING IMPLÍCITO: INT => LONG
		short numShort = (short)numLong;
		
		//CASTING EXPLÍCITO: INT => SHORT
		int numInt = (int)numLong;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		float numFloat = numLong;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = numLong;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numLong;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//boolean flag1 = numLong;
		
		System.out.println("CASTING EXPLÍCITO: LONG => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: LONG => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: LONG => INT es "+ numInt);
		System.out.println("CASTING IMPLÍCITO: LONG => FLOAT es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: LONG => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: LONG => CHAR es "+ caracter);
		System.out.println("CASTING EXPLÍCITO: LONG => BOOLEAN no se puede hacer casting");
		
		
		
		
		
		
		
		
	}
}
