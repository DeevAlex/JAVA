package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = (n -> n + 2);
        UnaryOperator<Integer> vezesDois = (n -> n * 2);
        UnaryOperator<Integer> aoQuadrado = (n -> n * n);

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0)); // esse andThen é depois de executar
        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0)); // esse compose é antes de executar

    }

}
