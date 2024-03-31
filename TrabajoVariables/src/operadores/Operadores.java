package operadores;

public class Operadores {
	public static void main(String[] args) {
		int num = 4;
		System.out.println("creacion variable: "+num);
		
		
		num = num+1;
		num = num++;
		System.out.println("++: "+num);
		
		num = num-1;
		num = num--;
		System.out.println("--: "+num);
	}

}
