package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        // NÂO: int -> Double

        // literal (não pode colocar o numero assim na classe Double, pois ele é um literal, o certo é colocar <numero>d ou <numero>.<numero>):
        // Double a = 1;

        // double -> Double

        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };

        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x, y) -> x * y;

        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };

        System.out.println(calculo2.apply(2, 3));

    }

}
