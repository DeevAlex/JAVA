package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		for (int i =0; i < notas.length; i++) {
			System.out.println("For 1: " + notas[i]);
		}
		
		for(double nota: notas) { // foreach
			System.out.println("For 2: " + nota);
		}
		
	}
	
}
