package operadores;

import java.util.Scanner;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // a = a + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		// System.err.println("a " + ++a + " b " + b--);
		System.out.println(++a == b--);
		System.out.println(a == b);
		
		// ver();
		ver2();
		
	}
	
	public static void ver() {
		
		// Scanner entrada = new Scanner(System.in);
		// System.out.println("Digite da hora: ");
		// int horas = entrada.nextInt();
		// System.out.println("Digite alguns minutos: ");
		// int minutos = entrada.nextInt();
		// entrada.close();
		
		// int calculo = horas * 60 + minutos;
		
		// System.out.println(calculo + " minutos");
		
	}
	
	public static void ver2() {
		
			// 2
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			double num1 = entrada.nextDouble();
			System.out.println("Digite um outro numero: ");
			double num2 = entrada.nextDouble();
			System.out.println("Digite um operador: ");
			String caracter = entrada.next();
			
			switch(caracter) {
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				case "/":
					System.out.println(num1 / num2);
					break;
			}
		}
	
}
