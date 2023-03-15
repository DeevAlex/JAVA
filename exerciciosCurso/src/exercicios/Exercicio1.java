package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um numero: ");
		num = e.nextInt();
	     int multiplo = 7;

	     if (num % multiplo == 0) {
	    	 System.out.printf("numero %d é multiplo de 7", num);
	    } else {
	    	 System.out.printf("numero %d não é multiplo de 7", num);
	    }
		
	}
	
}
