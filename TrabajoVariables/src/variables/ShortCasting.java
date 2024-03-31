package variables;

public class ShortCasting {
	public static void main(String[] args) {
		short numShort = 11;
		boolean flag1 = true;
		
		//CASTING EXPLÍCITO: INT => BYTE
		byte numByte = (byte)numShort;
		
		//CASTING EXPLÍCITO: INT => SHORT
		int numInt = numShort;
		
		//CASTING IMPLÍCITO: INT => LONG
		long numLong = numShort;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		float numFloat = numShort;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = numShort;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numShort;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//int int2 = flag1;
		
		System.out.println("CASTING EXPLÍCITO: SHORT => BYTE es "+ numByte );
		System.out.println("CASTING EXPLÍCITO: SHORT => INT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: SHORT => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: SHORT => FLOAT es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: SHORT => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: SHORT => CHAR es "+ caracter);
		
		
		
		
		
		
		
		
		
	}
}
