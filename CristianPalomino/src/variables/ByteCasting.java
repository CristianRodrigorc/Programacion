package variables;

public class ByteCasting {
	public static void main(String[] args) {
		byte numByte = 4;
		boolean flag1 = true;
		
		//CASTING IMPLICITO: INT => BYTE
		int numInt = numByte;
		
		//CASTING EXPLÍCITO: INT => SHORT
		short numShort = numByte;
		
		//CASTING IMPLÍCITO: INT => LONG
		long numLong = numByte;
		
		//CASTING IMPLÍCITO: INT => FLOAT
		float numFloat = numByte;
		
		//CASTING IMPLÍCITO: INT => DOUBLE
		double numDouble = numByte;
		
		
		//CASTING EXPLÍCITO: INT => CHAR 
		char caracter = (char)numByte;
		
		
		//CASTING IMPLÍCITO: INT => BOOLEAN
		//boolean flag1 = numByte;
		
		System.out.println("CASTING EXPLÍCITO: BYTE => INT es "+ numInt);
		System.out.println("CASTING EXPLÍCITO: BYTE => SHORT es "+ numShort);
		System.out.println("CASTING IMPLÍCITO: BYTE => LONG es "+ numLong);
		System.out.println("CASTING IMPLÍCITO: BYTE => FLOAT es "+ numFloat);
		System.out.println("CASTING IMPLÍCITO: BYTE => DOUBLE es "+ numDouble);
		System.out.println("CASTING EXPLÍCITO: BYTE => CHAR es "+ caracter);
		System.out.println("CASTING EXPLÍCITO: BYTE => BOOLEAN no se puede hacer casting");
		
		
		
		
		
		
		
		
	}
}
