package exercicios;

import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double bandeira, mastro, comprimento, c = 0, c2 = 0, c3 = 0;
		String continuar = "";
		
		while(!continuar.equalsIgnoreCase("Nao")) {
			
			System.out.println("Digite o altura do mastro: ");
			mastro = e.nextDouble();
			
			System.out.println("Digite o altura da bandeira: ");
			bandeira = e.nextDouble();
			
			System.out.println("Digite o comprimento da bandeira: ");
			comprimento = e.nextDouble();
			
			if (comprimento == 0 && mastro == 0 && bandeira == 0) {
				System.out.println("Digite algum parametro! Altura da bandeira, Comprimento da Bandeira ou Altura do mastro");
				return;
			}
			
			if (bandeira == 0 && mastro == 0) {
				mastro = comprimento * 5;
				bandeira = mastro / 7;
				System.out.println("\n" + "O mastro terá: " + mastro + " a bandeira terá: " + bandeira + " e o comprimento: " + comprimento + "\n");
			}
			
			if (comprimento == 0 && mastro == 0) {
				mastro = bandeira * 7;
				comprimento = mastro / 5;
				System.out.println("\n" + "O mastro terá: " + mastro + " o comprimento será: " + comprimento + " e a bandeira terá: " + bandeira + "\n");
			}
			
			if (bandeira == 0 && comprimento == 0) {
				bandeira = mastro / 7;
				comprimento = mastro / 5;
				System.out.println("\n" + "O mastro terá: " + mastro + " a altura da bandeira será: " + bandeira + " e o comprimento: " + comprimento + "\n");
			}
			
			if (bandeira == 0) {
				bandeira = mastro / 7;
				System.out.println("\n" + "O mastro terá: " + mastro + " o comprimento será: " + comprimento + " e a bandeira terá: " + bandeira + "\n");
			}
			
			if (mastro == 0) {
				mastro = bandeira * 7;
				System.out.println("\n" + "O mastro terá: " + mastro + " a altura da bandeira será: " + bandeira + " e o comprimento: " + comprimento + "\n");
			}
			
			if (comprimento == 0) {
				comprimento = mastro / 5;
				System.out.println("\n" + "O mastro terá: " + mastro + " a altura da bandeira será: " + bandeira + " e o comprimento: " + comprimento + "\n");
			}
		
			
			// Mastro / 7 - para descobrir o altura da bandeira
			// Mastro / 5 - para descobrir o comprimento maximo da bandeira
			// Comprimento * 5 - para descobrir a altura do mastro
			// bandeira * 7 - para descobrir a altura do mastr
			
			
			System.out.println("Deseja continuar?");
			continuar = e.next();
			
			
			
			
		}
		
		
	}
	
}
