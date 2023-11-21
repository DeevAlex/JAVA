package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = ((n1, n2) -> (n1 + n2) / 2);

        double nota1 = 9.0;
        double nota2 = 4.0;

        System.out.println("Nota: " + media.apply(nota1, nota2));

        BiFunction<Double, Double, String> resultado = ((n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado");

        System.out.println("Estado: " + resultado.apply(nota1, nota2));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(nota1, nota2)); // usando composição de funções

    }

}
