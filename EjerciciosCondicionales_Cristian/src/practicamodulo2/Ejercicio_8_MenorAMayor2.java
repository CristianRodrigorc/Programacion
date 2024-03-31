package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_8_MenorAMayor2 {
	public static void main(String[] args) {
		Scanner vc = new Scanner(System.in);
		System.out.println("ingresa el primer valor");
		int a = vc.nextInt();
		
		System.out.println("ingresa el segundo valor");
		int b = vc.nextInt();
		
		System.out.println("ingresa el tercer valor");
		int c = vc.nextInt();
		
	
		
		System.out.println("el menor de los números es");
		
		if(a<=b && b<=c) 
		{
			System.out.println(a);
			
		}else if(a<=c && c<=b)
		{
			System.out.println(a);
			
		}else if(b<=a && a<=c)
		{
			System.out.println(b);
			
		}else if(b<=c && c<=a)
		{
			System.out.println(b);
			
		}else if(c<=a && a<=b) 
		{
			System.out.println(c);
			
		}else 
		{
			System.out.println(c);
		}
		
	System.out.println("el mayor de los números es");
	
	if(a>=b && b>=c) 
	{
		System.out.println(a);
		
	}else if(a>=c && c>=b)
	{
		System.out.println(a);
		
	}else if(b>=a && a>=c)
	{
		System.out.println(b);
		
	}else if(b>=c && c>=a)
	{
		System.out.println(b);
		
	}else if(c>=a && a>=b) 
	{
		System.out.println(c);
		
	}else 
	{
		System.out.println(c);
	}
	
	
	System.out.println("Los números ordenados de mayor a menor son ");	
	if(a>=b && b>=c)
	{
		System.out.println(" "+a+" "+b+" "+c+" ");
		
	}else if(a>=c && c>=b)
	{
		System.out.println(" "+a+" "+c+" "+b+" ");
		
	}else if(b>=a && a>=c)
	{
		System.out.println(" "+b+" "+a+" "+c+" ");
		
	}else if(b>=c && c>=a)
	{
		System.out.println(" "+b+" "+c+" "+a+" ");
		
	}else if(c>=a && a>=b) 
	{
		System.out.println(" "+c+" "+a+" "+b+" ");
		
	}else 
	{
		System.out.println(" "+c+" "+b+" "+a+" ");
	}
	
	
	System.out.println("Los números ordenados de menor a mayor son");
	if(a<=b && b<=c)
	{
		System.out.println(" "+a+" "+b+" "+c+" ");
		
	}else if(a<=c && c<=b)
	{
		System.out.println(" "+a+" "+c+" "+b+" ");
		
	}else if(b<=a && a<=c)
	{
		System.out.println(" "+b+" "+a+" "+c+" ");
		
	}else if(b<=c && c<=a)
	{
		System.out.println(" "+b+" "+c+" "+a+" ");
		
	}else if(c<=a && a<=b) 
	{
		System.out.println(" "+c+" "+a+" "+b+" ");
		
	}else 
	{
		System.out.println(" "+c+" "+b+" "+a+" ");
	}
	
	
	}
}
//a>b>c
//a>c>b
//b>a>c
//b>c>a
//c>a>b
//c>b>a