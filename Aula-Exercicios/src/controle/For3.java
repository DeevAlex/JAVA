package controle;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;

import exercicios.Console;

public class For3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valor = 0, valorSomado = 0, qtNegativo = 0, qtPositivo = 0;
		String c = "Sim";
		
		while(c.equalsIgnoreCase("Sim")) {
			
			System.out.println("Digite um numero: ");
			valor = entrada.nextInt();
			
			System.out.println("Desja continuar?");
			c = entrada.next();

			if (valor < 0) {
				qtNegativo++;
			} else {
				qtPositivo++;
			}
			
		}
		
		System.out.println("Numeros Positivos: " + qtPositivo);
		System.out.println("Numeros Positivos: " + qtNegativo);
		
	}
	
}
