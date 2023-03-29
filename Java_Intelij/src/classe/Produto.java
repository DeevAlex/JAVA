package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	
//	tipo precoComDesconto(...) {
//		return 	
//	}
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto() { // construtor padrão, sem parametros e se colocar void ele vira um metodo
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}
