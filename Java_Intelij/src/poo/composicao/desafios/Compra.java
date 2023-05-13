package poo.composicao.desafios;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> items = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.items.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        this.items.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item : items) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}
