package exercicios;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		int valor, aux = 0, valor2, resultado = 0;
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Maçãs: ");
		valor = e.nextInt();
		
		while (aux < valor) {
			
			System.out.println("Digite o valor de cada maçã: ");
			valor2 = e.nextInt();
			resultado += valor2;
			
			aux++;
			
		}
		
		System.out.println(resultado);
		
		
	}
	
}
