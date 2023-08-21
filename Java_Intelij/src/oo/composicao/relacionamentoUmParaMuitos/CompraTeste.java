package oo.composicao.relacionamentoUmParaMuitos;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();

        c1.cliente = "Alex";
        // garantindo a relação bidirecional
        c1.adicionarItem("RTX 4090 Ti", 1, 7406.99);
        c1.adicionarItem(new Item("Asus Tuf Gaming b420 plus II", 1, 579.99));
        c1.adicionarItem(new Item("Memoria Ram Kingstom 8GB 3200MHz", 2, 397.99));

        // c1.itens.add(new Item("RTX 4090 Ti", 1, 7406.99));
        // c1.itens.add(new Item("Asus Tuf Gaming b420 plus II", 1, 579.99));
        // c1.itens.add(new Item("Memoria Ram Kingstom 8GB 3200MHz", 2, 397.99));

        double total = c1.itens.get(0).compra.itens.get(1).compra.itens.get(2).compra.getValorTotal();

        System.out.println("Quantide de Itens: " + c1.itens.size());
        System.out.println("Valor total da compra: R$" + c1.getValorTotal());

        // só para mostar a relação bidirecional
        System.out.println("total é: R$" + total);

    }

}
