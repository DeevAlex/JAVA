package oo.composicao.desafios;

public class Item {

    final int quantidade;
    final Produto produto;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
