package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = (num -> num % 2 == 0);
        Predicate<Integer> isTresDigitos = (num -> num >= 100 && num <= 999);

        System.out.println(isPar.and(isTresDigitos).negate().test(123)); // o and e o negate são o && e o ! na verificação por exemplo do if
        System.out.println(isPar.or(isTresDigitos).test(123)); // o and e o negate são o && , ! e o || na verificação por exemplo do if


    }

}
