package exercicios;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double valor1 = 5;
		double valor2 = 50;
		
		System.out.println("Tabuada de " + valor1 + " x " + valor2 + ":");
		
		for(double i = 0; i <= valor2; i++) {
			double resultado = valor1 * i;
			System.out.println(valor1 + " x " + i + " = " +resultado);
		}
		
	}
	
}
