package Lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        // definimos no generic o parametro de entrada como Integer e a saida String
        Function<Integer, String> parOuImpar = (numero -> numero % 2 == 0 ? "Par" : "Impar");

        Function<String, String> oResultadoE = (valor -> "O resultado é: " + valor);

        Function<String, String> empolgado = (valor -> valor + "!!!");

        Function<String, String> duvida = (valor -> valor + "???");

        System.out.println(parOuImpar.apply(5));
        System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(4)); // depois que terminar a primeira ai então executa a segunda, o ultimo generics tem que ser o mesmo da função que a gente quer que seja executada apos a finalização
        System.out.println(parOuImpar.andThen(oResultadoE).andThen(duvida).apply(8)); // depois que terminar a primeira ai então executa a segunda, o ultimo generics tem que ser o mesmo da função que a gente quer que seja executada apos a finalização

        // composições de funções é a junção de uma função pequena sendo realizadas uma apos a outra que resultara no que nos queremos

        // System.out.println(oResultadoE.apply(parOuImpar.apply(1)));

    }

}
