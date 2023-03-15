package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String resp = "";
		int aux = 0, numero, aux2 = 0;
		while(!resp.equalsIgnoreCase("Nao") && !resp.equalsIgnoreCase("Não")) {
			System.out.println("Digite um numero");
			numero = e.nextInt();
			aux += numero;
			aux2++;
			System.out.println("Deseja continuar? (Sim) ou (Nao)");
			resp = e.next();
		}
		
		System.out.println(aux / aux2);
		
	}
	
}
