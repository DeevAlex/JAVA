package Lambdas;

// a classe Object é a mae de todas as classes dentro do java
public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        // super(); // pode chamar, pq todas as classes são filhas da classe Object (não necessaria mente precisa estar explicita)
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return this.nome + " - R$" + precoFinal;
    }
}
