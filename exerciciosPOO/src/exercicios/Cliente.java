package exercicios;

public class Cliente {
	
	String nome;
	int idade = 18;
	boolean desconto;
	
	boolean PossuiDesconto() {
		
		if (desconto) {
			return desconto;
		} else {
			return false;
		}

	}
	
}
