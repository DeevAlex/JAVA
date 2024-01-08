package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        // Exercicio 1 de reduce

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (acumulador, numeroAtual) -> acumulador + numeroAtual;

        // aqui podemos colocar o parallelStream porque não passamos um valor inicial
        Integer total1 = numeros.stream().reduce(soma).get();

        System.out.println(total1); // valor final 45

        // nas chamadas paralelas sempre vai ter um valor inicial independente, para cada chamada vai passar um valor inicial e o valor inicial vai ser condiderado varias vezes
        Integer total2 = numeros.parallelStream().reduce(100, soma); // primeiro parametro é o valor inicial, nesse caso não usamos o .get() porque já definimos o valor inicial que é um inteiro, valor final 945
        // Integer total2 = numeros.stream().reduce(100, soma); // vai considerar apenas uma vez o valor independente, valor final 145
        System.out.println(total2);

        // Resultado foi um Opcional<Integer>...
        numeros.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println); // se o resultado estiver presente vai chamar a função que estiver no ifPresent, se não estiver não faz nada

    }

}
