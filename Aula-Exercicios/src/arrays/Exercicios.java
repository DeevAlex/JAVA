package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicios {

	public static void main(String[] args) {
		
		double[] notas = new double[5];
		int totalA = 0, totalB = 0;
		
		notas[0] = 3;
		notas[1] = 8.5;
		notas[2] = 7;
		notas[3] = 10;
		notas[4] = 9;
		 
		System.out.println(Arrays.toString(notas) + "\n");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("indice: " + i + " - " + (notas[i]));
			totalA += notas[i];
		}
		
		System.out.println("\n" + "Media: " + totalA / notas.length + "\n");
		
		// desse jeito é declarando os indices de forma literal
		double [] notasB = { 7.5, 4.2, 9.0, 1 }; 
		
		for (int i = 0; i < notasB.length; i++) {
			System.out.println("indice: " + i + " - " + (notasB[i]));
			totalB += notasB[i];
		}
		
		
		System.out.println("\n" + "Media: " + totalB / notasB.length + "\n");
		
	}
	
}
