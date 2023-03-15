package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		int tamanhoDoArray = 0, colocarNumerosDentroDeArray;
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Escreva o tamanho do array");
		tamanhoDoArray = e.nextInt();
		
		int[] a = new int [tamanhoDoArray];
		
		for(int i = 0; i < tamanhoDoArray; i++) {
			
			System.out.println("Digite um numero");
			colocarNumerosDentroDeArray = e.nextInt();
			a[i] = colocarNumerosDentroDeArray;
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
}
