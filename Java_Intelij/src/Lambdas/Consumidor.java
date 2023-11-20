package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        // O consumer ele consome algo e não retorna nada

        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome + "!");

        Produto p1 = new Produto("Caneta Azul", 12.34, 0.09);

        imprimirNome.accept(p1);

        System.out.println("");

        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.94, 0.03);
        Produto p4 = new Produto("Borracha", 7.84, 0.18);
        Produto p5 = new Produto("Lapis", 4.34, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome); // como o forEach já recebe um consumer ele não precisa colocar o accept
        System.out.println("");
        produtos.forEach(produto -> System.out.println("Preço: R$" + produto.preco));
        System.out.println("");
        produtos.forEach(System.out::println); // devemos sobreescrever o metodo toString porque ele vai vir como o 'Lambdas.Produto@312b1dae', como queremos o nome coloque no toString para retornar o nome

    }

}
