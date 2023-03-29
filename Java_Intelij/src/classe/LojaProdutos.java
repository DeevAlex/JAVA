package classe;

public class LojaProdutos {

	String produto;
	double preco;
	static double desconto = 0.25;
	
	LojaProdutos(String produtoInformado, double precoInformado) { // construtor, aqui você define as variaveis e o que vão ser atribuidas, mas coloque os dados no momento da instancia
		
		produto = produtoInformado;
		preco = precoInformado;

	}
	
	double desconto() {
		return preco * (1 - desconto);
	}
	
}
