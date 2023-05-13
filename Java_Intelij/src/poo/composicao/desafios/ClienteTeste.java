package poo.composicao.desafios;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Jonas");

        Compra compra1 = new Compra();

        compra1.adicionarItem("RTX 4090 Ti", 7800, 1);
        compra1.adicionarItem(new Produto("Memoria RAM Kingstom 8GB 3200MHz", 120), 2);

        Compra compra2 = new Compra();

        compra2.adicionarItem("RTX 3060 Ti", 2900, 1);
        compra2.adicionarItem(new Produto("Memoria RAM Kingstom 8GB 3200MHz", 120), 2);

        c1.adicionarCompra(compra1);
        c1.adicionarCompra(compra2);

        System.out.println(c1.obterValorTotal());

    }

}
