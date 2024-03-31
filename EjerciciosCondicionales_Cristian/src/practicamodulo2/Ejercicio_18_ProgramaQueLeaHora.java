package practicamodulo2;

import java.util.Scanner;

public class Ejercicio_18_ProgramaQueLeaHora {
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.println("Indica las horas");
		int hora = vc.nextInt();
		System.out.println("Indica los minutos");
		int minutos = vc.nextInt();
		System.out.println("indica los segundos");
		int segundos = vc.nextInt();
		
		
		if (segundos >= 60) {
            segundos -= 60;
            minutos += 1;
            if (minutos >= 60) {
                minutos -= 60;
                hora += 1;
                if (hora >= 24) {
                    hora = 0;
                		}
            	}
        }
		int segundosmas = segundos+50;
		if (segundosmas >= 60) {
            segundosmas -= 60;
            minutos += 1;
            if (minutos >= 60) {
                minutos -= 60;
                hora += 1;
                if (hora >= 24) {
                    hora = 0;
                		}
            	}
        }
		System.out.println("La hora 50 segundos después es "+ hora+":"+minutos+":"+segundosmas);
		
		
	}
}
