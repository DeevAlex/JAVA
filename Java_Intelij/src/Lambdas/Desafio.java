package Lambdas;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
        * 1. A partir do produto, calcular o preço real (com desconto);
        * 2. Imposto Municipal : >= 2500 (8.5%) / < 2500 (Isento);
        * 3. Frete: >= 3000 (100) / < 3000 (50);
        * 4. Arredondar: Deixar duas casas decimais;
        * 5. Formatar: R$1234,56;
        */

        // como eu fiz:
        // Function<Produto, Double> procoReal = (prod -> prod.preco * (1 - prod.desconto));
        // Function<Double, Double> precoImposto = (preco -> preco >= 2500 ? preco * (1 + 0.085) : preco);
        // Function<Double, Double> precoFrete = (preco -> preco >= 3000 ? preco + 100 : preco + 50);

        // System.out.printf("R$%.2f", procoReal.andThen(precoImposto).andThen(precoFrete).apply(p));

        // resolução do curso:

        Function<Produto, Double> precoFinal = (produto -> produto.preco * (1 - produto.desconto));
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        System.out.println("O preço final é " + precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));

        String saldo = "1000.0";

        String[] saldoQuebrado = saldo.split("", 6);
        
        for (int i = 0; i < saldo.length(); i++) {

            String s = saldoQuebrado[i].equalsIgnoreCase(".") ? saldoQuebrado[i].replace(".", ",") : "Não";
        }

        System.out.println(Arrays.toString(saldo.split("", 6)));

    }

}
