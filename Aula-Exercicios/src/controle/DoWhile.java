package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String palavra = "";
		
		do {
			System.out.println("Voce precisa falar a palavra chave");
			palavra = entrada.nextLine();
		} while (!palavra.equalsIgnoreCase("Sair"));

		System.out.println("Saiu");
		entrada.close();


		
	}
	
}
