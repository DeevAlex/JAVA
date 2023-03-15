package exercicios;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int numeros[];
		int n, i;
		
		System.out.println("Digite o tamanho do vetor");
		n = e.nextInt();
		numeros = new int[n];
		
		for(i = 0; i < n; i++) {
			
			System.out.println("Digite o " + (i + 1) + " numero: ");
			numeros[i] = e.nextInt();
			
		}
		
		for(i = 0; i < n; i++) {
			System.out.println(numeros[i]);
		}

		
	}
	
}
