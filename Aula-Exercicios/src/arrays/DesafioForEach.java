package arrays;

import java.util.Scanner;

public class DesafioForEach {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite o numero de notas que deseja informar: ");
		int qtdnotas = e.nextInt();
		
		double[] notas = new double[qtdnotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + " nota: ");
			notas[i] = e.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = (total / notas.length);
		System.out.println("A média é: " + media);
		
		e.close();
		
	}
	
}
