
package exercicios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu 1º salario: ");
		double salario1 = entrada.nextDouble();
		System.out.println("Digite seu 2º salario: ");
		double salario2 = entrada.nextDouble();
		System.out.println("Digite seu 3º salario: ");
		double salario3 = entrada.nextDouble();
		
		double media = (salario1 + salario2 + salario3) / 3 ;
		
		System.out.println(media);
		
	}
	
}
