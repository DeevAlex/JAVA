package operadores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(9 != 9);
		
		double nota = 4.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto =true;
		
		System.out.println("Possui desconto: " + temDesconto);
		
		
		double n, area, raio;
		n = 3.14159;
		raio = (double) 2.00;
		area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%f", area);
		
		
		
		Scanner e = new Scanner(System.in);
        double a1, b1, media;
        a1 = (double) e.nextDouble();
        b1 = (double) e.nextDouble();
        
        media = (a1 + b1) / 2;

        System.out.printf("MEDIA = %.5f\n", media);
		
 
		
	}
	
}
