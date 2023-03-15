package exercicios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		double num1, num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero");
		num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador");
		String operador = entrada.next();
		
		entrada.close();
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);

		
		
		
	}
	
}
