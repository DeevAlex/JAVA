package exercicios;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(0));
		
		String s = "Boa Noite";
		s = s.toUpperCase();
		s = "Bom dia";
		System.out.println(s.concat(", Alex"));
		System.out.println(s + (", Alex"));
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		System.out.println(s.toLowerCase().equals("Boa Noite"));
		System.out.println(s.equalsIgnoreCase("Boa Noite"));
		
		var nome = "Joelson";
		var sobrenome = "Caldeira Silveira";
		var idade = 18;
		double salario = 0;
		
		// System.out.println("Nome: " + nome + " sobrenome: " + sobrenome + " idade: " + idade + " salario: " + salario);
		
		// System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("e"));
		System.out.println("Frase qualquer".indexOf("f"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
	
}
