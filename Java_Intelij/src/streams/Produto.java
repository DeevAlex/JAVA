package streams;

public class Produto {

    public Produto(String nomeProduto, double preco, double desconto, double valorFrete) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    final String nomeProduto;
    final double preco;
    final double desconto;
    final double valorFrete;

}
