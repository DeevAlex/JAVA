package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		// criando objeto
		
		Produto p1 = new Produto("NoteBook"); // se o construtor estiver com um parametro tem q colocar algo aq
		// p1.nome = "NoteBook";
		p1.preco = 4358.89;
		p1.desconto = p1.precoComDesconto(); // chamando o metodo com os (), sem () está chamando um atributo		
		
		var p2 = new Produto("Caneta Azul", 12.50); // sem passar nenhum parametro, mas tem q criar um construtor vazio
		// p2.nome = "Caneta Azul";
		// p2.preco = 7.85;
		p2.desconto = p2.precoComDesconto(0.1);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p2.preco);
	}
	
}
