package exercicios;

import java.util.Scanner;

public class ExecutaClass {

	public static void main(String[] args) {
		
		String marca, fabricante, codigoBarras, nome;
		float preco;
		Scanner e1 = new Scanner(System.in);
		
		// ------------------------------------------------
		
		System.out.println("Digite o nome da marca: ");
		marca = e1.nextLine();
		
		System.out.println("Digite o fabricante: ");
		fabricante = e1.nextLine();
		
		System.out.println("Digite o codigo de barras: ");
		codigoBarras = e1.nextLine();
		
		System.out.println("Digite o preco: ");
		preco = e1.nextFloat();
		
		Produto p = new Produto(marca, fabricante, codigoBarras, preco);
		
		System.out.println(p.marca);
		System.out.println(p.fabricante);
		System.out.println(p.cod_barras);
		System.out.println(p.preco);
		
		// --------------------------------------------------
		
		System.out.println("Digite o seu nome:");
		nome = e1.next();
		
		Paciente pa = new Paciente(nome);
		
		System.out.println(pa.nome);
		
		
		
	}
	
}
