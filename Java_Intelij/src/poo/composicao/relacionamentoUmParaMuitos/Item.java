package poo.composicao.relacionamentoUmParaMuitos;

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra; // relacionamento bidirecional

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

}
