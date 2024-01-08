package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("SmartWacth", 501.0, 0.31, 0);
        Produto p2 = new Produto("Caneta", 5.0, 0.3, 1.5);
        Produto p3 = new Produto("Notebook", 4899.89, 0.32, 0);
        Produto p4 = new Produto("Caderno", 30.0, 0.45, 0);
        Produto p5 = new Produto("Impressora", 5.0, 0.40, 0);
        Produto p6 = new Produto("Ipad", 3100.0, 0.29, 0);
        Produto p7 = new Produto("Monitor", 800, 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);


        Predicate<Produto> superPromocao = produto -> produto.desconto >= 0.3;
        Predicate<Produto> freteGratis = produto -> produto.valorFrete == 0;
        Predicate<Produto> produtoRelevante = produto -> produto.preco >= 500;

        Function<Produto, String> chamadaPromocional = produto -> "Aproveite! " + produto.nomeProduto + " pro R$" + produto.preco;

        // Filter, Filter, mao
        produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(System.out::println);

    }

}
