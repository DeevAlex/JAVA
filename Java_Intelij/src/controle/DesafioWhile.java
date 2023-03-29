package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeNotas =0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			
			System.out.println("Digita a nota");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			}
			
			
		}
		
		double media = total / quantidadeNotas;

		System.out.printf("Media %.2f", media);
		
		entrada.close();

		
	}
	
}
