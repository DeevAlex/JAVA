package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double A, B, C, AUX, pi;
		
		A = e.nextDouble();
		B = e.nextDouble();
		C = e.nextDouble();
		
		AUX = (A * C) / 2;	
		System.out.printf("TRIANGULO %.3f\n", AUX);
		AUX = pi = 3.14159 * Math.pow(C, 2);
		System.out.printf("CIRCULO %.3f\n", AUX);
		AUX = ((A + B) * C) / 2;
		System.out.printf("TRAPEZIO: %.3f\n", AUX);
		AUX = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f\n", AUX);
		AUX = A * B;
		System.out.printf("RETANGULO: %.3f\n", AUX);


		
	}
	
}
