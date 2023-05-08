package poo.composicao.relacionamentoUmParaMuitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this; // associando essa compra ao item
    }

    // metodo para não precisar instanciar na classe main
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal() {
        double total = 0;

        for(Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }

}
