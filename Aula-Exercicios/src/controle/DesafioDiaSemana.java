package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o dia da semana: ");
		String dia = entrada.next();
		entrada.close();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
				System.out.println("3");
		}else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if ("terça".equalsIgnoreCase(dia)) {
			System.out.println("7");
		} else {
			System.out.println("Escrava um dia da semana valido");
		}
		
		// usar a função de igualdade para string não o ==
		
	}
	
}
